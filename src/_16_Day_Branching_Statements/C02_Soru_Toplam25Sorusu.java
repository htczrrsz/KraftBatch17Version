package _16_Day_Branching_Statements;

import java.util.Scanner;

public class C02_Soru_Toplam25Sorusu {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

// WHILE SORUSU

//        boolean flag= true;
//
//        while (flag){
//            System.out.println("x: ");
//            int x= scan.nextInt();
//
//            System.out.println("y: ");
//            int y= scan.nextInt();
//
//            int result= x+y;
//            if (result>=25){
//                flag=false;
//                System.out.println("Toplam 25e esit veya buyuk oldugu icin programdan cikiliyor.");
//            }else {
//                System.out.println("Toplam: " + result);
//            }

 //       }

// if (result>=25){
//        System.out.println(" -->);
//  continue;
        // dedigimiz zman tekrar while dongusune girip devam eder.




        boolean flag= true;

        while (flag){
            System.out.println("x: ");
            int x= scan.nextInt();

            System.out.println("y: ");
            int y= scan.nextInt();

            int result= x+y;
            if (x==0&&y==0) {
                break;
            }
            if (result>=25) {
                System.out.println("Toplam 25e esit veya buyuk oldugu icin sonuc veremiyoruz tekrar deneyin");
                continue;
            }
                System.out.println("Toplam: " + result);
            }
        System.out.println("Program sonlandi");


    }
}
