package _10_day_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class Homework_Cigarettes {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name : ");
        String name = scan.nextLine();

        System.out.println("Please enter your age : ");
        byte age = scan.nextByte();

        boolean isEligibleToBuyCigarettes = age >=21 ;

        System.out.println(name + " is eligible to buy cigarettes : " + isEligibleToBuyCigarettes);



    }
}
