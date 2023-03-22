package _15_Day_IfElse_Switch_Loops_Summary;

import java.util.Scanner;

public class C10_Calisma11_KacKereKelime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Bir kelime giriniz : ");
//        String kelime = scan.nextLine();
//
//        System.out.println("Kac kere yazdirmak istiyorsunuz ? ");
//        int dongu = scan.nextInt();
//
//        for (int i = 1 ; i <=dongu ; i++){
//            System.out.println(kelime);
//        }

        System.out.println();

        System.out.println("Bir kelime giriniz : ");
        String kelime= scan.nextLine();

        System.out.println("Kac kere yazdirmak istiyorsunuz ? : ");
        int tekrar = scan.nextInt();

        int i=1;
        while (i<=tekrar){
            System.out.println(kelime);
            i++;
        }



    }
}
