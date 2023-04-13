package _33_Day_Arrays_3;

import java.util.Arrays;

public class C04_TasksMetod {
    public static void main(String[] args) {

String str= "Merhaba Java insanlari bugun nasilsiniz ";
        System.out.println(Arrays.toString(stringToArray(str)));


        String str2="kayısı, armut, üzüm, çilek, nar";
        System.out.println(Arrays.toString(stringToArray2(str2)));

    }

    // «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
    //  element olacak şekilde bir array a dönüştüren bir method yazın.

    public static String[] stringToArray(String str){
        return str.split(" ");
    }



    //   «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
    //    element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
    //    varsa onun yerine armut atayın.


    public static String[] stringToArray2(String str){
        String[] newStr=str.split(", ");
        for (int i = 0; i < newStr.length; i++) {
            if (newStr[i].length()<5){
                newStr[i]="armut";
            }
        }

        return newStr;
    }
}
