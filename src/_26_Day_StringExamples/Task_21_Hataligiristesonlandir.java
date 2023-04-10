package _26_Day_StringExamples;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Task_21_Hataligiristesonlandir {
    public static void main(String[] args) {

      System.out.println(ikiFarkliKelime());



    }

    // Soru 21
    // Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın,
    // 1. veya 2. kelimeyi girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    // Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın.
    // Kullanıcı doğru giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile birleştirerek yazdırın.
    // Slm
    // Ali

    // Slm Ali


    public static String ikiFarkliKelime() {
        Scanner scan = new Scanner(System.in);
        String kelime1 = "";
        String kelime2 = "";
           System.out.println("Lutfen 1 ile 4 karakterden olusan iki kelime giriniz : ");

        int i = 0;
        while (true) {
            System.out.println("1.kelime : ");
            kelime1 = scan.nextLine();
            if (kelime1.length() > 0 && kelime1.length() < 5) {
                break;
            }
            System.out.println("Hatali giris, lutfen tekrar deneyin");
            i++;
            if (i == 3) return null;
        }
        i = 0;
        while (true) {
            System.out.println("2.kelime : ");
            kelime2 = scan.nextLine();
            if (kelime2.length() > 0 && kelime2.length() < 5) {
                break;
            }
            System.out.println("Hatali giris, lutfen tekrar deneyin");
            i++;
            if (i == 3) return null;

        }
        return kelime1.concat(" ").concat(kelime2);
    }


//    Scanner scan=new Scanner(System.in);
//    String kelime1="";
//    String kelime2="";
//        System.out.println("Lütfen 1 ila 4 karakterden oluşan 2 kelime giriniz");
//    int i=0;
//        while(true){
//        System.out.print("1.kelime: ");
//        kelime1= scan.nextLine();
//        if (kelime1.length()>0 && kelime1.length()<5){
//            break;
//        }
//        System.out.println("Hatalı giriş lütfen tekrar deneyiniz");
//        i++;
//        if(i==3) return null;
//    }
//    i=0;
//        while(true){
//        System.out.print("2.kelime: ");
//        kelime2= scan.nextLine();
//        if (kelime2.length()>0 && kelime2.length()<5){
//            break;
//        }
//        System.out.println("Hatalı giriş lütfen tekrar deneyiniz");
//        i++;
//        if(i==3) return null;
//    }
//        return  kelime1.concat(" ").concat(kelime2);


    }



