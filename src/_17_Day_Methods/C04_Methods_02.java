package _17_Day_Methods;

import java.util.Scanner;

public class C04_Methods_02 {
    public static void main(String[] args) {

        kiloOkkaCevir();
       // aritmeticOrtalama();

       // max();

//        enBuyuk();
//

 }


//    public static void aritmeticOrtalama(){
//        double x=3, y=5,z=10;
//        double result= (x+y+z)/3;
//        System.out.println("ortalama : " + result);



    //}
// bir metod yazin iki sayidan buyuk olani versin.

//    public static void max(){
//        int x=5, y=10;
//        System.out.println(Math.max(x,y));
//    }

//    public static void enBuyuk(){
//        int x=10, y=20;
//        int max;
//        if (x>y){
//            max=x;
//        }else {
//            max=y;
//        }
//        System.out.println("En buyuk sayi: " + max);
//    }
//
//
//
//
//}

// method kiloyu okka cins  okka=1.282 kg

        public static void kiloOkkaCevir(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Kilogram: ");
            double kilogram= scan.nextDouble();
            double okka = 1.282*kilogram;
            System.out.println(kilogram+ " kilogram " + okka + " okkadir");

        }





           }
