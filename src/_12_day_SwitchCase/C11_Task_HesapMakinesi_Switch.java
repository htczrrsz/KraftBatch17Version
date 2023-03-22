package _12_day_SwitchCase;

import java.util.Scanner;

public class C11_Task_HesapMakinesi_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz : ");
        int sayi1= scan.nextInt();

        System.out.println("ikinci sayiyi giriniz: ");
        int sayi2= scan.nextInt();

        System.out.println("Yapmak istediginiz islemi seciniz (ornek: +, - , * ,/ )  :");
        String islem = scan.next();

        switch (islem){
            case "+" :
                System.out.println(sayi1+sayi2);
                break;
            case "-":
                System.out.println(sayi1-sayi2);
                break;
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("Hatali giris");


        }


    }
}
