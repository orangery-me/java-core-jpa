import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class Calculator extends JFrame {
    public Calculator(){
        this.setTitle("My Calculator");
        this.setSize(400, 500);
        this.setLocationRelativeTo(rootPane);

        JTextField text= new JTextField();
        JPanel head= new JPanel();
        head.setLayout(new BorderLayout());
        head.add(text, BorderLayout.CENTER);

        JButton b0= new JButton("0");
        JButton b1= new JButton("1");
        JButton b2= new JButton("2");
        JButton b3= new JButton("3");
        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");
        JButton b7= new JButton("7");
        JButton b8= new JButton("8");
        JButton b9= new JButton("9");
        JButton bc = new JButton("+");
        JButton bt = new JButton("-");
        JButton bn = new JButton("x");
        JButton bch = new JButton("/");
        JButton bb = new JButton("=");
        JPanel button= new JPanel();
        button.setLayout(new GridLayout(5, 3));
        button.add(head);
        button.add(b1);
        button.add(b2);
        button.add(b3);
        button.add(b4);
        button.add(b5);
        button.add(b6);
        button.add(b7);
        button.add(b8);
        button.add(b9);
        button.add(b0);
        button.add(bc);
        button.add(bt);
        button.add(bn);
        button.add(bch);
        button.add(bb);

        this.add(head, BorderLayout.NORTH);
        this.add(button, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) throws Exception {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // UIManager.setLookAndFeel("javax.swing.plaf.basic");
            Calculator mycal= new Calculator();
            // mycal.getContentPane().setBackground(Color.RED);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
