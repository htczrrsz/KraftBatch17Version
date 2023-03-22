package _14_Day_NestedWhileDoWhile;

import java.util.Scanner;

public class C07_ParolayiTahminEt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String parola= "safak";
        String tahmin = " ";

        int hak = 3;
        System.out.println("Parolayi tahmin ediniz (Toplam 3 hakkiniz var) :");

        while (0<hak){
            tahmin=scan.nextLine();
            if (tahmin.equals(parola)){
                System.out.println("tebrikler. parolayi bildiniz.");
                break;
            }else{
                System.out.println("Parolayi yanlis girdiniz.Kalan tahmin hakkiniz : " + (--hak));
            }

        }



    }
}
