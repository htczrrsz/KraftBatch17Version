package _16_Day_Branching_Statements;

import java.util.Scanner;

public class C09_BankaMenusuOdev {
    public static void main(String[] args) {

        // banka menusu olusturun 1 para ekle 2 hesabi gor 3 para cek 4 cikis
        // money= 2000;
        // while--> isleme devam etmek icin 1e basin, bir ust menu icin 2 ye basin, kart iade 3.

        Scanner scan=new Scanner(System.in);



        int totalMoney=2000;
     outerLoop:   while (true) {
         System.out.println("Yapmak istediginiz islemi seciniz: \n1.Para yatir\n2.Hesabi gor\n3.Para cek\n4.Cikis");
         int secim = scan.nextInt();
         if (secim == 1) {
             deposit:
             while (true) {
                 System.out.println("Yatirmak istediginiz para miktarini giriniz: ");
                 int yatirilanMiktar = scan.nextInt();
                 totalMoney = totalMoney + yatirilanMiktar;
                 System.out.println("Toplam miktar = " + totalMoney);

                 System.out.println("Isleme devam etmek icin 1'i, bir ust menuye donmek icin 2'yi, kart iade icin 3'u secin ");
                 int secim2 = scan.nextInt();

                 if (secim2 == 1) {
                     continue deposit;
                 } else if (secim2 == 2) {
                     continue outerLoop;
                 } else if (secim2 == 3) {
                     System.out.println("Kartiniz iade ediliyor");
                     break outerLoop;
                 } else {
                     System.out.println("Hatali giris");
                     continue deposit;
                 }
             }
         } else if (secim == 2) {
             bankAccount:
             while (true) {
                 System.out.println("Toplam Miktar = " + totalMoney);

                 System.out.println("Isleme devam etmek icin 1'i, bir ust menuye donmek icin 2'yi, kart iade icin 3'u secin ");
                 int secim2 = scan.nextInt();
                 if (secim2 == 1) {
                     continue bankAccount;
                 } else if (secim2 == 2) {
                     continue outerLoop;
                 } else if (secim2 == 3) {
                     System.out.println("Kartiniz iade ediliyor");
                     break outerLoop;

                 } else {
                     System.out.println("Hatali giris");
                     continue bankAccount;
                 }
             }
         } else if (secim == 3) {
             withdrawal:
             while (true) {
                 System.out.println("Cekmek istediginiz para miktarini giriniz : ");
                 int cekilenMiktar = scan.nextInt();
                 if (cekilenMiktar > totalMoney) {
                     System.out.println("Yetersiz bakiye");
                     continue withdrawal;
                 }

                 System.out.println("Kalan para = " + (totalMoney - cekilenMiktar));
                 totalMoney -= cekilenMiktar;

                 System.out.println("Isleme devam etmek icin 1'i, bir ust menuye donmek icin 2'yi, kart iade icin 3'u secin ");
                 int secim2 = scan.nextInt();
                 if (secim2 == 1) {
                     continue withdrawal;
                 } else if (secim2 == 2) {
                     continue outerLoop;
                 } else if (secim2 == 3) {
                     System.out.println("Kartiniz iade ediliyor");
                     break outerLoop;
                 } else {
                     System.out.println("Hatali giris");
                     continue outerLoop;
                 }
             }
         } else if (secim == 4) {
             System.out.println("Kartiniz iade ediliyor.");
             break ;

         } else {
             System.out.println("Hatali islem");
         }

     }






        }

    }


