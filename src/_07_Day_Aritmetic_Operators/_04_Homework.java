package _07_Day_Aritmetic_Operators;

import java.util.Scanner;

public class _04_Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac saniye : ");
        int sn=scan.nextInt();
        int saat=sn/3600;
        int dk=sn%3600/60;
        int saniye=sn%60;
        System.out.println("saat = " + saat);
        System.out.println("dk = " + dk);
        System.out.println("saniye = " + saniye);

    }
}
