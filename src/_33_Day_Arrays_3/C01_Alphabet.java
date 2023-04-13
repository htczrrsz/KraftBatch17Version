package _33_Day_Arrays_3;

import java.util.Arrays;

public class C01_Alphabet {
    public static void main(String[] args) {

        //  In a char[] write all the alphabet in reversed order

        char[] alphabet;
        alphabet=new char[26];

        char ch='Z';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=ch;
            ch--;
        }
        System.out.println(Arrays.toString(alphabet));


        for (char c : alphabet) {
            c=ch;
            ch--;
        }
        System.out.println(Arrays.toString(alphabet));

    }



}
