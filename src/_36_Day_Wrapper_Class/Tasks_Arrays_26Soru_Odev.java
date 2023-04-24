package _36_Day_Wrapper_Class;

import java.util.Arrays;
import java.util.Random;

public class Tasks_Arrays_26Soru_Odev {
    public static void main(String[] args) {


        int[] array = {5, 4, 5, 6, 3, 8, 9};


        int[] array2 = {4, 4, 1, 3};

        int[] array3 = {6, 5, 8, 6, 8, 5, 8};


        int[] array4 = {21, 7, 29, 12};

        int[] array5 = {2, 2, 3, 3, 5, 6, 6};

        int[] array6={5,1,9,6,1,4,7,11};

        int[] array7={2,5,5,5,9};

        int[] array8={2,5,28,36,9};


        String str = "Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu." +
                "Filin yemek dolu karnı horlarken bir aşağı bir yukarı gidiyordu. " +
                "Filin horlama sesini duyan fare yuvasından çıkıp sesin olduğu tarafa gitti," +
                "filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının üzerine oturdu, " +
                "salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.";


        String str1 = "araba ile yola çıktık fakat araba arıza yaptı";


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

        System.out.println(kacAdetIstenenSayiVar(500, 120, 140, 125));


        System.out.println(enBuyukIkinciSayi(array2));

        System.out.println(ardiArdinaSiraliSAyiVarMi(array2));

        System.out.println(yalnizSayilar(array5));

        System.out.println(enCokVeriyiDondur(array));

        System.out.println(duplicate(array2));

        System.out.println(kacAdetHarf(str, "o"));

        System.out.println(duplicateKelime(str1));

        System.out.println(Arrays.toString(enKucukSayiyiBulVeIlkIndekseAta(array2)));

        System.out.println(Arrays.toString(bestenSonraSekizVarsaDegistir(array3)));

        System.out.println(asalSayi(array4));

        System.out.println(Arrays.toString(sortMetod(array)));

        System.out.println(duplicateOlmayanSayilarinToplami(array7));

        System.out.println(belliAralikToplam(array8));

        System.out.println(Arrays.toString(birlerSaga(array6)));


    }
    // ornek 1: Array’in içerisindeki tüm sayıların toplamını veren metodu yazınız..

    public static int toplam(int[] array) {
        int result = 0;
        for (int x : array) {
            result += x;
        }
        return result;
    }


    // Ornek 2:  Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

    public static int ciftSayilarToplami(int[] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                toplam += array[i];
            }
        }
        return toplam;
    }


    // Ornek 3:  Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.

    public static int ucSayilarininToplami(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3) {
                result += array[i];
            }
        }
        return result;
    }


    //  Örnek 4: Array’in içerisindeki en büyük ve en küçük sayıyı bulan metodu yazınız.
    //  (Arrays.sort kullanılmayacak)


    public static int enBuyukSayiyiBul(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int enKucukSayiyiBul(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }


//Örnek 5:Array’in içerisindeki en küçük sayıyı tüm indekslere atayan bir metod yazınız.
// (Arrays.sort ve Arrays.fill kullanılmayacak)
    //  [1,2,-8,-9] [-9,-9,-9,-9]


    public static int[] enKucukSayiyiTumIndekslereAta(int[] arr) {
        int[] arrNew = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = enKucukSayiyiBul(arr);
        }
        return arrNew;
    }


    // Örnek 6: 2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.
    // createArray(8,15) → [8,9,10,11,12,13,14,15]

    public static int[] indekslereAta(int sayi, int sayi2) {
        int min = Math.min(sayi, sayi2);
        int max = Math.max(sayi, sayi2);

        int[] array = new int[max - min + 1];

        for (int i = 0, j = min; i < array.length; i++, j++) {
            array[i] = j;
        }
        return array;
    }


    // Örnek 7: 2 adet array kabul eden ve sonucunda bu 2 array’in verileri ile birlikte
    // tek bir array oluşturan metodu yazınız.
    // [1,2,-8,-9] [-1,0,-7,11] -------→[1,2,-8,-9,-1,0,-7,11]


    public static int[] arrayBirlestir(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < newArray.length; i++) {
            newArray[i] = arr2[j];
            j++;
        }


        return newArray;
    }


    // Örnek 8: 2 array kabul eden, ilk array in içerindeki tüm sayılar
    // ikinci arrayin içinde yer alıyorsa true yer almıyorsa false yazdıran metodu yazınız.
    // [5,4,3,2,1] , [1,2,3,4,5,7,9] true [5,4,3,2,1,7,5] , [1,2,3,4,5] false


    public static boolean ikinciArraydeVarMi(int[] arr1, int[] arr2) {
        firstLoop:
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    continue firstLoop;
                }
            }
            return false;

        }
        return true;
    }


    // Örnek 9: Array’in içerisindeki sayıları ters çevirerek
    // yeni bir array oluşturan metodu yazınız
    // [5,4,3,2,1] -----------> [1,2,3,4,5]

    public static int[] newArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }


//    Örnek 10: Boyutu 10 olan bir array oluşturun ve içerisine
//    Random sınıfını kullanarak 0-100 arasında rasgele sayılar atayın
//    ve ekrana bu verileri yazdıran metodu yazınız.


    public static int[] randomClass(int boyut, int from, int to) {
        int[] array = new int[boyut];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(to - from) + from;
        }
        return array;
    }


    // Örnek 11: Boyutu 500 olan bir array oluşturun
    // ve içerisine Random sınıfını kullanarak 50-80 arasında rasgele sayılar atayın.


    //tekrar etmek icin ;
    public static int[] randomSinif(int boyut, int from, int to) {
        int[] arr = new int[boyut];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(to - from) + from;
        }
        return arr;

    }


    // Örnek 12: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak
    // 120-140 arasında rasgele sayılar atayın.
    // Oluşturduğunuz Array in içerinde kaç adet 125 sayısı vardır?

    public static int kacAdetIstenenSayiVar(int boyut, int from, int to, int istenen) {
        int tane = 0;
        int[] arr = randomClass(boyut, from, to);
        for (int i = 0; i < boyut; i++) {
            if (arr[i] == istenen) {
                tane++;
            }
        }
        return tane;
    }


    // Örnek 13: Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını kullanarak
    // 120-140 arasında rasgele sayılar atayın.
    // Oluşturduğunuz Array içerisindeki en büyük 2. sayıyı bulun.
    // (Array.sort kullanılmayacak)

    public static int enBuyukIkinciSayi(int[] arr) {
        int max = arr[0];
        int enBuyukIkinciSayi = arr[1];

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


// Örnek 14: Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
// [2,3,3,4,5,6,5,6,3] → true
// [2,4,5,8,8] → false
// [1,2,3] → true [1,2] → false


    public static boolean ardiArdinaSiraliSAyiVarMi(int[] arr) {
        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i + 1] == arr[i + 2] - 1) {
                return true;
            }
        }
        return false;
    }


    // Örnek 15: Array’in içerindeki eşi olmayan yalnız sayıları bulan ve
    // bunları ekrana yazdıran metodu yazınız. (sağında veya solunda aynı sayı yoksa yalnızdır.)
    // [2,3,3,4,5,6,5,6,3] → 2,4,5,6,3 [2,2,5,8,8] →5
    // [2,2,3] → 3
    // [1,2] → 1,2

    public static String yalnizSayilar(int[] arr) {
        String sayilar = "";
        if (arr[0] != arr[1]) {
            sayilar += arr[0] + " ";
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                sayilar += arr[i] + " ";
            }
        }

        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            sayilar += arr[arr.length - 1] + " ";
        }

        return sayilar;
    }


// Ornek 16: Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız.
    // (eşitlik durumda herhangi birini alabilir,1 den fazla bulunmuyorsa -1 döndürecek)
    //[2,3,3,3,6,6,5,6,3] → 3 [2,4,5,8,8] → 8
    //[2,4,5,8] → -1

    public static int enCokVeriyiDondur(int[] arr) {
        int maxCount = 1;
        int deger = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                deger = arr[i];
            }
        }

        if (maxCount == 1) {
            return -1;
        }
        return deger;

    }


//  Örnek 17:Array’in içerindeki duplicate sayı varsa true yoksa false döndüren metodu yazınız.
//  [1,2,8,1] true
//  [25,89,78,98] false


    public static boolean duplicate(int[] arr) {
        int yeniArr[] = Arrays.copyOf(arr, arr.length);
        Arrays.sort(yeniArr);
        for (int i = 0; i < yeniArr.length - 1; i++) {
            if (yeniArr[i] == yeniArr[i + 1]) {
                return true;
            }
        }
        return false;
    }


    // Örnek 18: «Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu.
    // Filin yemek dolu karnı horlarken bir aşağı bir yukarı gidiyordu.
    // Filin horlama sesini duyan fare yuvasından çıkıp sesin olduğu tarafa gitti,
    // filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının üzerine oturdu,
    // salıncak gibi bir o yana bir bu yana sallanırken eğleniyordu.» kelimesinde kaç adet o harfi vardır.
    // (Büyük ve küçük ihmal edilecek)


    public static int kacAdetHarf(String str, String istenenHarf) {
        String yeni[] = str.split("");
        int count = 0;
        for (int i = 0; i < yeni.length; i++) {
            if (yeni[i].equalsIgnoreCase(istenenHarf)) {
                count++;
            }
        }
        return count;
    }


// Örnek 19:Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu yazınız.
// araba ile yola çıktık fakat araba arıza yaptı  true
// araba ile yola çıktık fakat arıza yaptı        false

    public static boolean duplicateKelime(String str) {
        String[] yeni = str.split(" ");
        Arrays.sort(yeni);
        for (int i = 0; i < yeni.length - 1; i++) {
            if (yeni[i].equalsIgnoreCase(yeni[i + 1])) {
                return true;
            }
        }
        return false;
    }


    // Örnek 20:Array’in içerisindeki en küçük sayıyı bulan ve
    // array in ilk indeksine bu sayıyı atayan diğer indekslere 0 atayan metodu yazınız.
    // [5,7,1,9] [1,0,0,0]


    public static int[] enKucukSayiyiBulVeIlkIndekseAta(int[] arr) {
        int[] yeniArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(yeniArr);
        Arrays.fill(yeniArr, 1, yeniArr.length, 0);
        return yeniArr;
    }


    // Örnek 21:Array’in içerisindeki sayılardan 5 ten sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız.
    // [6,5,8,6,8,5,8] →[6,5,1,6,8,5,1]
    // [5,7,8,5,9] → [5,7,8,5,9]

    public static int[] bestenSonraSekizVarsaDegistir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                if (arr[i + 1] == 8) {
                    arr[i + 1] = 1;
                }
            }
        }
        return arr;
    }


// Örnek 22: Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız.
//           [21,7,29,12] ----→7 29


    public static String asalSayi(int[] arr) {

        String asal = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] < 2) {
                continue;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                asal += arr[i] + " ";
            }
        }
        return asal;

    }


    // Örnek 23:Array’in içerisindeki sayıları artan düzeyde sıralayınız.
    // (Arrays.sort kullanılmayacak) [21,7,29,12] ----→[7,12,21,29]

    public static int[] sortMetod(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }return arr;
    }


    // Örnek 24:Array’in içerisindeki ard arda aynı olan sayıları hariç tutarak
    // duplicate olmayan sayıların toplamını veren metodu yazınız.
    // [1,1,2,3] → 5
    // [2,5,5,5,9] →11


    public static int duplicateOlmayanSayilarinToplami(int[] arr) {
        int result = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                result += arr[i];
            }
        }
            if (arr[arr.length-1] != arr[arr.length-2]){
                result+=arr[arr.length-1];
            }
            if (arr[0]!=arr[1]){
                result+=arr[0];
            }
        return result;
    }

//
//    public static int dublicateOlmayanToplam(int[] arr) {
//        int result=0;
//        out:for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(i!=j && arr[i]==arr[j]){
//
//                    continue out;
//                }
//            }result+=arr[i];
//        }
//        return result;
//
//
//    }




    // Örnek 25: Array’in içerisindeki sayıların toplamını veren
    //           fakat 5 ile 9 dahil arasındaki sayıları toplama dahil etmeyen metod.
    //           [1,5,9,3] → 4
    //           [2,5,28,36,9] →2

     public static int belliAralikToplam (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 5 && arr[j] == 9) {
                    Arrays.fill(arr, i, j + 1, 0);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }








   // Örnek 26: Array’in içerisindeki ne kadar 1 var ise
   //           hepsini en sağa taşıyan metodu yazınız.
   //           [5,1,9,6,1,4,7,11,25,36] → [5,9,6,4,7,11,25,36,1,1]

public static int[] birlerSaga (int[] array){
    for (int i = 0; i <array.length ; i++) {
        if (array[i]==1){
            for (int j = i; j <array.length-1 ; j++) {
                array[j]=array[j+1];
            }
            array[array.length-1]=1;
        }
    }
    return array;
}



}