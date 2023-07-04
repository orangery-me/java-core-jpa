package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class CalculatorListener implements ActionListener {
    CalculatorView cv;

    public CalculatorListener(CalculatorView cv){
        this.cv=cv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action= e.getActionCommand();
        if (action.equals("+"))
        this.cv.Cong();
        if (action.equals("-"))
        this.cv.Tru();
        if (action.equals("*"))
        this.cv.Nhan();
        if (action.equals("/"))
        this.cv.Chia();
        if (action.equals("^"))
        this.cv.Mu();
        if (action.equals("MOD"))
        this.cv.Du();
       
    }
    
}
