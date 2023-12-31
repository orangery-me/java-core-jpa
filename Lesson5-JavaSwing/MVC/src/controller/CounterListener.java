package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener {
    private CounterView ctv; 
    public CounterListener(CounterView ctv){
        this.ctv= ctv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String action= e.getActionCommand();
        if (action.equals("UP"))
        ctv.increase();
        if (action.equals("DOWN"))
        ctv.decrease();
    }
    
}
