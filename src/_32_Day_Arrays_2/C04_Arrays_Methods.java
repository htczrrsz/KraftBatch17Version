package _32_Day_Arrays_2;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays_Methods {
    public static void main(String[] args) {

        // System.out.println(kelimeDepola()[2]);
//
//        int[] sayi = {3, 5, 7, 9};
//        System.out.println(bestenBuyukMu(sayi));
//
//        int[] arr = {5, 10, 15, 30};
//        System.out.println(kontrol(arr, 5));
//
//        int[]array ={25,26};
//        int[] array2={25,34};
//        System.out.println(ilkElemanEsitMi(array, array2));
//
//
//        double[]array1 ={25,26};
//        double[] array3={35,34};
//
//        System.out.println(Arrays.toString(yeniArray(array1, array3)));
//
//        System.out.println(arrayToplam(array));

//        int[] array1 = {25, 26,6};
//        int[] array = {3, 5,7};

        int array1[]={3,3,5};
        int array2[]={35,3,36};
        arrayYazdir(arrayBirlestir2(array1,array2));

     //   System.out.println(Arrays.toString(toplamVeCarpim(array1)).substring(0, 4));


        //   arrayYazdir(toplamVeCarpim(arrayNew));
//        arrayYazdir(arrayBirlestir(array2, array1));
//        arrayYazdir(arrayBirlestir2(array1,array2));


    }
//    public static String[] kelimeDepola(){
//        String array[]=new String[3];
//
//        Scanner scan=new Scanner(System.in);
//        System.out.print("1.Kelime: ");
//        String kelime1= scan.nextLine();
//        array[0]=kelime1;
//        System.out.print("2.Kelime: ");
//        String kelime2= scan.nextLine();
//        array[1]=kelime2;
//        System.out.print("3.Kelime: ");
//        String kelime3= scan.nextLine();
//        array[2]=kelime3;
//
    //       return array;

    //   }


    // Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean bestenBuyukMu(int[] sayi) {
        return sayi.length > 5;
        // kisaca boyle yazabiliriz tek satirda

    }


    //  Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.

    public static boolean kontrol(int[] arr, int kontrolSayisi) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == kontrolSayisi) {
                return true;
            }
        }
        return false;
    }


    // Bir metod yazin ve 2 array kabul etsin
    // ilk elemanlari esitse true dondrsun

    public static boolean ilkElemanEsitMi(int[] arr1, int[] arr2) {
        return arr1[0] == arr2[0];
    }


    public static boolean ilkElemanEsitMi(String[] arr1, String[] arr2) {
        return arr1[0].equalsIgnoreCase(arr2[0]);
    }

// 2 array kabul eden bir metod yazin ve arraylerin ilk elemanlari ile
    // yeni bir array dondursun

    public static double[] yeniArray(double[] x, double[] y) {
        double result[] = new double[2];
        result[0] = x[0];
        result[1] = y[0];
        return result;

    }


    // int arrayin elemanlarinin toplamini veren bir metod yaziniz.

    public static int arrayToplam(int[] arr) {
        int result = 0;
        for (int sayi :
                arr) {
            result += sayi;
        }
        return result;
    }


    // int arrayin elemanlarinin toplamini ve carpimini
    // yeni bir array icersinde donduren bir metod yazin.

    public static int[] toplamVeCarpim(int[] arr) {
        int toplamCarpim[] = new int[2];
        int toplam = 0;
        int carpim = 1;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            carpim *= arr[i];

        }
        toplamCarpim[0] = toplam;
        toplamCarpim[1] = carpim;
        return toplamCarpim;
    }

    public static void arrayYazdir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + "-");
            }

        }
    }



    public static void arrayYazdir(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }

    public static void arrayYazdir(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }

    public static void arrayYazdir(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }


    // verilen iki arrayi birlestirip array donduren bir metod yazin.

    public static int[] arrayBirlestir(int[] arr1, int[] arr2) {
        int[] yeniArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            yeniArray[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < yeniArray.length; i++) {
            yeniArray[i] = arr2[j];
            j++;

        }
        return yeniArray;
    }


    public static int[] arrayBirlestir2(int[] arr1, int[] arr2) {
        int[] yeniArray = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0; i < yeniArray.length; i++) {

            if (i < arr1.length) {
                yeniArray[i] = arr1[i];
            } else {
                yeniArray[i] = arr2[j];
                j++;
            }
        }
        return yeniArray;
    }


    

}