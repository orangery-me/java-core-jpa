package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

// import javax.imageio.plugins.tiff.ExifParentTIFFTagSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseController;
import model.MouseModel;

public class MouseView extends  JFrame{
    MouseModel mm;
    JLabel getPosition;
    JLabel getClick;
    JLabel getIsIn;

    public MouseView(){
        mm= new MouseModel();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Mouse Even");
        this.setSize(500, 400);
        this.setLocationRelativeTo(rootPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        MouseController mc= new MouseController(this);
        Font font= new Font(Font.MONOSPACED, Font.PLAIN ,18);

        JPanel component= new JPanel();
        component.setBackground(Color.LIGHT_GRAY);
        component.addMouseListener(mc);
        component.addMouseMotionListener(mc);
        this.add(component, BorderLayout.CENTER);

        JPanel res= new JPanel();
        res.setLayout(new GridLayout(3, 2));
        JLabel position= new JLabel("position: "); 
        getPosition= new JLabel();
        JLabel click= new JLabel("number of clicks: "); 
        getClick= new JLabel();
        JLabel isIn= new JLabel("mouse is in window: "); 
        getIsIn= new JLabel();
        res.add(position);
        position.setFont(font);
        res.add(getPosition);
        getPosition.setFont(font);
        res.add(click);
        click.setFont(font);
        res.add(getClick);
        getClick.setFont(font);
        res.add(isIn);
        isIn.setFont(font);
        res.add(getIsIn);
        getIsIn.setFont(font);
        this.add(res,BorderLayout.SOUTH);
    }

    public void addClick(){
        this.mm.increase();
        this.getClick.setText(this.mm.getClickNums()+"");
    }

    public void enter(){
        this.mm.setInComponent(true);
        this.getIsIn.setText(this.mm.isInComponent()+"");
    }

    public void exit(){
        this.mm.setInComponent(false);
        this.getIsIn.setText(this.mm.isInComponent()+"");
    }

    public void getPosition(int x, int y){
        this.mm.setX(x);
        this.mm.setY(y);
        this.getPosition.setText("x= "+this.mm.getX()+";     y="+this.mm.getY());
    }

    public static void main(String[] args) {
        MouseView mv= new MouseView();
    }
}
