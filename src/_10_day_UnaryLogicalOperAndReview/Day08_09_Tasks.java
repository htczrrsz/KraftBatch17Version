package _10_day_UnaryLogicalOperAndReview;

import java.util.Scanner;

public class Day08_09_Tasks {
    public static void main(String[] args){

//        int a= 5;
//        int b= 7;
//        boolean bl;

//        bl=(a>b)&&(b==7);
//        // false && true
//        // false
//        bl= a/b>0||(b>a);
//        // false || true
//        //    true
//        bl= a-b>0 && b>a;
//        //  false && true
//        //    false
//        System.out.println("bl = " + bl);

        Scanner scan=new Scanner(System.in);


        int age= 20;
        String health= "healthy";

        boolean toBeSoldier=age>=20 && health=="healthy";

        toBeSoldier= age==22 && health=="healthy" || age>19 && health=="poorly";
        //            false  &&  true           ||    true && false
        //             false       ||       false
        //                      false
        System.out.println("to be soldier = " + toBeSoldier);

        System.out.println("=============");

        boolean x = false, y= false , z= true;

        x = !y;
       //true

        z= !x && x==z;   // ---> x true olmustu,
        // false && true
           // false

        System.out.println("x = " + x);
        System.out.println("z = " + z);

        System.out.println("-----------");

        int i = 2;
        boolean ln;

        ln= --i==i || i<1;
        //   true  || false  1=1
        //       true
        System.out.println("ln = " + ln);

        ln= i++==i || i<1;
        //   2=3 false || 3<1 false
        System.out.println("ln = " + ln);


    }
}
