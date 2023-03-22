package _13_Day_ForLoops;

import java.util.Scanner;

public class C02_IF_Switch_Ternary {
    public static void main(String[] args) {

        // String name="Hatice";
        // System.out.println(name);
        // System.out.println(name.charAt(0));   --->  H


/*   Kullanicidan bir harf isteyin
         o harfle baslayan gun ismi varsa yazdirin
         yoksa "gecersiz harf" yazdirin*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir harf giriniz : ");
        char harf = scan.next().charAt(0); //Scanner sinifi ile harf alamiyoruz.   scan.next() String aldik.
                                           // charAt(0) metoduyla ile bu aldigimiz kelimenin ilk harfini almis olduk.

        if(harf== 'p' || harf=='P'){
            System.out.println("Pazar,Pazartesi,Persembe");
        }else if(harf=='s'|| harf=='S'){
            System.out.println("Sali");
        }else if (harf=='c'|| harf=='C'){
            System.out.println("Carsamba, Cuma, Cumartesi ");
        }else{
            System.out.println("Gecersiz harf");
        }


        System.out.println("=======");

     switch (harf){
         case 'p', 'P' :
             System.out.println("Pazartesi, Persembe, Pazar");
             break;
         case 's', 'S' :
             System.out.println("Sali");
             break;
         case 'c':
         case 'C' :
             System.out.println("Carsamba, Cuma, Cumartesi");
             break;

         default:
             System.out.println("Gecersiz");

     }

        System.out.println("-------");

        // ternary
        // (condition) ? (return if true) : (return if false)
        // (condition) ? (return if true) : (new ternary)

 //       String result = (harf=='p' || harf== 'P') ? "Pazar,Pazartesi, Persembe" : "Yanlis";
//        System.out.println(result);




        String result = (harf=='p' || harf== 'P') ? "Pazar,Pazartesi, Persembe" : (harf=='s'|| harf=='S') ? "Sali" :
                (harf=='c'|| harf=='C') ? "Carsamba, Cuma, Cumartesi" : "Yanlis";
        System.out.println(result);




    }
}
