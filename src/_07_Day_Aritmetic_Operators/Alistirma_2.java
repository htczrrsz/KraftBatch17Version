package _07_Day_Aritmetic_Operators;

import java.util.Scanner;

public class Alistirma_2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Fizik notu:");
        double fizik = scan.nextDouble();
        System.out.println("Kimya notu:");
        double kimya=scan.nextDouble();
        System.out.println("Matematik notu:");
        double mat=scan.nextDouble();
        double ortalama=(fizik+kimya+mat)/3;
        System.out.println("ortalama = " + ortalama);


    }
}
