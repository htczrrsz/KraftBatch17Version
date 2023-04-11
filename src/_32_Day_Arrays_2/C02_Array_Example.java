package _32_Day_Arrays_2;

import java.util.Scanner;

public class C02_Array_Example {
    public static void main(String[] args) {

        String array[]=new String[3];

Scanner scan=new Scanner(System.in);
        System.out.print("1.Kelime: ");
        String kelime1= scan.nextLine();
        array[0]=kelime1;
        System.out.print("2.Kelime: ");
        String kelime2= scan.nextLine();
        array[1]=kelime2;
        System.out.print("3.Kelime: ");
        String kelime3= scan.nextLine();
        array[2]=kelime3;


        System.out.println("Girmis oldugun kelimelerden hangi kelimeyi istiyorsun ? 1-2-3 ");
        int tercih=scan.nextInt();

        switch (tercih){
            case 1:
                System.out.println(array[0]);
                break;
            case 2:
                System.out.println(array[1]);
                break;
            case 3:
                System.out.println(array[2]);
                break;
            default:
                System.out.println("Hatali giris");

        }



    }

// Kullanicidan 3 adet kelime alin ve bu uc farkli kelimeyi array icerisine atalim








}
