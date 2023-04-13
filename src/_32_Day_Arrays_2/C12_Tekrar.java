package _32_Day_Arrays_2;

import java.util.Arrays;

public class C12_Tekrar {
    public static void main(String[] args) {

        int array[]={4,6,7,8,9};
        System.out.println(toplam(array));



    }
    // int arrayin elemanlarinin toplamini veren metod

    public static int toplam(int[] arr){
        int result=0;
        for (int i = 0; i <arr.length ; i++) {
            result+=arr[i];
        }return result;
    }


}
