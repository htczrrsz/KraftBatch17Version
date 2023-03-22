package _07_Day_Aritmetic_Operators;

import java.util.Scanner;

public class Alistirma_1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Ali'nin dogum yilini giriniz:");
        int dogumYili=scan.nextInt();
        int yil=2023;
        int alininYasi=yil-dogumYili;
        System.out.println("Ali'nin yasi:"+alininYasi);


    }

}
