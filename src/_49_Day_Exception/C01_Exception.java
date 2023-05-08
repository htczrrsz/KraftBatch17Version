package _49_Day_Exception;

import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Lutfen bir sayi giriniz : ");
//
//
//        try {
//            int x = scan.nextInt();
//            System.out.println(x * 10);
//        } catch (Exception e) {
//            System.out.println("Hata alindi");
//        }
//
//
//        System.out.println("Kod devam ediyor..... ");
//        System.out.println("Kod devam ediyor..... ");
//        System.out.println("Kod devam ediyor..... ");


   //     System.out.println(bolme(5,2));



//        String[] arr={"Harun","Mehmet","Ahmet"};
//        try{
//            System.out.println(arr[5]);
//        }catch (Exception e){
//            System.out.println("Hata : " + e.getMessage());
//        }
//
//        System.out.println("Kod devam ediyor");


        System.out.println(sayiGir());

//        Scanner scan=new Scanner(System.in);
//        System.out.println("kod basladi");
//        try{
//            int x=5/0;
//        }catch (Exception e){
//            System.out.println("Hata: "+ e.getMessage());
//            System.out.println("Karariniz nedir ? (1 isleme devam 2 Programi sonlandir) " );
//            int karar=scan.nextInt();
//            if (karar!=1){
//                System.exit(0);
//            }
//
//        }
//        System.out.println("kod devam ediyor");
//
    }






        public static int bolme(int sayi, int bolen){
        try {
            return sayi/bolen;
        }catch (Exception e){
            return -1;
        }

        }



    public static int sayiGir(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi:");
        int sayi;
        try {
           sayi=scan.nextInt();
           return sayi;
        }catch (Exception e){
            System.out.print("Hatali giris, tekrar deneyiniz : ");
            return sayiGir();
        }

    }













}
