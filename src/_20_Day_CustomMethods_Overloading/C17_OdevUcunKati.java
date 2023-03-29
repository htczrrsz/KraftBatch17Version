package _20_Day_CustomMethods_Overloading;

import java.util.Scanner;

public class C17_OdevUcunKati {
    public static void main(String[] args) {


        System.out.println(ucunKati());
    }

    public static int ucunKati() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz : ");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();

        if (!(num2 % 3 == 0)) {
           num2= ucunKAtiYapma(num2);
            System.out.println("Yeni num2 = " + num2);
        }
     return (sayilariTopla(num1,num2));


    }
    public static int ucunKAtiYapma(int num2) {
        return (num2 * 3);

    }

public static int sayilariTopla(int x, int y){
        return (x+y);
}





    }





