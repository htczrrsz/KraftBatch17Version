package _19_Day_CustomMethods_Return;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {

    //     Kullanicidan 10'dan kucuk iki pozitif tamsayi alin
        //  faktoryel degerlerini toplayin


        Scanner scan = new Scanner(System.in);
        System.out.println(" 10'dan kucuk iki adet pozitif sayi giriniz : ");
        int i1= scan.nextInt();
        int i2= scan.nextInt();
        int sonuc = C03_Faktoriyel.faktoriyelHesapla(i1)+C03_Faktoriyel.faktoriyelHesapla(i2);
        System.out.println("sonuc = " + sonuc);

        System.out.println("C03_Faktoriyel.faktoriyelHesapla(i1) = " + C03_Faktoriyel.faktoriyelHesapla(i1));
        System.out.println("C03_Faktoriyel.faktoriyelHesapla(i2) = " + C03_Faktoriyel.faktoriyelHesapla(i2));


    }



}
