package _17_Day_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {

        // Bilgisayarin tuttugu 0 dahil-50 arasi sayiyi 5 hamlede bulma.
        // tuttugu sayidan dusuk tahmin yaparsak yukari diyecek
        //tuttugu sayidan yuksek tahmin yaparsa asagi diyecek
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int sayi = random.nextInt(50);
        // System.out.println(sayi);

        int i = 1;
        while (i<=5) {
            System.out.println(i+".Tahmin  : ");
            int tahmin = scan.nextInt();


            if (tahmin == sayi) {
                System.out.println("DOGRU !");
                break;
            } else if (i!=5 && tahmin > sayi) {
                System.out.println("Asagi ! ");

            } else if (i!=5 && tahmin < sayi) {
                System.out.println("Yukari !");

            }
            i++;
            if (i == 6) {
                System.out.println("Malesef bilemedin. Tuttugum sayi : " + sayi);

            }


        }



    }
}