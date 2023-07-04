package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuView;

public class MenuController implements ActionListener {
    private MenuView mv;

    public MenuController(MenuView mv){
        this.mv=mv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action= e.getActionCommand();
        if (action.equals("Exit"))
        System.exit(0);
        this.mv.setTextLabel(action);

    }
    
}
