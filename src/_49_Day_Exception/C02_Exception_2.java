package _49_Day_Exception;

import java.util.Scanner;

public class C02_Exception_2 {

    private static int count=0;   // sayiGiris metodu icin kullanilmistir/


    public static void main(String[] args) {


        System.out.println(sayiGiris());


//        System.out.println("kod basladi");
//        System.out.println(5/0);                    exception handling yapmazsak kod devam etmez
//        System.out.println("kod devam ediyor");


//        System.out.println("kod basladi");
//        try {
//            System.out.println(5/0);
//        }catch (Exception e){
//            System.out.println("hata");
//        }
//        System.out.println("kod devam ediyor");





        // faktoriyel hesabi yapan bir metod yaziniz.

//        System.out.println(faktoriyel(0));
//
//        System.out.println("0");
//        try {
//            System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");
//            System.out.println(5/0);
//            System.out.println("5");
//        }catch (Exception e){
//            System.out.println("6");
//          //  System.out.println(5/0);  buraya kadarki islemleri yapacak burda hata verecek artik .
//        }try {
//            System.out.println(5/0);
//        }catch (Exception f){
//            System.out.println("7");
//        }
//
//        System.out.println("8");





    }

    public static int faktoriyel(int sayi){

        try {
            int faktoriyel=1;
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel*=i;
            }
            return faktoriyel;
        }catch (Exception e){
            System.out.println("hata: "+e.getMessage());
            return -1;
        }

    }



    // while for kullanmadan kullaniciya 3 hak verin ve int degeri dogru girmezse ikaz vererek prgramdan atin.


    public static int sayiGiris(){

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sayi:");
            int sayi=scan.nextInt();
            count=0;
            return sayi;
        }catch (Exception e){
            count++;
            if (count==3){
                System.out.println("hakkiniz kalmamistir");
                count=0;
                System.exit(0);
            }
            System.out.print(3-count + " hakkiniz kalmistir, lutfen tekrar deneyiniz ");
            return sayiGiris();
        }

    }




}
