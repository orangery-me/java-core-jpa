package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ButtonView;

public class ButtonController implements ActionListener {
    private ButtonView buttonView;

    public ButtonController(ButtonView buttonView){
        this.buttonView= buttonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a= e.getActionCommand();
        if (a.equals("1")){
            this.buttonView.setLastButtonValue(1);
        }
        if (a.equals("2")){
            this.buttonView.setLastButtonValue(2);
        }
        if (a.equals("3")){
            this.buttonView.setLastButtonValue(3);
        }
        if (a.equals("4")){
            this.buttonView.setLastButtonValue(4);
        }
        
    }
    
}
