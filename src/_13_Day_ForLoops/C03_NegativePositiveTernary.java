package _13_Day_ForLoops;

import java.util.Scanner;

public class C03_NegativePositiveTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int n = scan.nextInt();
// String result = "" da yazip yapabilirdik
//sonra da if (n>0){
// result= "Positive number";
// }

        if (n>0){
         //   result= "Positive Number"
            System.out.println("Positive Number");
        } else if (n<0) {
            System.out.println("Negative Number");
        }else {
            System.out.println("Zero");
        }


        System.out.println("===========");


     String result = n>0 ? "Positive number" : n<0 ? "Negative Number" :  "Zero" ;
        System.out.println(result);



    }
}
