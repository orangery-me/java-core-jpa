package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ButtonController;
import model.LastButtonModel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class ButtonView extends JFrame{
    LastButtonModel lastButtonModel;
    JButton button1= new JButton("1");
    JButton button2= new JButton("2");
    JButton button3= new JButton("3");
    JButton button4= new JButton("4");
    JLabel label;

    public ButtonView() {
        lastButtonModel= new LastButtonModel(1);
        this.init();
        this.setVisible(true);
    }

    public void init(){
        this.setTitle("Last button");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(rootPane);
        // Tao ra cac button va chinh font
        Font font= new Font(Font.SANS_SERIF, NORMAL, 18);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        // Them buttons vao panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2) );
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        // Tao listener
        ActionListener listener= new ButtonController(this);
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);

        // Tao label va them label vao panel2
        JPanel panel2= new JPanel();
        label= new JLabel("------", JLabel.CENTER);
        label.setFont(font);
        panel2.add(label);

        // them panel va panel2 vao button view
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);
    }

    public void setLastButtonValue(int value){
        this.lastButtonModel.setValue(value);
        label.setText("Last button pressed was no. "+this.lastButtonModel.getValue());
        
    }
}
