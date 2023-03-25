package _20_Day_CustomMethods_Overloading;

public class C15_ucgen {
    public static void main(String[] args) {

        yildizOlusturma(3);


    }
    public static void yildizOlusturma (int sayi) {
        int yildiz;
        for (int i = 1; i <= 3; i++) {
            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");

        }

    }



}
