package _19_Day_CustomMethods_Return;

import _07_Day_Aritmetic_Operators.ScannerExample;

import java.util.Scanner;

public class C09_Tasks_Exercise {
    public static void main(String[] args) {

        System.out.println("matematikselIslem(40,3) = " + matematikselIslem(40, 3));
        System.out.println("dortIslem(3,4,'+') = " + dortIslem(3, 4, '+'));
        System.out.println("dortIslem(4,5,'*') = " + dortIslem(4, 5, '*'));
        System.out.println("---------");
        int sonuc= dortIslem(5,6,'*')+dortIslem(7,4,'/');
        System.out.println("sonuc = " + sonuc);

    }

    Scanner scan = new Scanner(System.in);

    /**
     * toplama isleminin matematiksel gorunumu
     *
     * @param x
     * @param y
     * @return
     */
    public static String matematikselIslem(int x, int y) {
        String result = " ";
        return result = ("x+y = " + (x + y));

    }


    public static int dortIslem(int x, int y, char k) {
        int islem=1;
        switch (k) {
            case '+':
                islem = (x+y);
                break;
            case '-':
                islem= x-y;
                break;
            case '*':
                islem= x*y;
                break;
            case '/':
                islem= x/y;
                break;


        }
        return islem ;
    }



}
