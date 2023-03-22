package _11_day_ControlFlowStatements_IF;

import java.util.Scanner;

public class C04_IF_ELSE {
    public static void main(String[] args) {

//        double fizik=50;
//        double kimya= 55;
//        double ortalama=(fizik+kimya)/2;
//        double gecmeNotu=50;
//        if(ortalama>gecmeNotu){
//            System.out.println("Ali gecti");
//        }else{
//            System.out.println("Ali kaldi.");
//        }


        // Fizik , kimya ve matematik notlarini konsoldan alsin
        // ortalama 80 uzerinde ise gecti yazsin.
        // 80 ve altinda ise kaldiniz yazsin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz: ");
        double fizik = scan.nextDouble();

        System.out.println("Kimya notunuzu giriniz: ");
        double kimya= scan.nextDouble();

        System.out.println("Matematik notunuzu giriniz: ");
        double matematik = scan.nextDouble();

        System.out.println("Gecme notu: ");
        double gecmeNotu = scan.nextDouble();

        double ortalama= (fizik+kimya+matematik)/3;
        if (ortalama>=80){
            System.out.println("Gectiniz");
        }else {
            System.out.println("Kaldiniz");
        }

    }
}
