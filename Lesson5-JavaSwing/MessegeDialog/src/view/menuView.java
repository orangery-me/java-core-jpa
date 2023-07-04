package view;

import javax.swing.*;

import controller.menuController;
import model.menuModel;
import java.awt.*;

public class menuView extends JFrame {
    public menuModel md;
    public JComboBox<String> mainDishesComboBox;
    public JList<String> subDishesList;
    public JLabel billMainLabel;
    public JLabel billSubLabel;
    public JLabel billSumLabel;

    public menuView(){
        this.md= new menuModel();
        init();
    }

    private void init() {
        this.setTitle("Menu");
        this.setSize(500 ,450);
        this.setLocationRelativeTo(rootPane);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        Font font= new Font(Font.MONOSPACED, NORMAL, 18);

        JPanel header= new JPanel();
        JLabel headerLabel= new JLabel("THUC DON NHA HANG!");
        header.add(headerLabel);

        JPanel main= new JPanel();
        String[] mainDishes= new String[] {"COM TAM 25k","BUN BO HUE 40k","BUN DAU MAM TOM 35k","MI QUANG 30k"};
        mainDishesComboBox= new JComboBox<String> (mainDishes);
        main.add(mainDishesComboBox);

        JPanel sub= new JPanel();
        String[] subDishes= new String[]{"DUA MUOI 5k","TRUNG OP LA 8k","BANH QUAY 5k","DAU KHUON CHIEN 10k",
        "DOI CHIEN 15k","BANH TRANG 5k","CHA COM 15k"};
        subDishesList= new JList<String>(subDishes);
        sub.add(subDishesList);

        JPanel group= new JPanel();
        group.setLayout(new BorderLayout());
        group.add(main,BorderLayout.NORTH);
        group.add(sub,BorderLayout.CENTER);

        // BIll
        JPanel billPanel= new JPanel();
        billPanel.setLayout(new BorderLayout());

        JPanel billLeftPanel= new JPanel();
        billLeftPanel.setLayout(new GridLayout(3, 1));
        billMainLabel= new JLabel();
        billSubLabel= new JLabel();
        billSumLabel= new JLabel();
        billLeftPanel.add(billMainLabel);
        billLeftPanel.add(billSubLabel);
        billLeftPanel.add(billSumLabel);

        JButton payButton= new JButton("PAY");
        payButton.setFont(font);

        billPanel.add(billLeftPanel,BorderLayout.CENTER);
        billPanel.add(payButton,BorderLayout.EAST);
        
        this.add(header,BorderLayout.NORTH);
        this.add(group,BorderLayout.CENTER);
        this.add(billPanel,BorderLayout.SOUTH);

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
