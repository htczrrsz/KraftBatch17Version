package _26_Day_StringExamples;

import java.util.Scanner;

public class Task_21_Hataligiristesonlandir {
    public static void main(String[] args) {

        System.out.println(ikiFarkliKelime("slm", "Ali"));
        System.out.println(ikiFarkliKelime("slmmmm", "hatice"));


    }

    // Soru 21
    // Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın,
    // 1. veya 2. kelimeyi girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
    // Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın.
    // Kullanıcı doğru giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile birleştirerek yazdırın.
    // Slm
    // Ali

    // Slm Ali


    public static String ikiFarkliKelime(String str1, String str4) {
        if (str1.length() > 4 && str4.length() > 4) {
            int i = 0;
            while (i < 3) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Kelimeleri tekrar giriniz : ");
                String kelime1 = scan.nextLine();
                String kelime2 = scan.nextLine();

                if (kelime1.length() <= 4 && kelime2.length() <= 4) {
                    return kelime1.concat(" " + kelime2);
                } else {
                    i++;
                    if (i == 3) {
                        return "Uc kez yanlis giris yaptiniz.";
                    }
                }
            }
        }
            return str1.concat(" " + str4);
    }



}