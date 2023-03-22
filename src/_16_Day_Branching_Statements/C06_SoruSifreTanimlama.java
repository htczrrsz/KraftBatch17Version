package _16_Day_Branching_Statements;

import java.util.Scanner;

public class C06_SoruSifreTanimlama {
    public static void main(String[] args) {

// Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin. Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.


        Scanner scan= new Scanner(System.in);

//        String sifre= "Harun123";
//        int i=0;
//        System.out.println("5 hakkin var");
//        while (i<5){
//            System.out.print(i+1+".Tahmin: ");
//            String tahmin= scan.next();
//            //i++;
//            if (tahmin.equals(sifre)){
//                System.out.println("Tebrikler");
//                break;
//            }
//            i++;
//            if (i==5){
//                System.out.println("Hatali , gule gule");
//                continue;
//            }
//            System.out.println("Hatali , tekrar deneyiniz. ");
//        }


        String sifre= "Harun123";
        int i=0;
        boolean flag=true;
        System.out.println("5 hakkin var");
        while (flag){
            System.out.print(i+1+".Tahmin: ");
            String tahmin= scan.next();
            //i++;
            if (tahmin.equals(sifre)){
                System.out.println("Tebrikler");
                break;
            }
            i++;
            if (i==5){
                System.out.println("Hatali , gule gule");
                flag=false;
                continue;
            }
            System.out.println("Hatali , tekrar deneyiniz. ");
        }


    }
}
