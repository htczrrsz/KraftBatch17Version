package _12_day_SwitchCase;

import java.util.Scanner;

public class C12_Task_Size_Switch {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Bedeninizi giriniz : ");
        int beden = scan.nextInt();

        switch (beden){
            case 38,40,42:
                System.out.println(beden +" numara bir small bedendir.");
                break;
            case 44,46,48:
                System.out.println(beden+ " numara bir medium bedendir. ");
                break;
            case 50,52,54:
                System.out.println(beden+ " numara bir large bedendir. ");
                break;
            default:
                System.out.println("Hatali giris");


        }



    }
}
