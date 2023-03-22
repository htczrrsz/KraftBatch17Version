package _16_Day_Branching_Statements;

import java.util.Scanner;

public class C10_SifreTekrarCozum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String sifre = "Hatice";

        int i=0;

        System.out.println("5 hakkin var");
        while (i<5){  // we can write (true) instead of (i<5)
            System.out.print(i+1 +". Tahmin:  ");
            String tahmin = scan.next();

            if (tahmin.equals(sifre)){
                System.out.println("Tebrikler");
                break;
            }i++;
            if (i==5){
                System.out.println("Hatali, tahmin hakkiniz doldu");
                break;
            }
            System.out.println("tekrar deneyin");

              }


//        String sifre = "Hatice";
//        System.out.println("5 hakkiniz var");
//        int i = 0;
//        boolean flag = true;
//        while (flag) {
//            System.out.println("Sifre tahmin ediniz : ");
//            String tahmin = scan.next();
//            if (tahmin.equals(sifre)) {
//                System.out.println("Tebrikler");
//                break;
//            } i++;
//            if (i==5){
//                System.out.println("Hatali, tahmin hakkiniz doldu.");
//               flag=false;
//                continue;
//
//            }
//            System.out.println("Tekrar deneyin");


//        }







    }
}
