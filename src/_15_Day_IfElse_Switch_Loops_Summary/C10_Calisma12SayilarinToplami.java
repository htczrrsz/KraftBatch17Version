package _15_Day_IfElse_Switch_Loops_Summary;

import java.util.Scanner;

public class C10_Calisma12SayilarinToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println(" 0 ile 1000 arasinda bir sayi giriniz : ");
//        int sayi = scan.nextInt();
//
//        int toplam=0;
//        for (int i=0; i<=sayi; i++){
//            toplam+=i;
//        }System.out.println(toplam);

        System.out.println();


        System.out.println("0 ile 1000 arasi bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int toplam= 0 ;
        int i = 0;
        while (i<=sayi){
            toplam+=i;
            i++;
        }System.out.println(toplam);






    }
}
