package _10_day_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


//        1. write a program that can swipe two variables' value by using a temporary variable
//
//        Ex:
//        if a= 10, b=15
//
//        output:
//        a = 15
//        b = 10

        System.out.println("a sayisi icin bir tam sayi giriniz: ");
        int a =scan.nextInt();

        System.out.println("b sayisi icin bir tam sayi giriniz: ");
        int b= scan.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        int temp= a;   // temp = 30 (biz verdik 30)

        a=b;  // a=15
        b=temp;  // b=30

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
