package view;

import model.CounterModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class CounterView extends JFrame{
    private CounterModel counterModel;
    private JButton up;
    private JButton down;
    private JLabel value;

    public CounterView(){
        this.counterModel= new CounterModel();
        this.init();
        this.setVisible(true);

    }

    private void init() {

        this.setTitle("Counter");
        this.setSize(300, 300 );
        this.setLocationRelativeTo(rootPane);

        up= new JButton("UP");
        down= new JButton("DOWN");
        value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);

        JPanel panel= new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(up,BorderLayout.WEST);
        panel.add(down,BorderLayout.EAST);
        panel.add(value, BorderLayout.CENTER);
        
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac= new CounterListener(this);
        up.addActionListener(ac);
        down.addActionListener(ac);

    }
    public void increase(){
        this.counterModel.increase();
        this.value.setText(this.counterModel.getValue()+"");
    }
    public void decrease(){
        this.counterModel.decrease();
        this.value.setText(this.counterModel.getValue()+"");
    }
}
