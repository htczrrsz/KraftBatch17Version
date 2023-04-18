package _36_Day_Wrapper_Class;

import java.util.Arrays;

public class C05_Odev {
    public static void main(String[] args) {

        // String icindeki sayilari bir array icinde donduren bir metod yaziniz.

        String str = "|''11'>>///M++>,,_//e%%&/'-&&r//%<>/)h>%//'9a+%^^^((b><###a678* +%&&/))<+J>>>" +
                ">56a##v||;;;a~>>> 4500001<<İ##n--//+%^^s>><<|478a12%%n" +
                "*-<<|>>012345l679--a**//##++34r``~~((ı[234]+||";

        System.out.println(Arrays.toString(sayilar(str)));


    }

    public static int[] sayilar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);
            }

        }
        String array[] = result.split("");
        int[] sayi1 = new int[array.length];
        for (int i = 0; i < sayi1.length; i++) {
            sayi1[i] = Integer.parseInt(array[i]);
        }

        return sayi1;


    }

//
//    public static int[] sayilar2(String str) {
//String[] arr= str.split("");
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.substring(0))) {
//                arr[i] += str.substring(i,i+1);
//            }
//
//        }
//        String array[] = result.split("");
//        int[] sayi1 = new int[array.length];
//        for (int i = 0; i < sayi1.length; i++) {
//            sayi1[i] = Integer.parseInt(array[i]);
//        }
//
//        return sayi1;
//
//    }


}