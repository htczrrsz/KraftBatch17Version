package _07_Day_Aritmetic_Operators;

import java.util.Scanner;

public class _01_Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yaricapi giriniz:");
        double yaricap=scan.nextDouble();
        double PI=Math.PI;
        double cevre=2*PI*yaricap;
        double alan=PI*yaricap*yaricap;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
