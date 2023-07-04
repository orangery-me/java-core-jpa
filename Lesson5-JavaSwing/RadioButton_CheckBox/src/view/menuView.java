package view;

import javax.swing.*;

import controller.menuController;
import model.menuModel;

import java.awt.*;
import java.util.ArrayList;

public class menuView extends JFrame {
    public menuModel md;
    public JRadioButton radioButton1;
    public JRadioButton radioButton2;
    public JRadioButton radioButton3;
    public JCheckBox checkBox1;
    public JCheckBox checkBox2;
    public JCheckBox checkBox3;
    public JCheckBox checkBox4;
    public ButtonGroup mainGroup;
    public ArrayList<JCheckBox> subGroup;
    private JLabel billMainLabel;
    private JLabel billSubLabel;
    private JLabel billSumLabel;

    public menuView(){
        this.md= new menuModel();
        init();
    }

    private void init() {
        this.setTitle("Menu");
        this.setSize(500,400);
        this.setLocationRelativeTo(rootPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        Font font= new Font(Font.MONOSPACED, NORMAL, 18);

        JPanel header= new JPanel();
        JLabel headerLabel= new JLabel("THUC DON NHA HANG!");
        header.add(headerLabel);

        JPanel main= new JPanel();
        main.setLayout(new GridLayout(2,2));
        radioButton1= new JRadioButton("COM TAM 25k");
        radioButton2= new JRadioButton("BUN BO HUE 40k");
        radioButton3= new JRadioButton("BUN DAU MAM TOM 35k");
        JRadioButton radioButton4 = new JRadioButton("MI QUANG 30k");

        mainGroup= new ButtonGroup();
        mainGroup.add(radioButton1);
        mainGroup.add(radioButton2);
        mainGroup.add(radioButton3);
        mainGroup.add(radioButton4);
        main.add(radioButton1);
        main.add(radioButton2);
        main.add(radioButton3);
        main.add(radioButton4);

        JPanel sub= new JPanel();
        sub.setLayout(new GridLayout(4,1,10,10) ); 
        checkBox1= new JCheckBox("DUA MUOI 5k");
        checkBox2= new JCheckBox("TRUNG OP LA 8k");
        checkBox3= new JCheckBox("XI QUAY 5k");
        checkBox4= new JCheckBox("DAU KHUON CHIEN 10k");

        subGroup= new ArrayList<JCheckBox>();
        subGroup.add(checkBox1);
        subGroup.add(checkBox2);
        subGroup.add(checkBox3);
        subGroup.add(checkBox4);
        sub.add(checkBox1);
        sub.add(checkBox2);
        sub.add(checkBox3);
        sub.add(checkBox4);

        // BIll
        JPanel billPanel= new JPanel();
        billPanel.setLayout(new BorderLayout());
        JPanel billLeftPanel= new JPanel();
        billLeftPanel.setLayout(new GridLayout(3, 1));

        billMainLabel= new JLabel();
        billSubLabel= new JLabel();
        billSumLabel= new JLabel();
        JButton payButton= new JButton("PAY");
        payButton.setFont(font);

        billLeftPanel.add(billMainLabel);
        billLeftPanel.add(billSubLabel);
        billLeftPanel.add(billSumLabel);
        billPanel.add(billLeftPanel,BorderLayout.CENTER);
        billPanel.add(payButton,BorderLayout.SOUTH);

        JPanel groupAndBillPanel= new JPanel();
        groupAndBillPanel.setLayout(new GridLayout(3, 1));
        groupAndBillPanel.add(main);
        groupAndBillPanel.add(sub);
        groupAndBillPanel.add(billPanel);
        
        this.add(header,BorderLayout.NORTH);
        this.add(groupAndBillPanel,BorderLayout.CENTER);

        menuController mc= new menuController(this);
        payButton.addActionListener(mc);
        this.setVisible(true);
    }
    public void showBill(){
        this.billMainLabel.setText("MON CHINH: "+this.md.getMainDish());
        this.billSubLabel.setText("MON PHU: "+this.md.getSubDish());
        this.billSumLabel.setText("TONG TIEN: "+this.md.getBill());
    }

    public static void main(String[] args) {
        menuView mv= new menuView();
    }
}
