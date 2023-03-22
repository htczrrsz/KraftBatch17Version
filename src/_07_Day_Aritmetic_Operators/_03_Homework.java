package _07_Day_Aritmetic_Operators;

import java.util.Scanner;

public class _03_Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sira sayisi:");
        int siraSayisi=scan.nextInt();
        System.out.println("Koltuk sayisi:");
        int koltukSayisi=scan.nextInt();
        System.out.println("Katilan kisi sayisi:");
        int katilanKisiSayisi=scan.nextInt();

        int salonKapasitesi=siraSayisi*koltukSayisi;

        int bosKoltuk=salonKapasitesi-katilanKisiSayisi;

        int oturulanSira=(katilanKisiSayisi/koltukSayisi)+1;

        int bosSira= siraSayisi-oturulanSira;

        int bosKalanKoltukSayisi=koltukSayisi-(katilanKisiSayisi%koltukSayisi);

        System.out.println("salonKapasitesi = " + salonKapasitesi);
        System.out.println("bosKoltuk = " + bosKoltuk);
        System.out.println("oturulanSira = " + oturulanSira);
        System.out.println("bosSira = " + bosSira);
        System.out.println("bosKalanKoltukSayisi = " + bosKalanKoltukSayisi);


    }
}
