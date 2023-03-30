package _23_Day_StringClass;

public class C01_StringIntro {
    public static void main(String[] args) {


        String str1= "hello";   // literal way --> heap memory --> String pool
        String str2= "hello";   // str2--> String Pooldaki "hello" yu isaret eder, gosterir.

        String str3= "Hello";   // literal way

        String str4= new String("hello");  // String object --> heap memory poolla isi yok

        boolean bl;
       //  System.out.println(bl);  // local degisken initilize edilmedigi icin hata verir.
        bl= str1==str2;   // true
        System.out.println("bl : " + bl);   //true

        bl= str1.equals(str2);
        System.out.println("bl : " + bl);  //true

        bl=str1==str3 ;
        System.out.println("bl : " + bl);   //false

        bl=str1==str4;
        System.out.println("bl : " + bl);  // false    // farkli referanslar objeler oldugu icin false

        bl=str1.equals(str4);
        System.out.println("bl: "+ bl);  // true // cunku sadece icinde yazana bakiyor, referanslari karsilastirmiyor.
                                                 // farkli object olmasiyla ilgilenmiyor.



    }
}
