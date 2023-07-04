package Lesson3.HashMap.vd1;

import java.util.HashMap;

public class Month {
    public static void main(String[] args){
        HashMap <Integer, String> m= new HashMap <Integer ,String> ();
        m.put(1,"January");
        m.put(2,"Febuary");
        m.put(3,"March");
        m.put(4,"April");
        m.put(5,"May");
        m.forEach((code,name) -> System.out.println("code: "+ code+ " name: "+name));
    }
}
