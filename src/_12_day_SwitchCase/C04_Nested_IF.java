package _12_day_SwitchCase;

import java.util.Scanner;

public class C04_Nested_IF {
    public static void main(String[] args) {

        // bir havuza giriste kullaniciya 18 yasinda olup olmadigini sorun
        // 18 yasin altindaysa ise giremezsiniz seklinde ikaz verin.
        // 18 ve uzerinde ise yaninda bayan olup olmadigini sorun.
        // bayan yoksa giremesin.
        // bayan var ise yuzme bilip bilmedigini sorun
        // yuzme bilmiyor ise yine giremesin.



        Scanner scan= new Scanner(System.in);

        System.out.println("Yasiniz : ");
        int yas= scan.nextInt();

        if(yas>=18){
            System.out.println("Yaninizda bayan var mi Evet/Hayir ");
            String yanit = scan.next();
            if(yanit.equals("Evet")){
                System.out.println("Yuzme biliyor musunuz Evet/Hayir: ");
                String yanit2= scan.next();
                if(yanit2.equals("Evet")){
                    System.out.println("Hosgeldiniz");
                }else{
                    System.out.println("Yuzme bilmeyenler giris yapamaz");
                }

                System.out.println("Hosgeldiniz");
            }else {
                System.out.println("Yaninizda bayan olmadigi icin giremezsiniz");
            }
        }else{
            System.out.println("Giremezsiniz");
        }





    }
}
