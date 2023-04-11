package _32_Day_Arrays_2;

import java.util.Scanner;

public class C06_Mentoring_Task {
    public static void main(String[] args) {



        // gunler array i olusturun.
        // konsoldan index numarasi alip indexi aldiginiz gunu yazdirin


        String[] gunler={"Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
        System.out.println("gunler[2] = " + gunler[2]);
        System.out.println();
        Scanner sc= new Scanner(System.in);
        System.out.println("gun indexini giriniz:");
        int indexNo=sc.nextInt();
        System.out.println(gunler[indexNo]);

    }
}
