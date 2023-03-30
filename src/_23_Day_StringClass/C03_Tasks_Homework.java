package _23_Day_StringClass;

import java.util.Scanner;

public class C03_Tasks_Homework {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Bir mesaj giriniz : ");
        String mesaj= scan.nextLine();

        System.out.println("mesaj.length() = " + mesaj.length());


        System.out.println("--------------------------");

        System.out.println("mesaj.charAt(mesaj.length()-1) = " + mesaj.charAt(mesaj.length() - 1));

        System.out.println("---------------------------");

        for (int i = 0; i <mesaj.length() ; i++) {
            System.out.println(mesaj.charAt(i));
        }


    }




}
