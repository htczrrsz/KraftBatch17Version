package _33_Day_Arrays_3;

import java.util.Arrays;

public class C02_Swap_Reversed {
    public static void main(String[] args) {

        int[] intArr={1,20,3,400,50,6};
        System.out.println(maxOfArray(intArr));

        System.out.println(Arrays.toString(swapFirstAndLast(intArr)));
        System.out.println(Arrays.toString(reverseArray(intArr)));
        System.out.println(sumOfArrayElements(intArr));

    }

    // İnt arry in en büyük elemanının döndüren bir method yazın

    public static int maxOfArray(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }return max;

    }


    // bir array olusturun ve ilk ve son elemenlerini swap yapin. (yer degistirme)

    public static int[] swapFirstAndLast(int[] arr){
        int temp= arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }

    //   Bir method yazın ve verilen arry in elemanlarını
    //   tersden sıralayıp yeni bir array döndürsün.

    public static int[] reverseArray(int[] arr){
        int[] reversedArr=new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reversedArr[j]=arr[i];
        }return reversedArr;
    }


    // Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.

    public static int sumOfArrayElements(int[] arr){
        int sum=0;
        for (int i = 1; i <arr.length ; i+=2) {
            sum+=arr[i];
        }

        return sum;
    }



}
