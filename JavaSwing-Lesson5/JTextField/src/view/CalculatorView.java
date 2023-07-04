package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CalculatorListener;
import model.CalculatorModel;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame{
    CalculatorModel cm= new CalculatorModel();
    JButton cong= new JButton("+");
    JButton tru= new JButton("-");
    JButton nhan= new JButton("*");
    JButton chia= new JButton("/");
    JButton mu= new JButton("^");
    JButton du= new JButton("MOD");
    JTextField value1JTextField= new JTextField(40);
    JTextField value2JTextField= new JTextField(40);
    JTextField anwswerJTextField= new JTextField(40);

    public CalculatorView(){
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setSize(350, 400);
        this.setTitle("My Calculator");
        this.setLocationRelativeTo(rootPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel calView= new JPanel();
        JPanel calButton= new JPanel();
        Font font= new Font(Font.MONOSPACED, NORMAL, 16);

        calView.setLayout(new GridLayout(3, 2,10,10));
        JLabel value1JLabel= new JLabel("1st VALUE");
        value1JLabel.setFont(font);
        JLabel value2JLabel= new JLabel("2nd VALUE");
        value2JLabel.setFont(font);
        JLabel answerJLabel= new JLabel("ANSWER");
        answerJLabel.setFont(font);
        
        calView.add(value1JLabel,JLabel.CENTER);
        calView.add(value1JTextField);
        calView.add(value2JLabel);
        calView.add(value2JTextField);
        calView.add(answerJLabel);
        calView.add(anwswerJTextField);

        calButton.setLayout(new GridLayout(2, 3, 10, 10));
        calButton.add(cong);
        cong.setFont(font);
        calButton.add(tru);
        tru.setFont(font);
        calButton.add(nhan);
        nhan.setFont(font);
        calButton.add(chia);
        chia.setFont(font);
        calButton.add(mu);
        mu.setFont(font);
        calButton.add(du);
        du.setFont(font);

        ActionListener ac= new CalculatorListener(this);
        cong.addActionListener(ac);
        tru.addActionListener(ac);
        nhan.addActionListener(ac);
        chia.addActionListener(ac);
        mu.addActionListener(ac);
        du.addActionListener(ac);

        this.setLayout(new GridLayout(2,1));
        this.add(calView);
        this.add(calButton);
    }
    public void layGiaTri(){
        this.cm.setA( Double.valueOf(value1JTextField.getText()) );
        this.cm.setB( Double.valueOf(value2JTextField.getText()) );
    }

    public void Cong(){
        this.layGiaTri();
        this.cm.phepCong();
        anwswerJTextField.setText(this.cm.getAnswer()+"");
    }
    public void Tru(){
        this.layGiaTri();
        this.cm.phepTru();
        anwswerJTextField.setText(this.cm.getAnswer()+"");
    }
    public void Nhan(){
        this.layGiaTri();
        this.cm.phepNhan();
        anwswerJTextField.setText(this.cm.getAnswer()+"");
    }
    public void Chia(){
        this.layGiaTri();
        this.cm.phepChia();
        anwswerJTextField.setText(this.cm.getAnswer()+"");
    }
    public void Mu(){
        this.layGiaTri();
        this.cm.phepMu();
        anwswerJTextField.setText(this.cm.getAnswer()+"");
    }
    public void Du(){
        this.layGiaTri();
        this.cm.phepDu();
        anwswerJTextField.setText(this.cm.getAnswer()+"");
    }

}
