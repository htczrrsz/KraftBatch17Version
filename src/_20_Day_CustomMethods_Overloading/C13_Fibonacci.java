package _20_Day_CustomMethods_Overloading;

public class C13_Fibonacci {
    public static void main(String[] args) {

        fibonacciDizisi(5);
        System.out.println("fibonacciDizisiSon(6) = " + fibonacciDizisiSon(6));
    }

    public static void fibonacciDizisi(int terimSayisi) {
        int x = 0;
        int y = 1;
        int z;
        System.out.print(x + " ");
        System.out.print(y + " ");

        for (int i = 0; i < terimSayisi - 2; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;

        }

    }


    public static int fibonacciDizisiSon(int terimSayisi) {




            int x = 0;
            int y = 1;
            int z= 0;
        for (int i = 0; i < terimSayisi - 2; i++) {
            z = x + y;

            x = y;
            y = z;

        }
        return z;

    }



}
