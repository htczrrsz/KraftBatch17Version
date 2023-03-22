package _12_day_SwitchCase;

import java.util.Scanner;

public class C15_Task_Tahmin_NestedIF {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        double sayi = 19;

        System.out.println("Bir tahmin sayisi giriniz: ");
        double tahmin = scan.nextDouble();

        if (tahmin<sayi){
            if (tahmin>=(sayi/2)){
            System.out.println("Tahmininiz sayidan kucuk fakat yaklastiniz.");
              }else if (tahmin<=(sayi/2))
            System.out.println("tahmininiz sayidan cok kucuk. ");
            }
        if (tahmin>sayi){
               if((tahmin>=(sayi/2))&&(tahmin<(sayi*2))){
            System.out.println("Tahmininiz sayidan buyuk fakat yaklastiniz.");

              }else if(tahmin>(sayi/2)) {
                   System.out.println("tahmininiz sayidan cok buyuk.");
               }
        }else if(tahmin==sayi){
            System.out.println("Tebrikler, sayiyi bildiniz.");
        }



    }
}
