package _15_Day_IfElse_Switch_Loops_Summary;

import java.util.Scanner;

public class C10_Calisma13CiftlerTeklerToplami {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

//        System.out.println("0 ile 1000 arasinda bir sayi girin : ");
//        int sayi = scan.nextInt();
//        int toplam1=0;
//        int toplam2=0;
//        for (int i=0; i <=sayi; i++) {
//            if (i % 2 == 0) {
//                toplam1 += i;
//            }else if (!(i%2==0)){
//                toplam2+=i;
//            }
//
//        }System.out.println("Cift sayilarinin toplami = " + toplam1 + " \ntek sayilarin toplami =  " + toplam2);

        System.out.println();


        System.out.println("0 ile 1000 arasinda bir sayi giriniz: ");
        int sayi = scan.nextInt();

        int toplamTek = 0;
        int toplamCift= 0;

        int i=0;
        while (i<=sayi){
            if (i%2==0){
                toplamCift+=i;
            }else if (!(i%2==0)){
                toplamTek+=i;
            }
            i++;
        }
        System.out.println("Cift toplam = " + toplamCift+ " \nToplam tek = " + toplamTek );


    }

}
