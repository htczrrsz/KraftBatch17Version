package _11_day_ControlFlowStatements_IF;

import java.util.Scanner;

public class Denemasyon_HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Bir sayi giriniz : ");
        double sayi1 = scan.nextDouble();

        System.out.print("Ikinci sayiyi giriniz");
        double sayi2= scan.nextDouble();

        double toplama = sayi1+sayi2;
        double cikarma= sayi1-sayi2;
        double carpma = sayi1*sayi2;
        double bolme = sayi1/sayi2;


        System.out.print("Hangi islemi yapmak istiyorsunuz ? : \n1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme ");
        System.out.println("Yapmak istediginiz islemi seciniz : (1,2,3,4) ");
        int secilenIslem= scan.nextInt();




        if(secilenIslem==3){
            System.out.println("islem sonucu : "+ carpma );

        } else if(secilenIslem==4){
            System.out.println("islem sonucu : " + bolme);

        }else if (secilenIslem==1){
            System.out.println("islem sonucu : " + toplama);

        }else if (secilenIslem==2){
            System.out.println("islem sonucu : " + cikarma);
        }




    }
}
