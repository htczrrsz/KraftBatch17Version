package _13_Day_ForLoops;

import java.util.Scanner;

public class C14_Task_TabanVeKuvvet {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Taban sayisi belirleyiniz : ");
        int taban= scan.nextInt();

        System.out.println("Kuvvet sayisi belirleyiniz : ");
        int kuvvet= scan.nextInt();
        int sonuc= taban;


        for (int i=1 ; i<kuvvet ; i++){
            sonuc*=taban;
        }
        System.out.println(sonuc);



    }
}
