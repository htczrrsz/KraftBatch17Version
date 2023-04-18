package _34_Day_Arrays_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_DimensionalArrays {
    public static void main(String[] args) {

        // cok boyutlu arrayler


        String[] group1={"arikan","ayse","daghan"};
        String[] group2={"emine","hasan","hatice"};
        String[] group3={"isa","nuran","omer"};

        String [] [] groups= new String[3][];  // index 0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;


        System.out.println(groups[1][1].length()); // " hasan 'in lenght ini yazdi
        System.out.println(groups[1][2]);     // hatice
        System.out.println(Arrays.toString(groups)); // referans yazsi
        System.out.println(Arrays.deepToString(groups));



//                      0 1 2   0 1 2 3
        int[][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //                0        1           2

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[0]));



    }
}
