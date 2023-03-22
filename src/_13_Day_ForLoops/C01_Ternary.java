package _13_Day_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
         kullanicidan pozitif bir tamsayi alin
         sayi cift ise "sayi cift"
         degilse "tek sayi" yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir sayi giriniz: ");
        int num= scan.nextInt();

        if (num%2==0){
            System.out.println("Sayi cift");
        }else{
            System.out.println("Sayi tek");
        }

        System.out.println("===============");

// TERNARY

        System.out.println(num%2==0? "Cift Sayi":"Tek Sayi");

        // (Condition) ? (return if true)  : (return if false)

        System.out.println("==========");
        String result =num%2==0 ? "Cift sayi" : "Tek sayi";
        System.out.println(result);

//      Ternary operator:   (condition) ? (return if true) : (return if false);


    }
}
