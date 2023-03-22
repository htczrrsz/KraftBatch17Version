package _13_Day_ForLoops;

import java.util.Scanner;

public class C12_KelimeIsteme {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Bir kelime giriniz: ");
        String kelime= scan.nextLine();

        System.out.println("Kac kere yazdirmak istiyorsunuz ? : ");
        int tekrarSayisi= scan.nextInt();

        for (int i=1; i<=tekrarSayisi; i++){
            System.out.println(kelime);

        }




    }
}
