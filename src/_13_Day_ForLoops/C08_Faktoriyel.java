package _13_Day_ForLoops;

import java.util.Scanner;

public class C08_Faktoriyel {
    public static void main(String[] args) {

        // Faktoriyel= girilen sayiya kadar olan sayilarin carpimi
        // 3!= 3*2*1= 6
        // 4!=4*3*2*1= 24  4*3!
        //0!=1

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi : ");
        int num= scan.nextInt();

        int faktoriyel=1;

        for (int i=1; i<=num; i++){   // num dedik mesela 10 girerse konsola num=10 olacak oyle hesaplayacak.
            faktoriyel*=i;  //faktoriyel=i*faktoriyel
        }
        System.out.println(num+"! = " + faktoriyel);

    }
}
