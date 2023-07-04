package test;

import controller.MyColorController;
import view.MyColorView;

public class Test {
    public static void main(String[] args) {
        MyColorView mcv= new MyColorView();
        MyColorController cct= new MyColorController(mcv);
        
    }
}
