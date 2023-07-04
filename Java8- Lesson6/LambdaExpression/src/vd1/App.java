package vd1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Operation{

    public static int compare(String a, String b){
        return a.compareTo(b);
    }
}

public class App {
    @FunctionalInterface
    interface say{
        public String sayHello(String name);
    }
    public static void main(String[] args) throws Exception {
        say s= a->"hello, "+a;
        System.out.println(s.sayHello("Chau Thi"));

        List <String> ds= new ArrayList<String>();
        ds.add("Thi");
        ds.add("Chau");
        ds.add("Bao");
        ds.add("Dinh");

        // Inner class
        // ds.sort(new Comparator<String>(){
        //     public int compare(String a, String b){
        //         return a.compareTo(b);
        //     }
        // }); 

        // lambda expression
        // Collections.sort( ds, (String a, String b)->a.compareTo(b) );

        // method references
        Collections.sort(ds,Operation::compare);

        ds.forEach( a->System.out.println(a));
    }
}
