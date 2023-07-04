package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorController;

// import model.MyColorModel;

public class MyColorView extends JFrame{
    // private MyColorModel cm;
    private JLabel text;

    public MyColorView(){
        // this.cm= new MyColorModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Change Color");
        this.setSize(700, 400);
        this.setLocationRelativeTo(rootPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font font= new Font(Font.MONOSPACED, NORMAL, 18);
        MyColorController cct= new MyColorController(this);

        text=new JLabel("Hello, world!",JLabel.CENTER);
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(2,3));
        text.setFont(font);

        JButton red= new JButton("RED TEXT");
        red.setFont(font);
        red.setForeground(Color.RED);
        red.addActionListener(cct);

        JButton yellow= new JButton("YELLOW TEXT");
        yellow.setFont(font);
        yellow.setForeground(Color.YELLOW);
        yellow.addActionListener(cct);

        JButton green= new JButton("GREEN TEXT");
        green.setFont(font);
        green.setForeground(Color.GREEN);
        green.addActionListener(cct);
        
        JButton red_bg= new JButton("RED BACKGROUND");
        red_bg.setFont(font);
        red_bg.setBackground(Color.RED);
        red_bg.setBorderPainted(false);
        red_bg.setOpaque(true);
        red_bg.addActionListener(cct);

        JButton yellow_bg= new JButton("YELLOW BACKGROUND");
        yellow_bg.setFont(font);
        yellow_bg.setBackground(Color.YELLOW);
        yellow_bg.setBorderPainted(false);
        yellow_bg.setOpaque(true);
        yellow_bg.addActionListener(cct);

        JButton green_bg= new JButton("GREEN BACKGROUND");
        green_bg.setFont(font);
        green_bg.setBackground(Color.GREEN);
        green_bg.setBorderPainted(false);
        green_bg.setOpaque(true);
        green_bg.addActionListener(cct);
        
        panel.add(red);
        panel.add(yellow);
        panel.add(green);
        panel.add(red_bg);
        panel.add(yellow_bg);
        panel.add(green_bg);
        

        this.setLayout(new BorderLayout());
        this.add(text,BorderLayout.NORTH);
        this.add(panel,BorderLayout.CENTER);

    }
    public void changeColor(Color t){
        this.text.setForeground(t);
    }
    public void changeBackground(Color t){
        this.text.setBackground(t);
        this.text.setOpaque(true);
    }
    // public static void main(String[] args) {
    //     MyColorView mcv= new MyColorView();
            
    //     }
}
