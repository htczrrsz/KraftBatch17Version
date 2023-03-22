package _09_day_OperatorsCont;

import java.util.Scanner;

public class C01_BoyKilo {
    public static void main(String[] args) {

        // Kullanicidan boy(ondalikli) ve kilosunu(ondalikli) bilgisini alip ekrana tek satirda yazdiriniz.

        Scanner input = new Scanner(System.in);   //input isminde scanner objesi olusturduk.
        System.out.println("Boyunuzu giriniz  (ornek 1.78) : ");
        double boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz  (ornek 80.5) : ");
        double kilo= input.nextDouble();

        input.nextLine();

        System.out.println("Lutfen isminizi giriniz: ");
        String isim= input.nextLine();
        // String isim = input.next(); de yazabilirdik , ilk kelimeyi aliyor sadece yani ilk bosluga kadar olan yeri.

        System.out.println(isim + " Boyunuz : " +boy + " m Kilonuz : " + kilo+ " kg");

// Scanner.next() ilk space bosluga kadar olan degerleri alir. orn; ali osman yazdiysan aliyi alir sadece.
// Scanner.nextLine() ilk enter a kadar olan yeri alir.










    }

}
