package _13_Day_ForLoops;

import java.util.Scanner;

public class C15_1000eKadarToplam {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("0-1000 arasi bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int toplam =0;

        for (int i=0; i<=sayi; i++){
            toplam+=i;
        }
        System.out.print("toplam = " + toplam);


    }
}
