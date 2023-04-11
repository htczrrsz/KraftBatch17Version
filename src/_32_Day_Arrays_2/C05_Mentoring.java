package _32_Day_Arrays_2;

import java.util.Arrays;

public class C05_Mentoring {
    public static void main(String[] args) {


        int[] dizi={3,4,5,6};

        dizi[3]=2;

        System.out.println("dizi[0] = " + dizi[0]);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(dizi[i]+" ");
        }

        System.out.println();

        System.out.println("dizi.length = " + dizi.length);


    }
}
