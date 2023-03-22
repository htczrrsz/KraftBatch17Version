package _12_day_SwitchCase;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {

        // ogrencinin ortalamasini alin. (direkt al)
        // ortalama 50 altinda ise zayif
        // 50 dahil 70 arasi orta
        // 70 dahil 85 arasi iyi
        // 85 dahil ve uzeri pekiyi ekrana yazdirsin.
        // 95 e uzerimi diye kontrol edelim ve uzerinde ise onur belgesi almaya hak kazandiniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Ortalamanizi giriniz: ");
        double ort = scan.nextDouble();

        if (ort<50){
            System.out.println("zayif");
        }else if (ort>=50&& ort<70){        // ---> sadece ort<50  , ort<70 diye de yazdirabiliriz.
            System.out.println("orta");
        } else if (ort>=70&& ort<85){
            System.out.println("iyi");
        }else {
            System.out.println("pekiyi");
            if(ort>=95){
                System.out.println("Onur belgesi almaya hak kazandiniz.");
            }
        }



//        if(ort<50){
//            System.out.println("zayif");
//        }else if(ort<70) {                  GIBI
//            System.out.println("orta");
//        }else if ()..

    }
}
