package Lesson3.Array_StaticArray.BT;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[][] pets= new String [2][3];

        pets[0][0]="Husky";
        pets[0][1]="Corgi";
        pets[0][2]="Chihuahua";

        pets[1][0]="British_short_hair";
        pets[1][1]="Seberian";
        pets[1][2]="Himalayan";

        for (int type=0; type<2 ; ++type){
            for (int breed=0; breed<3 ; ++breed){
                System.out.print(pets[type][breed]+"  ");
            }
            System.out.println();
        }

        int [] arr1= {1,2,5,0,-4,9};
        Arrays.sort(arr1);
        System.out.print(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1, 5));

        ArrayList col1= new ArrayList<>();
        ArrayList col2= new ArrayList<>(10); // allocate 10 spaces
        ArrayList col3= new ArrayList<>(col1); // copy col1 to col3
        
    }
}
