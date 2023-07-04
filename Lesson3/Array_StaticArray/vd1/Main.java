package Lesson3.Array_StaticArray.vd1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        int myarr[]= {1,2,3};
        System.out.println(Arrays.toString(myarr));

       // Integer arr[]= new Integer[4];
        // Integer arr[]={2,3,4};
        // System.out.println(Arrays.toString(arr));

        Foo fooArr[]= {new Foo(5), new Foo(3), new Foo(6)};
        System.out.println(Arrays.toString(fooArr));

        // int[][] arr= { {1,2}, {3}, {9,2} };
        // System.out.println(Arrays.toString(arr));

        Map<Integer,String> mp = new HashMap <Integer, String>();
        mp.put(12,"Thi");
        mp.put(13,"Thao");
        mp.put(14,"Thanh");
        System.out.println(mp);

        ArrayList<String> arr= new ArrayList<String>();
        arr.add("Xin chao");
        System.out.println(arr.size());
        arr.add("Toi ten la Thi");
        System.out.println(arr);
        System.out.println(arr.size());

    }

}
