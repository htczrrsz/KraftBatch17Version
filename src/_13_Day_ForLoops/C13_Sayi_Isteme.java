package _13_Day_ForLoops;

import java.util.Scanner;

public class C13_Sayi_Isteme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("0 ile 1000 arasinda bir sayi giriniz : ");
        int sayi= scan.nextInt();
        int sum1 =0 ;
        int sum2=0;

        for (int i=1; i<=sayi; i++) {
           if(i%2==0){
               sum1=sum1+i;
           } else if(i%2==1){
               sum2=sum2+i;
           }
            }System.out.println("Cift sayilarin toplami = " + sum1 + " \ntek sayilarin toplami = " + sum2);



    }
 }
