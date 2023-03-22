package _09_day_OperatorsCont;

import java.util.Scanner;

public class C02_BedenKitleIndeksi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.

        Beden Kitle İndeksi (bki) : Kilo / (Boy(m) * Boy(m))

        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : (ornek : 80) ");
        int kilo = scan.nextInt();

        System.out.print("Boyunuzu giriniz : (ornek : 1.80) ");
        double boy= scan.nextDouble();

        double bki = kilo/(boy*boy);

        System.out.println("Kilonuz : " + kilo);
        System.out.println("Boyunuz : " + boy );
        System.out.println("Beden Kitle Indeksiniz : " + bki);







    }
}
