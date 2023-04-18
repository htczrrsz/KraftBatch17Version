package _37_Day_ArrayList;

import java.util.ArrayList;

public class C01_Summary {
    public static void main(String[] args) {

      boolean b=  Character.isDigit( Integer.toString(100).split("")[0].charAt(0));
//                                                 "100"   [1,0,0]           "1"       '1'

        System.out.println(b);


        System.out.println(Integer.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Integer.max(10,20) = " + Integer.max(10, 20));

        Integer inW=new Integer(10);
        int inP=5;
        System.out.println("inW.intValue() = " + inW.intValue());

        inP=inW;

        inW=inP;



        String s="5";
        Integer k= Integer.valueOf(s);   // Integer wrapper donduruyor
        int m= Integer.parseInt(s);  //  int donduruyor.  unboxing
        Integer l=Integer.parseInt(s);  //   autoboxing


        // isDigit()  sayi olup olmadigi
        // isLetter() char harf olup olmadigi


        System.out.println("nameControl(\"Hatice Hanim\") = " + nameControl("Hatice Hanim"));
        System.out.println("nameControl(\"Hatice*2\") = " + nameControl("Hatice*2"));


    }

    public static boolean nameControl ( String str ){

        // kriterler = sayi olamaz, bosluk haricinde karakter olamaz, sembol olamaz.
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i)) || (!Character.isLetter(str.charAt(i)))){
                if (str.charAt(i)!=' '){
                    return false;
                }
            }
        }
        return true;
    }



}
