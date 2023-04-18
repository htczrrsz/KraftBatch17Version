package _34_Day_Arrays_4;

import java.util.Arrays;

public class C04_Tasks {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(buildIntArray(8)));
        System.out.println("----------------------------------");

//        System.out.println(Arrays.toString(averageOfMaxMin(arr)));
        int[] arr=buildIntArray(5);

        System.out.println(averageOfMaxMin(arr));
        //   System.out.println(Arrays.toString(buildIntArray(arr)));

        int[] arr1={5,2,9,3,7,4};
        System.out.println(Arrays.toString(fillArrayWithSmallest(arr1)));
        int[] arr2={5,2,9,3,7,4};
        System.out.println(Arrays.toString(fillArrayWithSmallestExceptBiggest(arr2)));


    }

    // bir metod yazin int n parametre olarak alsin.
    // n degeri kadar sayilari sirali bir bicimde bir array icine yerlestirin
   //  n=5 exam; [0,1,2,3,4]

    public static int[] buildIntArray(int n){
        int[] intArr=new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i]=i;
        }
        return intArr;

    }


// Bir sayi dizisinin en buyuk ve en kucuk elementlerinin aritmetik ortalamasini veren bi metod yazin

    public static double averageOfMaxMin(int[] arr){
        double avg=0;
        int max=arr[0];
        int min= arr[0];

        for (int i = 0; i <arr.length ; i++) {
           if( arr[i]>max){
               max=arr[i];
           }else if (arr[i]<min){
               min=arr[i];
           }
        }
        avg= (min+max)/2;
        return avg;
//        Arrays.sort(arr);
//        return (arr[0]+arr[arr.length-1] )/2;
    }

//  Bir sayı dizisinin en küçük elemani ne ise sayı dizisini onunla dolduran bir
//   method yazın


    public static int[] fillArrayWithSmallest(int[] arr){

         Arrays.sort(arr);
         int min=arr[0];
         Arrays.fill(arr,min);
         return arr;
    }

    //Bir sayı dizisinin en küçük elemani ne ise sayı dizisini
    // (en büyük değer hariç) onunla dolduran bir
    // method yazın

    public static int[] fillArrayWithSmallestExceptBiggest(int[] arr){

        int min=arr[0];
        int max= arr[arr.length-1];
        for (int i = 0; i <arr.length ; i++) {
            if( arr[i]>max){
                max=arr[i];
            }else if (arr[i]<min){
                min=arr[i];
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=max){
                arr[i]=min;
            }
        }return arr;

    }




}
