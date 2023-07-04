package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.MyController;
import model.MyModel;

public class MyView extends JFrame{
    MyModel md= new MyModel();
    JTextArea textArea;
    JTextField keyArea;
    JLabel resLabel;

    public MyView(){
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setSize(400, 400);
        this.setTitle("Thống kê");
        this.setLocationRelativeTo(rootPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setLayout(new GridLayout(3,1,20,20));
        this.setLayout(new BorderLayout(10, 10));
        Font font= new Font(Font.SERIF, Font.BOLD, 20);

        JPanel textPanel= new JPanel();
        textPanel.setLayout(new BorderLayout(10,10));
        JLabel textLabel= new JLabel("Văn bản");
        textArea= new JTextArea(100,100);
        JScrollPane textScroll= new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        textPanel.add(textLabel,BorderLayout.NORTH);
        textPanel.add(textScroll,BorderLayout.CENTER);
        
        JPanel keyPanel= new JPanel();
        keyPanel.setLayout(new BorderLayout(10,10));
        JLabel keyLabel= new JLabel("Từ khóa");
        keyArea= new JTextField();
        keyPanel.add(keyLabel,BorderLayout.NORTH);
        keyPanel.add(keyArea,BorderLayout.CENTER);

        JPanel TextAndKey= new JPanel();
        TextAndKey.setLayout(new GridLayout(2, 1,10,10));
        TextAndKey.add(textPanel);
        TextAndKey.add(keyPanel);
        this.add(TextAndKey,BorderLayout.CENTER);
        
        JPanel buttonPanel= new JPanel();
        buttonPanel.setLayout(new FlowLayout(0,20,10));
        JButton button= new JButton("Thống kê");
        ActionListener mc= new MyController(this);
        button.addActionListener(mc);
        button.setFont(font);
        button.setForeground(Color.WHITE);
        button.setSize(50, 10);
        button.setBackground(Color.BLACK);
        button.setBorderPainted(false);
        button.setOpaque(true);

        resLabel= new JLabel();
        buttonPanel.add(button);
        buttonPanel.add(resLabel);
        this.add(buttonPanel,BorderLayout.SOUTH);
        
    }
    public void printRes(){
        this.md.setText(this.textArea.getText());
        this.md.setKey(this.keyArea.getText());
        this.md.Search();
        this.resLabel.setText("Kết quả: Có "+this.md.getResult()+" từ "+this.md.getKey());
    }
}
