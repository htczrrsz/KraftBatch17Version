package _30_Day_Review;

import java.util.Scanner;

public class C03_isPrime {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number to check if its prime :");
        int num=scan.nextInt();
        if (isPrime(19)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }



       // System.out.println("isPrime(7) = " + isPrime(7));
    }
// Write a method that takes an integer and check if the number is prime and returns a boolean

    public static boolean isPrime(int num){
        boolean isPrime= false;
        int factor=0;

        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                factor++;
                break;
            }

        }
        if (num<2){
            isPrime=false;
        }else if (num==2){
            isPrime=true;
        }else if (factor==0){
            isPrime=true;
        }else {
            isPrime=false;
        }




        return isPrime;
    }


}
