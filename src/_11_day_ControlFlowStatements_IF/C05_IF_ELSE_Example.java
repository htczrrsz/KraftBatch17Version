package _11_day_ControlFlowStatements_IF;

import java.util.Scanner;

public class C05_IF_ELSE_Example {
    public static void main(String[] args) {

        // haca sicakligi 20 derecenin altindaysa hava soguk
        // 20 ve uzerindeyse hava sicak yazsin.
//
//        int sicaklik = 19;
//        if(sicaklik>=20){
//            System.out.println("Hava sicak");
//        }else {
//            System.out.println("Hava soguk");
//        }

        // kullanicidan bir tam sayi alin
        // ekrana tek mi cift mi oldugunu yazdiran programi yazin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz: ");
        int girilenSayi= scan.nextInt();

        boolean sayi=(girilenSayi%2==0);

        if(sayi){
            System.out.println("cift");
        }



    }
}
