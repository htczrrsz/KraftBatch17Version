package _15_Day_IfElse_Switch_Loops_Summary;

import java.util.Scanner;

public class C04_ForLoops {
    public static void main(String[] args) {

        for (int i=0 ; i<3; i++){

        }

// kullanicinin 3 hakki olsun. sifre girsin.
        Scanner scan= new Scanner(System.in);

        System.out.println("Sifre nedir 3 hakkiniz var");

        int sifre = 56;
                             // while'da atamayi once, sarti body nin icinde yaziyoruz.
//        int i=0;
//        while (i<3){
//            System.out.println("Sifre: ");
//            int tahmin = scan.nextInt();
//            if (sifre==tahmin){
//                System.out.println("Sifre dogru");
//                break;
//            }
//
//            i++;
//        }


        boolean result= true;
        int i=0;
        while (result) {
            System.out.println("Sifre: ");
            int tahmin = scan.nextInt();
            if (sifre == tahmin) {
                System.out.println("Sifre dogru");

            }
            result = false;
            i++;

        }






    }
}
