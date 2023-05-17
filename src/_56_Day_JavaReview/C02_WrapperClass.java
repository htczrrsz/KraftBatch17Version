package _56_Day_JavaReview;

import javax.swing.*;

public class C02_WrapperClass {
    public static void main(String[] args) {

        int a  = 99;
        byte b = 33;


        a = b;
        b=(byte)a;


        Integer c=a;
//      c=b;   hata ->  wrapper class uses its own data type   -> c=(int) b;


        char ch= '%';
        Character ch1= ch;



        String str="12345";

        int i = Integer.parseInt(str);   //   option+enter;  -> neye dondurdugunu gormek icin kisayol
        System.out.println("i = " + i);

        Integer integer = Integer.valueOf(str);
        System.out.println("integer = " + integer);


        System.out.println("Integer.max(9,5) = " + Integer.max(9, 5));

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Character.isAlphabetic(ch1) = " + Character.isAlphabetic(ch1));
        System.out.println("Character.isAlphabetic(ch) = " + Character.isAlphabetic(ch));
        System.out.println("Character.isAlphabetic('5') = " + Character.isAlphabetic('5'));
        System.out.println("Character.isDigit('%') = " + Character.isDigit('%'));

        System.out.println(str);


    }
}
