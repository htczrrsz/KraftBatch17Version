package _15_Day_IfElse_Switch_Loops_Summary;

import java.util.Scanner;

public class C10_Calisma14Kuvvet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Taban sayisi seciniz : ");
        int taban = scan.nextInt();

        System.out.println("Kuvvet sayisi secin : ");
        int kuvvet = scan.nextInt();

        int sonuc=1;

        if (taban==0&&kuvvet==0){
            sonuc=0;
        }
        for (int i = 1; i<kuvvet; i++){
            sonuc=taban*sonuc;
        }
        System.out.println(sonuc);


        System.out.println();

//        System.out.println("Bir taban sayisi giriniz : ");
//        int taban= scan.nextInt();
//
//        System.out.println("Bir kuvvet sayisi giriniz : ");
//        int kuvvet = scan.nextInt();
//
//        int sonuc=1;
//        int i=1;
//        while (i<=kuvvet){
//            sonuc*=taban;
//            i++;
//        }
//        System.out.println(sonuc);

    }
}
