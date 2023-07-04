package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

import view.menuView;

public class menuController implements ActionListener{

    menuView mv;

    public menuController(menuView mv){
        this.mv= mv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String mainDish="";
        Enumeration <AbstractButton> mainGroupEnum= mv.mainGroup.getElements();
        while (mainGroupEnum.hasMoreElements()){
            AbstractButton b= mainGroupEnum.nextElement();
            if (b.isSelected()){
                mainDish= b.getText();
            } 
        }

        String subDish="";
        for (JCheckBox checkBox : this.mv.subGroup) {
            if (checkBox.isSelected())
                subDish= subDish+checkBox.getText()+";";
        }

        this.mv.md.setMainDish(mainDish);
        this.mv.md.setSubDish(subDish);
        this.mv.md.calSumBill();
        this.mv.showBill();
    }
    
}
