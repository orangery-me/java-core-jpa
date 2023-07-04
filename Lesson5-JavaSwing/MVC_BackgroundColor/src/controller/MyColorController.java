package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorController implements ActionListener{
    MyColorView mcv;
    public MyColorController(MyColorView mcv){
        this.mcv= mcv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String action= e.getActionCommand();
        if (action.equals("RED TEXT")){
            this.mcv.changeColor(Color.RED);
        }
        if (action.equals("YELLOW TEXT")){
            this.mcv.changeColor(Color.YELLOW);
        }
        if (action.equals("GREEN TEXT")){
            this.mcv.changeColor(Color.GREEN);
        }

        if (action.equals("RED BACKGROUND")){
            this.mcv.changeBackground(Color.RED);
        }
        if (action.equals("YELLOW BACKGROUND")){
            this.mcv.changeBackground(Color.YELLOW);
        }
        if (action.equals("GREEN BACKGROUND")){
            this.mcv.changeBackground(Color.GREEN);
        }
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }



}
