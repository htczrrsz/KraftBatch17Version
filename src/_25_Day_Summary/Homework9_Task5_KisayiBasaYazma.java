package _25_Day_Summary;

public class Homework9_Task5_KisayiBasaYazma {
    public static void main(String[] args) {

        System.out.println("kisaOlaniBasaVeSonaYaz(\"isim\", \" sehir\") = " + kisaOlaniBasaVeSonaYaz("isim", "sehir"));


    }
// Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna ekleyen bir method yazın.

    public static String kisaOlaniBasaVeSonaYaz (String kelime1, String kelime2){
       int kelime1Length= kelime1.length();
       int kelime2Length = kelime2.length();

       if (kelime1Length<kelime2Length){
           return kelime1+kelime2+kelime1;
       }else if (kelime2Length<kelime1Length){
           return kelime2+kelime1+kelime2;
       }else{
           return kelime1+kelime2;
       }
    }



}
