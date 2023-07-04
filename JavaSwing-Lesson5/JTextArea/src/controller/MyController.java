package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyView;

public class MyController implements ActionListener {
    MyView mv;
    public MyController(MyView mv){
        this.mv= mv;
    }

    public void actionPerformed(ActionEvent e) {
            this.mv.printRes();
    }
    
}
