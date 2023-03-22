package _08_day_ScannerAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // 1.adim Scanner objesi olusturalim.
        Scanner scan = new Scanner(System.in);

        // 2.adim Kullaniciyi bilgilendir ! Ne istediginizi soyleyin.
        System.out.println("Lutfen isminizi giriniz:");

        // 3.adim Girilen bilgiyi icine koyabilecegimiz variable olusturun
        //        olusturdugumuz degiskenin icine, scanner objesi ile uygun methodu cagirarak veriyi alin.

        String name = scan.nextLine();
                    // scan.nextInt , scan.nextDouble

        System.out.println("Girilen isim : " + name);

        scan.close();







    }
}
