package _20_Day_CustomMethods_Overloading;

public class C13_Fibonacci {
    public static void main(String[] args) {

        System.out.println("fibonacciDizisi(5) = " + fibonacciDizisi(5));

    }

    public static int fibonacciDizisi(int terimSayisi) {
        int result=0;
        for (int i = 0; i < terimSayisi; i++) {
            result=i+i;
            System.out.println(result);
            i+=i;
//            for (int k=0; k<i;k++ ) {
//                result +=i;


            }return result;
//            System.out.println(result);

        }
        //return result;
    }




