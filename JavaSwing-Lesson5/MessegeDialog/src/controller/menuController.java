package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

import view.menuView;

public class menuController implements ActionListener{

    menuView mv;

    public menuController(menuView mv){
        this.mv= mv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String mainDish=this.mv.mainDishesComboBox.getSelectedItem().toString();

        List<String> subDishes=this.mv.subDishesList.getSelectedValuesList();
        String subDish= subDishes.stream().collect(Collectors.joining(";"));

        this.mv.md.setMainDish(mainDish);
        this.mv.md.setSubDish(subDish);
        this.mv.md.calSumBill();
        this.mv.showBill();
        
        String money= (String) JOptionPane.showInputDialog(
            mv,
            mv.billMainLabel.getText()+"\n"+mv.billSubLabel.getText()+"\n"+mv.billSumLabel.getText()+"\nSo tien khach dua: ",
            "Thong bao: ",
            JOptionPane.INFORMATION_MESSAGE);

        try {
            Double moneyInteger = Double.valueOf(money);
            Double change= moneyInteger-mv.md.getBill();
            JOptionPane.showMessageDialog(mv, "Tra lai: "+change+" k", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception f) {
            JOptionPane.showMessageDialog(mv, "Vui long nhap so hop le", "Loi", JOptionPane.ERROR_MESSAGE);
        }

    }
    
}
