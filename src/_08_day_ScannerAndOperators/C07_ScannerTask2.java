package _08_day_ScannerAndOperators;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {
        //      Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : Himmet
        //        Soyisminiz : Abi
        //        Yasiniz : 38
        //      Dogum Yeriniz: Kayseri
        //        Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soy isminizi giriniz: ");
        String soyisim= scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas= scanner.nextInt();

        scanner.nextLine();    // int degerden sonra String girdirmeye calistigimiz izin bunu yazmak gerek.

        System.out.println("Lutfen dogum yerinizi giriniz: ");
        String dogumYeri= scanner.nextLine();



        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        System.out.println("yas = " + yas);
        System.out.println("dogumYeri = " + dogumYeri);

        System.out.println("Kaydiniz basariyla tamamlanmistir.");

        scanner.close();

// Kullanicinin istedigimiz veri turunde deger girisi yapmazsa
// kodumuzda hata olusur. execution yani calisma durur.
// Hatali inputlara karsi nasil tedbirler alacagimizi daha sonra gorecegiz.
// simdi kullanici bizim talimatlarimizi kabul ediyor ve dogru input giriyor varsayiyoruz.

       //  System.out.println("Isim: " + isim +
       //         "\nSoyisim: " + soyisim .... gibi gibi yazilabilir tek satirda !!! );




    }
}
