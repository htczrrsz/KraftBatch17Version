package _10_day_UnaryLogicalOperAndReview;

public class C04_UnaryOperators {
    public static void main(String[] args) {
        // +,-,++,__

        int num1= +3;
        int num2= -2;

        System.out.println(num1>0);  //true
        System.out.println(num2>0);  //false

        System.out.println("------");


        int a = 10;
        ++a;   //a=a+1  pre increment : sayinin degerini hemen bir artiriyor. a=11
        System.out.println("a= " + a);  // a=11

        --a;  //  pre decrement : sayinin degerini hemen bir azaltir. // a=10
        System.out.println("a = " + a);

        System.out.println("---------");


        int b= 99;

        System.out.println(++b);  // pre increment //100

        int c=99;
        System.out.println(c++);   //c yi konsola 99 yazacak ---> c=100 ; olacak sonra ama.
        System.out.println(c);   //100

        System.out.println("------");

        int x=201;
        System.out.println(--x);  // 200

        int y= 201;
        System.out.println(y--);  // post decrement  // konsola 201 ama y degeri 200 yapti.
        System.out.println(y);

        System.out.println("--------");



    }
}
