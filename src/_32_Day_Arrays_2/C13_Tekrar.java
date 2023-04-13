package _32_Day_Arrays_2;

import java.util.Arrays;

public class C13_Tekrar {
    public static void main(String[] args) {

        int array[]={4,6,7,8,9};
        System.out.println(Arrays.toString(toplamVeCarpim(array)));

        System.out.println(toplamVeCarpim(array)[0]);

    }
    // int arrayin elemanlarinin toplamini ve carpimini yeni bir array icinde donduren metod yaziniz.

    public static int[] toplamVeCarpim(int[] arr){
        int toplam=0;
        int carpim=1;
        int yeniArray[]=new int[2];
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
            carpim*=arr[i];
        }
        yeniArray[0]=toplam;
        yeniArray[1]=carpim;
        return yeniArray;
    }





}
