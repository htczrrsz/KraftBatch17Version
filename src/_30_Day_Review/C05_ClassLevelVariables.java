package _30_Day_Review;

public class C05_ClassLevelVariables {


    /*
    Bir class icerisnde tum methodlarin icerisinde bir degiskene erismek istiyorsam
    onu metodlarin disinda class in icinde tanimlamak gerekiyor, --> Class Level

    1. Class icerisinde tanimlanan degiskenin scope'u tum classtir.
    2. Class level degiskenlere ilk deger atanmasa da olur.
    3. Deger atanmadan da bu degiskenler kullanilabilir. JAVA bunlara default degerler zaten atar.
    4. static olarak tanimlanan degiskenler diger tum classlardan Class ismi ile erisilebilir oluyor.
    5. Eger metod da static ise , icerisine static olmayan hicbir degisken almaz.



     */

    static int turkish_PI=3;   // bunu diger classlardan da cagirabiliriz.
    static String turkishPizza;
    int i2;  // bunu baska classlardan kullanamayiz. tanimlamamiz lazim.
    static int i;
    static boolean b2;
    static char ch;

    public static void main(String[] args) {
        System.out.println("turkish_PI = " + turkish_PI);
        System.out.println("turkishPizza = " + turkishPizza);  // null atayacak.
        System.out.println("i = " + i);     // 0
        System.out.println("b2 = " + b2);   // false
        System.out.println("ch = " + ch);   //

    }

public static void yMethod(){
    System.out.println("i = " + i);
    // System.out.println("i2 = " + i2);   // instance,  static olmadigi icin yukardaki static olmayani kullanabildik.
                                        // ama metodumuz static olmadigi icin de metodu kullanamiyoruz.
}



}
