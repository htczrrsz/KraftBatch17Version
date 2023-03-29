package _20_Day_CustomMethods_Overloading;

public class C10_BasamakSayisi {
    public static void main(String[] args) {

        System.out.println("basamakSayisiBulma(2348) = " + basamakSayisiBulma(2348));
        System.out.println("basamakSayisiBulma(3461780) = " + basamakSayisiBulma(3461780));


    }

    public static int basamakSayisiBulma (int sayi){
        int basamakSayisi=0;
        while (sayi!=0){
            sayi= sayi/10;
            basamakSayisi++;
        }
        return basamakSayisi;

    }



}
