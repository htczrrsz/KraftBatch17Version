package _07_Day_Aritmetic_Operators;

import java.util.Scanner;

public class _02_Homework {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Fahrenheit:");
        double fahrenheit= scan.nextDouble();
        double celsius=(fahrenheit-32)/1.8;
        System.out.println("celsius = " + celsius );
    }
}
