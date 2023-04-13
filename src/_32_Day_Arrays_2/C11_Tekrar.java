package _32_Day_Arrays_2;

import java.util.Arrays;

public class C11_Tekrar {
    public static void main(String[] args) {


        int array[]={4,6,7,8,9};
        int array2[]={5,7,9,10};
        System.out.println(Arrays.toString(yeniArray(array, array2)));   // bu string artik

    }

    // 2 array kabul eden bi metod yazin ve arraylerin ilk elemanlari ile yeni bi array dondursun

    public static int[] yeniArray(int[] arr1, int[] arr2){
        int yeniArray[]=new int[2];
        yeniArray[0]=arr1[0];
        yeniArray[1]=arr2[0];
        return yeniArray;
    }

}
