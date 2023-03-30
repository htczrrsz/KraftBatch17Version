package _23_Day_StringClass;

import java.util.Scanner;

public class C05_Tasks_Homework {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.print("Uc kelime giriniz : ");
        String kelime1= scan.next();
        String kelime2= scan.next();
        String kelime3= scan.next();

        System.out.println("kelime1.length() = " + kelime1.length());
        System.out.println("kelime2.length() = " + kelime2.length());
        System.out.println("kelime3.length() = " + kelime3.length());

        System.out.println();

        if (kelime1.length()>kelime2.length() && kelime2.length()>kelime3.length()){
            System.out.println((kelime1.concat(" " +  kelime2).concat(" " +kelime3)));

        }else if (kelime2.length()>kelime1.length() && kelime1.length()>kelime3.length()){
            System.out.println(kelime2.concat(" "+ kelime1).concat(" " + kelime3));

        }else if (kelime3.length()>kelime1.length() && kelime1.length()>kelime2.length()){
            System.out.println(kelime3.concat(" " + kelime1).concat(" " + kelime2));

        }else if (kelime1.length()>kelime3.length() && kelime3.length()>kelime2.length()){
            System.out.println(kelime1.concat(" " + kelime3).concat(" " + kelime2));

        }else if (kelime2.length()>kelime3.length()&& kelime3.length()>kelime1.length()){
            System.out.println(kelime2.concat(" " + kelime3).concat(" " + kelime1));
        } else if (kelime3.length()>kelime2.length() && kelime2.length()>kelime1.length() ) {
            System.out.println(kelime3.concat(" "+ kelime2).concat(" "+ kelime1));
        }


    }
}
