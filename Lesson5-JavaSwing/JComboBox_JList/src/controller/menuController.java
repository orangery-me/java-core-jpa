package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;


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
    }
    
}
