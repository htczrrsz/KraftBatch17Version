package _08_day_ScannerAndOperators;

import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // Sayinin karesini alin konsola yazdirin


        Scanner scan = new Scanner(System.in);
 //   (class) (nesne/obje)
        System.out.println("Lutfen bir sayi girin: ");

        int girilenSayi = scan.nextInt();

        System.out.println("Girilen sayi : " + girilenSayi);
        System.out.println("Girilen sayinin karesi: " + girilenSayi*girilenSayi);
//                                            carpim oldugu icin carpti , + olunca yapmiyor string devam ediyor

        scan.close();


    }
}
