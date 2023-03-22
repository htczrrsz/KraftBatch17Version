package _16_Day_Branching_Statements;

import java.util.Scanner;

public class C07_HesaplamaWhileAndContinue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

//Nested loop kullanarak kullanıcıdan hangi işlemi yapmak
//// istediğini sorun. 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
//// kullanıcının isteğine göre işlem yapın. Kullanıcının seçimine göre Girilen ekrandan
//// 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç 0  devam etmek için 1 girmesini isteyin.
//
//
//        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
//        // çıkarma menüsüne hoş geldiniz
//        // x:
//        // y:
//        // result;
//        // menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz
//


        while (true){
            System.out.println("Yapmak istediginiz islemi seciniz : 1-toplama 2-Çıkarma 3-çarpma 4-cikis");
            int secim= scan.nextInt();
            if (secim==1){
                while (true) {
                    System.out.println("1.sayiyi giriniz : ");
                    int a = scan.nextInt();
                    System.out.println("2.sayiyi giriniz : ");
                    int b = scan.nextInt();
                    System.out.println("Islem sonucu : " + (a + b));
                    System.out.println("Bir ust menu icin 0, isleme devam etmek icin 1'e basiniz");
                    int secim2 = scan.nextInt();
                    if (secim2 == 1) {
                        continue;
                    } else if (secim2 == 0) {
                        break;
                    } else {
                        System.out.println("Hatali giris");

                    }  break;
                }
            }else if (secim==2) {
                while (true) {
                    System.out.println("1.sayiyi giriniz : ");
                    int a = scan.nextInt();
                    System.out.println("2.sayiyi giriniz : ");
                    int b = scan.nextInt();
                    System.out.println("Islem sonucu : " + (a - b));
                    System.out.println("Bir ust menu icin 0, isleme devam etmek icin 1'e basiniz");
                    int secim2 = scan.nextInt();
                    if (secim2 == 1) {
                        continue;
                    } else if (secim2 == 0) {
                        break;
                    } else {
                        System.out.println("Hatali giris");

                    } break;
                }
            } else if (secim==3) {
                while (true) {
                    System.out.println("1.sayiyi giriniz : ");
                    int a = scan.nextInt();
                    System.out.println("2.sayiyi giriniz : ");
                    int b = scan.nextInt();
                    System.out.println("Islem sonucu : " + (a * b));
                    System.out.println("Bir ust menu icin 0, isleme devam etmek icin 1'e basiniz");
                    int secim2 = scan.nextInt();
                    if (secim2 == 1) {
                        continue;
                    } else if (secim2 == 0) {
                        break;
                    } else {
                        System.out.println("Hatali giris");

                    }break;
                }
            }else if (secim==4){
                System.out.println("Cikis yapildi");
                break;
            }else {
                System.out.println("Hatali islem tekrar deneyin");
            }






        }




    }
}
