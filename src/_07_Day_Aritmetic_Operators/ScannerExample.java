package _07_Day_Aritmetic_Operators;

import java.util.Scanner;  //* koyarsak tum classlari kendi classimiza import eder yani ekler.


public class ScannerExample {
    public static void main(String[] args) {

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Lutfen bir kelime giriniz: ");
//        String str=scan.nextLine();
//        System.out.println("girdiginiz kelime: " +str + " 'dir.");



//        Scanner scan=new Scanner(System.in);
//        System.out.println("kimya");
//        int kimya=scan.nextInt();
//
//        Scanner scan=new Scanner(System.in);
//
//
//        System.out.println("Dogum yiliniz: ");
//        int yil=scan.nextInt();
//        int yas=2023-yil;
//        System.out.println("yas = " + yas);


        Scanner scan=new Scanner(System.in);
        System.out.println("kimya notu:");
        double kimya=scan.nextDouble();
        System.out.println("fizik notu:");
        double fizik=scan.nextDouble();
        System.out.println("matematik notu:");
        double matematik= scan.nextDouble();

        double ortalama=(kimya+matematik+fizik)/3;


        System.out.println("ortalama = " + ortalama);


    }
}
