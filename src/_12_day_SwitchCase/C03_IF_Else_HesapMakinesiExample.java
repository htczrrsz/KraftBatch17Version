package _12_day_SwitchCase;

import java.util.Scanner;

public class C03_IF_Else_HesapMakinesiExample {
    public static void main(String[] args) {
        // +, -, *, /
        // 4 islem yapacak sekilde hesap makinesi yapin.
        // kullanicidan iki sayi alin
        // yapmak istedigi islemi secsin.  +,-,*,/
        // hatali islem girislerinde kullaniciya uyari verin.
        // ekrana sonuc donduren programi yaziniz.

        Scanner scan= new Scanner(System.in);
        
//
//       System.out.println("iki sayi giriniz : ");
//        double num1 = scan.nextDouble();
//        double num2 = scan.nextDouble();
//
//        System.out.println(" yapmak istediginiz islemi seciniz :  (Ornek : 1, 2, 3, 4 ) ");
//        System.out.println("1.toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
//        int islem= scan.nextInt();
//
//        if(islem==1){
//            System.out.println(num1+num2);
//        }else if (islem==2){
//            System.out.println(num1-num2);
//        }else if (islem==3){
//            System.out.println(num1*num2);
//        }else if(islem==4){
//            System.out.println(num1/num2);
//        }else {
//            System.out.println("Hatali islem girdiniz.");
//       }

        System.out.println("Sayi 1: ");
        double x= scan.nextDouble();
        System.out.println("Sayi 2: ");
        double y= scan.nextDouble();
        System.out.println("Lutfen islem seciniz. (+,-,*,/): ");
        String islem= scan.next();

     //   double sonuc ;

        if(islem.equals("+")){
            System.out.println(x+y);
        }else if(islem.equals("-")){
            System.out.println(x-y);
        }else if(islem.equals("*")){
            System.out.println(x*y);
        }else if (islem.equals("/")){
            System.out.println(x/y);
        }else {
            System.out.println("Hatali islem girdiniz");
        }


    }
}
