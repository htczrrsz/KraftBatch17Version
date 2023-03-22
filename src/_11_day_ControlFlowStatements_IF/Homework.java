package _11_day_ControlFlowStatements_IF;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // bir prog yazin
        // 3 tane numara kabul etsin ve buyuk olani versin.
        // 2 veya 3 farkli yol ile cozmeye calisin.
Scanner scan=new Scanner(System.in);

//        int num1, num2, num3 ;
//        num1 = scan.nextInt();
//        num2= scan.nextInt();
//        num3= scan.nextInt();

      System.out.println("Uc sayi giriniz : ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if((num1>num2)&&(num1>num3)){
            System.out.println(" num1 en buyuktur: " + num1);

        }  else if((num2>num1)&&(num2>num3)){
            System.out.println(" num2 en buyuktur: " + num2 );

        } else if((num3>num1)&&(num3>num2)){
            System.out.println(" num3 en buyuktur: " +num3 );
        }else if((num1==num2)&&(num1>num3)){
            System.out.println(" num1 ile num2 birbirine esittir ve en buyuk sayidir: " + num1  );
        }else if((num2==num3)&&(num2>num1)){
            System.out.println(" num2 ile num3 birbirine esittir ve en buyuk sayidir: " + num2 );
        }else if((num1==num2)&&(num1==num3)){
            System.out.println("Tum sayilar birbirine esittir : " + num1);
        }




     /*   System.out.println("Uc sayi giriniz: ");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();

        System.out.println("En buyuk sayi : " + Math.max(num1,Math.max(num2,num3)));
*/

    }
}
