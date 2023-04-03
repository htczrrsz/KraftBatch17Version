package _25_Day_Summary;

import java.util.Scanner;

public class Homework13_KarakterSayisiKarsilastirma {
    public static void main(String[] args) {

        System.out.println(lengthControl());
    }


    public static String lengthControl(){
           while(true){
               Scanner scan= new Scanner(System.in);
               System.out.println("Kelime girin:");
               String kelime1 = scan.nextLine();
               System.out.println("Kelime girin:");
               String kelime2= scan.nextLine();

            if (kelime1.equalsIgnoreCase(kelime2)){
                return "Bu kelimeler ayni" ;
            }else if(kelime1.length()==kelime2.length()){
               return "Karakter sayisi esit";
            }else
                System.out.println("Tekrar kelime girin : ");

           }
       }

}


