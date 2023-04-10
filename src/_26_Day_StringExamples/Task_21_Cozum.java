package _26_Day_StringExamples;

import java.util.Scanner;

public class Task_21_Cozum {
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
        String kelime1="";
        String kelime2="";
        int kelime1Count=0;
        int kelime2Count=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("1 ila 4 harften oluşan iki kelime giriniz ");
        while(true){
            if (kelime1Count>2) {
                System.out.println("3. denemeniz başarsız olduğu için sistemden çıkış yapılıyor");
                return null;
            }
            System.out.print("1.Kelime:");
            kelime1 = scan.nextLine();
            if (kelime1.length()<1 || kelime1.length()>4){
                kelime1Count++;
                System.out.println("Hatalı giriş: Kelime 1 ile 4 harften oluşmalıdır");
                continue;
            }
            break;
        }

        while(true){
            if (kelime2Count>2) {
                System.out.println("3. denemeniz başarsız olduğu için sistemden çıkış yapılıyor");
                return null;
            }
            System.out.print("2.Kelime:");
            kelime2 = scan.nextLine();
            if (kelime2.length()<1 || kelime2.length()>4){
                kelime2Count++;
                System.out.println("Hatalı giriş: Kelime 1 ile 4 harften oluşmalıdır");
                continue;
            }
            break;
        }
        return kelime1.concat(" " + kelime2);
    }

}
