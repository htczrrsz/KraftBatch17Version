package _10_day_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class C01_PositiveOrNegative {
    public static void main(String[] args) {

        /*
1. Create a class called C01_PositiveAndNegative, and  write a program that can identify if the user entered number is
    positive, or negative or zero.

            Ex:
                number = 200

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz: ");
        int number=scan.nextInt();

        boolean isPositive= number>0;
        boolean isNegative= number<0;
        boolean isZero= number==0;

        System.out.println(number + " is positive number: " + isPositive );
        System.out.println(number+ " is negative number: "+ isNegative);
        System.out.println(number+ " is zero: " + isZero);


    }
}
