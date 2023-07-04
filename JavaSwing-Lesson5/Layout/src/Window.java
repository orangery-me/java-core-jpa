import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Window extends JFrame {
    public Window(){
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    public void openWindow(String title, int width, int height){
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocationRelativeTo(rootPane);// can giua

        // ---> FlowLayout
        // FlowLayout fl= new FlowLayout(FlowLayout.LEFT, 100, 50);
        // this.setLayout(fl);
        // JButton b1= new JButton("Oke");
        // JButton b2= new JButton("Close");
        // JButton b3= new JButton("Run");
        // this.add(b1);
        // this.add(b2);
        // this.add(b3);


        // ----> GridLayout
        // GridLayout gl= new GridLayout(4, 4, 5, 5);
        // this.setLayout(gl);
        // for (int i=1; i<=16; ++i){
        //     JButton button= new JButton(i+"");
        //     this.add(button);
        // }

        // ----> BorderLayout
        BorderLayout bl= new BorderLayout(5, 5);
        this.setLayout(bl);
        JButton b1= new JButton("Oke");
        JButton b2= new JButton("Close");
        JButton b3= new JButton("Run");
        JButton b4= new JButton("Compile");
        JButton b5= new JButton("Debug");
        this.add(b1,BorderLayout.NORTH);
        this.add(b2,BorderLayout.SOUTH);
        this.add(b3,BorderLayout.EAST);
        this.add(b4,BorderLayout.WEST);
        this.add(b5,BorderLayout.CENTER);

        this.setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        Window wd= new Window();
        wd.openWindow("Dictionary", 600, 600);
    }
}
