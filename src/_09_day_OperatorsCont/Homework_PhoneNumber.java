package _09_day_OperatorsCont;

import java.util.Scanner;

public class Homework_PhoneNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the country code = ");
        int countryCode = scan.nextInt();

        System.out.println("Please enter the area code = ");
        int areaCode= scan.nextInt();

        System.out.println("Please enter the local number = ");
        int localNumber= scan.nextInt();

        System.out.println("Your phone number is : (" + countryCode + ")" + areaCode + "-" + localNumber);



    }
}
