package _30_Day_Review;

import javax.crypto.spec.PSource;

public class C04_LocalVariables {
    public static void main(String[] args) {

        /*
        1. Bir metod icerisinde olusturulan bir degiskenin scope'u o metodun icidir.
        Baska bir yerde o degiskeni kullanamayiz, cagiramayiz. --->  LOCAL degisken
        2. For, while, if vs. icerisinde tanimladiklarimiz da onun icerisinde gecerli sadece.
        3. Local degiskenler deger atamadan olusturulabilir. Ancak deger atamadan bu degiskenleri kullanamam.




         */

        String isim;
//        System.out.println(isim);    // local degisken initialize edilemeden kullanilamaz.

        int i;
        // i++;    initialize edilmeyen degisken kullanilamaz.


        {
            int i2=5;
            System.out.println("i2 = " + i2);
        }
        // System.out.println(i2); i2 is out of scope   !!!


        for (int j= 0;  j< 10; j++) {
            System.out.println(j+" ");
        }
    //    System.out.println(j);   out of for loop


        System.out.println("C05_ClassLevelVariables.Turkish_PI = " + C05_ClassLevelVariables.turkish_PI);


    }

    public static void xMethod(){
        int i =10;   // burda i yi kullanabiliriz.

    }



}
