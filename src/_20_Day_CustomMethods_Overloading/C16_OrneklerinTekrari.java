package _20_Day_CustomMethods_Overloading;

import javax.swing.*;

public class C16_OrneklerinTekrari {
    public static void main(String[] args) {

        System.out.println("age(1993) = " + age(1993));

        System.out.println("kuvvetTaban(4,3) = " + kuvvetTaban(4, 3));
        System.out.println("-------");
        System.out.println("asalSayi(6) = " + asalSayi(6));
        System.out.println("asalSayi(11) = " + asalSayi(11));
        System.out.println("asalSayi(7) = " + asalSayi(7));
        System.out.println("asalSayi(15) = " + asalSayi(15));
        System.out.println("asalSayi(2) = " + asalSayi(2));

        System.out.println("--------");

        System.out.println("calculateArea(5,6) = " + calculateArea(5, 6));
        System.out.println("calculateArea(5) = " + calculateArea(5));

        System.out.println("----");
        System.out.println("methodConcat(5,\"Hatice\", true) = " + methodConcat(5, "Hatice", true));

        System.out.println("methodConcat(5, \" Hatice\", false) = " + methodConcat(5, " Hatice", false));
    }

    /**
     * a method to find age by birthYear
     *
     * @param birthYear
     * @return
     */

    public static int age(int birthYear) {
        int age = 2023 - birthYear;
        return age;
    }

    /**
     * ilk sayiyi ikinci sayinin ussu yapmak
     *
     * @param x
     * @param y
     * @return
     */
    public static int kuvvetTaban(int x, int y) {
        int yeniSayi = (int) Math.pow(y, x);
        return yeniSayi;
    }


    public static boolean asalSayi(int x) {
        boolean asalMi = true;
        if (x > 1) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    asalMi = false;
                    break;
                } else {
                    asalMi = true;

                }
            }

        }
        return asalMi;
    }


    public static double calculateArea(int kenar, int kenar2) {
        return kenar * kenar2;
    }


    public static double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

// Tam dogru degil
    public static String methodConcat(int x, String y, boolean z) {
        String method = " ";
        if (z == true) {
            return method = x + y;
        } else {
            falseIse(x, y);

        }
        return method;
    }

    public static void falseIse(int x, String str) {
        for (int i = 1; i <= x; i++) {
            System.out.println(str);
        }

    }
}



//    public static void methodX (int i, String str, boolean bl ){
//        if (bl){
//            System.out.println(i+str);
//        }else{
//            methodX(i,str);
//
//        }
//    }
//
//    public static void methodX(int num, String str){
//        for (int i=1; i<=num; i++ ) {
//            System.out.println(str);
//        }
//    }






