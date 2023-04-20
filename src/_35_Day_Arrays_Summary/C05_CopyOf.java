package _35_Day_Arrays_Summary;

import java.util.Arrays;

public class C05_CopyOf {
    public static void main(String[] args) {



    }


    // orijinal array i bozmamak icin kopya bi array olusturabilirizz.

    public static int enkucuksayi(int[] arr){
        int[] arr1= Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr1);
        return arr1[0];
    }






}
