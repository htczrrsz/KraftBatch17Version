package _15_Day_IfElse_Switch_Loops_Summary;

import java.util.Scanner;

public class C10_Calisma17SifreTahmin {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

//        int sifre= 44;
//        int hak=3;
//        for (int i=1; i<=3; i++){
//            System.out.println("Sifreyi tahmin ediniz : ");
//            int tahmin= scan.nextInt();
//
//            if (tahmin==sifre){
//                System.out.println("Tebrikler sifre dogru.");
//                break;
//            }else if (tahmin!=sifre){
//                System.out.println("Sifre yanlis ! kalan tahmin hakkiniz : "+ --hak);
//            }
//        }

        System.out.println();

        int sifre = 44;
        int hak=3;

        int i = 1;
        while (i<=3){
            System.out.println("Sifreyi tahmin ediniz : ");
            int tahmin= scan.nextInt();
            if (tahmin==sifre){
                System.out.println("Tebrikler, sifre dogru ! ");
                break;
            }else if (tahmin!=sifre){
                System.out.println("Sifre yanlis, kalan tahmin hakkkiniz : " + --hak);
            }
            i++;
        }

//        String sifre_= "safak";
//        int hak_= 3;
//        for (int k=1; k <=3; k++){
//            System.out.println("Sifreyi tahmin ediniz : ");
//            String tahmin_= scan.nextLine();
//            if (tahmin_.equals(sifre_)) {
//                System.out.println("Tebrikler sifre dogru");
//                break;
//            }else {
//                    System.out.println("Sifre yanlis, kalan tahmin hakkiniz "+ --hak_);
//                }
//
//            }




    }
}
