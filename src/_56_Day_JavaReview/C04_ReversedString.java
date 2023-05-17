package _56_Day_JavaReview;

import java.util.Scanner;

public class C04_ReversedString {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in );
        System.out.println("Lutfen tersini yazdirmak istediginiz yaziyi giriniz: ");
        String str= scan.nextLine();
        System.out.println("reversedString(str) = " + reversedString(str));


        System.out.println(reversedString3(str));

    }

    public static String reversedString (String str){
        String reverse= "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+= str.charAt(i);
        }

        return reverse;
    }




    public static String reversedString1 (String str){
        String reverse= "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+= str.substring(i,i+1);
        }

        return reverse;
    }


    public static String reversedString2 (String str){
        String reverse= "";
        while (str.length()!=0){
            reverse+=str.charAt(str.length()-1);
            str=str.substring(0,str.length()-1);
        }
        return reverse;
    }


    public static String reversedString3 (String str){
        StringBuilder stringBuilder = new StringBuilder(str);  // stringBuffer ile de yapabiliriz.
        return stringBuilder.reverse().toString();
    }



    public static String reversedString4 (String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }


    /*

    kullanicidan bir string isteyin , stringi tersten yazdirin

     */




}
