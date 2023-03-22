package _12_day_SwitchCase;


import java.util.Scanner;

public class C08_HaftaninGunuCalismasi {
    public static void main(String[] args) {

        // haftanin gununu kullanicidan alin ve ekrana o gunun ismini yazdirin
        // 1 pazartesi
        // 3 carsamba
        // 7 pazar

        Scanner scan = new Scanner(System.in);

       /* int gun=5;

        switch (gun){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:

        }    */

        System.out.println("gun giriniz:");
        int gun = scan.nextInt();


        switch (gun) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Hatali giris");


        }

        }
}
