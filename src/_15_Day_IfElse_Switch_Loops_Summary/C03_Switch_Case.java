package _15_Day_IfElse_Switch_Loops_Summary;

import java.util.Scanner;

public class C03_Switch_Case {
    public static void main(String[] args) {
        // byte, short, int, char, String

 /*       int x=5;

        switch (x){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");

   }
*/

        // et menu, sebze menu, cocuk menu (1-2-3)
        // et menu pirzola 50tl, tavuk 30 tl
        // sebze menu  enginar 30 tl , roka salatasi 40tl
        // cocuk menu patates kizartmasi 10tl, makarna 5tl


        Scanner scan = new Scanner(System.in);
        System.out.print("et menu, sebze menu, cocuk menu (1-2-3): ");
        int tercih_1 = scan.nextInt();


        switch (tercih_1){
            case 1:
                System.out.println("Pirzola mi(1) tavuk mu(2) ");
                int tercih_2= scan.nextInt();

                switch (tercih_2){
                    case 1:
                        System.out.println("Pirzola = 50 TL");
                        break;
                    case 2:
                        System.out.println("Tavuk = 30 TL");
                        break;



                    default:
                        System.out.println("Hatali Giris");

                }
                break;
            case 2:
                System.out.println("Enginar mi (1) roka salatasi mi (2)");
                int tercih_3 = scan.nextInt();
                switch (tercih_3){
                    case 1:
                        System.out.println("Enginar = 30 TL");
                        break;
                    case 2:
                        System.out.println("Roka salatasi = 40 TL ");
                        break;
                    default:
                        System.out.println("Hatali giris");
                }
                break;






        }



    }
}
