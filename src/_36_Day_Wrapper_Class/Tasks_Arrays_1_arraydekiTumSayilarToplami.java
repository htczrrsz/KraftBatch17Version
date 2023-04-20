package _36_Day_Wrapper_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tasks_Arrays_1_arraydekiTumSayilarToplami {
    public static void main(String[] args) {


        int[] array={3,4,5,6,3,8,9};


        int[] array2 ={1,2,-8,-9,5,4};





        System.out.println(toplam(array));

        System.out.println(ciftSayilarToplami(array));

        System.out.println(ucSayilarininToplami(array));

        System.out.println(enBuyukSayiyiBul(array));

        System.out.println(enKucukSayiyiBul(array));

        System.out.println(Arrays.toString(enKucukSayiyiTumIndekslereAta(array)));

        System.out.println(Arrays.toString(indekslereAta(15, 8)));

        System.out.println(Arrays.toString(arrayBirlestir(array, array2)));

        System.out.println((ikinciArraydeVarMi(array, array2)));

        System.out.println(Arrays.toString(newArray(array)));

        System.out.println(Arrays.toString(randomClass(10, 0, 100)));

        System.out.println(Arrays.toString(randomSinif(500, 50, 80)));

        System.out.println(kacAdetIstenenSayiVar(500, 120, 140,125));


        System.out.println(enBuyukIkinciSayi(array2));


    }
    // ornek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..

    public static int toplam(int[] array){
        int result=0;
        for (int x: array) {
            result+=x;
        }return result;
    }


    // Ornek 2:  Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int ciftSayilarToplami(int[] array){
        int toplam=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                toplam+=array[i];
            }
        }
        return toplam;
    }



    // Ornek 3:  Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.

    public static int ucSayilarininToplami(int [] array){
        int result=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==3){
                result+=array[i];
            }
        }
        return result;
    }


    //  Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız.
    //  (Arrays.sort kullanılmayacak)


    public static int enBuyukSayiyiBul (int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i]>=max){
               max=array[i];
           }
        }return max;
    }

    public static int enKucukSayiyiBul (int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=min){
                min=array[i];
            }
        }return min;
    }


//Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.
// (Arrays.sort ve Arrays.fill kullanılmayacak)
    //  [1,2,-8,-9] [-9,-9,-9,-9]


    public static int[] enKucukSayiyiTumIndekslereAta (int[] arr){
        int[] arrNew=Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i]=enKucukSayiyiBul(arr);
        }return arrNew;
    }



    // Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
    // createArray(8,15) → [8,9,10,11,12,13,14,15]

    public static int[] indekslereAta (int sayi, int sayi2){
        int min=Math.min(sayi,sayi2);
        int max= Math.max(sayi,sayi2);

        int[] array=new int[max-min+1];

        for (int i = 0, j=min; i <array.length ; i++, j++) {
            array[i]=j;
        }
        return array;
    }



    // Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte
    // tek bir array oluşturan metodu yazınız.
    // [1,2,-8,-9] [-1,0,-7,11] -------→[1,2,-8,-9,-1,0,-7,11]


    public static int[] arrayBirlestir (int[] arr1, int[] arr2){
        int[] newArray=new int[arr1.length+arr2.length];
        for (int i = 0 ; i <arr1.length ; i++) {
            newArray[i]=arr1[i];
        }
        int j=0;
        for (int i = arr1.length; i <newArray.length ; i++) {
            newArray[i]=arr2[j];
            j++;
        }


        return newArray;
    }




    // Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar
    // ikinci arrayin içinde yer alıyorsa true yer almıyorsa false yazdıran metodu yazınız.
    // [5,4,3,2,1] , [1,2,3,4,5,7,9] true [5,4,3,2,1,7,5] , [1,2,3,4,5] false


    public static boolean ikinciArraydeVarMi (int[] arr1, int[] arr2){
       firstLoop: for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if (arr1[i]==arr2[j]){
                    continue firstLoop;
              }
            } return false;

        }
        return true;
    }


    // Örnek 9: Array’in içerisindeki sayıları ters çevirerek
    // yeni bir array oluşturan metodu yazınız
    // [5,4,3,2,1] -----------> [1,2,3,4,5]

    public static int[] newArray(int[] array){
        int [] newArray=new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            newArray[j]=array[i];
        }
        return newArray;
    }



//    Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine
//    Random sınıfını kullanarak 0-100 arasında rasgele sayılar atayın
//    ve ekrana bu verileri yazdıran metodu yazınız.


    public static int[] randomClass(int boyut, int from, int to){
        int[] array= new int[boyut];
        Random random= new Random();

        for (int i = 0; i <array.length ; i++) {
            array[i]= random.nextInt(to-from)+from;
        }
        return array;
    }



    // Örnek 11: Boyutu 500 olan bir array oluşturun
    // ve içerisine Random sınıfını kullanarak 50-80 arasında rasgele sayılar atayın.


    //tekrar etmek icin ;
    public static int[] randomSinif(int boyut, int from, int to){
        int[] arr= new int[boyut];
        Random random=new Random();

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt(to-from)+from;
        }
        return arr;

    }



    // Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak
    // 120-140 arasında rasgele sayılar atayın.
    // Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?

    public static int kacAdetIstenenSayiVar(int boyut, int from, int to, int istenen) {
        int tane=0;
        int [] arr= randomClass(boyut,from,to);
        for (int i = 0; i <boyut; i++) {
            if (arr[i]==istenen){
                tane++;
            }
        }
        return tane;
    }



    // Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak
    // 120-140 arasında rasgele sayılar atayın.
    // Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
    // (Array.sort kullanılmayacak)

    public static int enBuyukIkinciSayi(int[] arr){
        int max=arr[0];
        int enBuyukIkinciSayi=arr[1];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= arr[0]) {
                max = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != max && arr[j] >= arr[1]) {
                    enBuyukIkinciSayi = arr[j];
                }
            }
        }
        return enBuyukIkinciSayi;


    }














// Örnek 26:Array’in içerisindeki ne kadar 1 var ise
// hepsini en sağa taşıyan metodu yazınız.
// [5,1,9,6,1,4,7,11,25,36] → [5,9,6,4,7,11,25,36,1,1]
//
//public static int[] birlerSaga (int[] array){
//        int[] newArray=new int[array.length];
//        int temp=1;
//    for (int i = 0; i <array.length ; i++) {
//        if (array[i]==1){
////            if (array[i+1]!=1) {
////                array[i] = array[i + 1];
////            }
//            array[array.length-1]=1;
//        }
//
//    }
//
//        return newArray;
//}







}
