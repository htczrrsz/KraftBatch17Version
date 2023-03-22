package _12_day_SwitchCase;

import java.util.Scanner;

public class C07_Switch_Case_HesapMakinesiExample {
    public static void main(String[] args) {

        // hesap makinesi

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi 1: ");
        double x= scan.nextDouble();

        System.out.println("Sayi 2:");
        double y= scan.nextDouble();

        System.out.println("Lutfen islem seciniz (+,-,*,/) ");
        String islem = scan.next();

        switch (islem){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;
            default:
                System.out.println("Hatali giris");


        }




    }
}
