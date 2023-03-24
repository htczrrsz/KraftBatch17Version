package _20_Day_CustomMethods_Overloading;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        System.out.println("sum(10,20) = " + sum(10, 20));
        System.out.println("sum(10,20,30) = " + sum(10, 20, 30));
        System.out.println("sum(10,20,30,40) = " + sum(10, 20, 30, 40));
        System.out.println("-----------------");

        int sum= sum(10,20);
        System.out.println("sum = " + sum);

        int sum2= sum(10,20,30);
        System.out.println("sum2 = " + sum2);

        double sum3= sum(16.5, 14.7);
        System.out.println("sum3 = " + sum3);


    }


/*
        1. create a method that can find the sum of two numbers


        2. create a method that can find the sum of three numbers


        3. create a method that can find the sum of four numbers
 */

    public static int sum(int num1, int num2){
        return num1+num2;
    }

public static double sum(double num1, double num2){
        return num1+num2;
}


    public static int sum(int num1, int num2, int num3) {
        return num1 + num2+ num3;
    }



    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }






}
