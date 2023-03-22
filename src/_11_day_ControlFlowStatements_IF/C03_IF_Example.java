package _11_day_ControlFlowStatements_IF;

import java.util.Scanner;

public class C03_IF_Example {
    public static void main(String[] args) {


        // Ali'nin fizik notu 50
        // kimya 30, ortalamasi 50 uzerinde ise gecti yazsin, 50 ve altiysa bi sey yazdirmasin.

//        int fizik=50;
//        int kimya= 55;
//        int ortalama=(fizik+kimya)/2;
//        double gecmeNotu=50;
//        if(ortalama>gecmeNotu){
//            System.out.println("Ali gecti");
//        }


        Scanner scan=new Scanner(System.in);

        System.out.println("Ders notlarini giriniz ");
        System.out.println("Fizik: ");
        double f= scan.nextDouble();
        System.out.println("Kimya: ");
        double k= scan.nextDouble();
        System.out.print("Gecme notu: ");
        double gecmeNotu= scan.nextDouble();

        double ort=(f+k)/2;
        if(ort>=gecmeNotu){
            System.out.println("Sinifi gectiniz tebrikler ");
        } else{

        }



    }


}
