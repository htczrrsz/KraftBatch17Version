package _18_CustomMethods;

public class C05_Study {
    public static void main(String[] args) {

        aritmeticAverage(10,34,25);
        System.out.println("------");
        maxNumber(56,78);
        System.out.println("------");
        birthYearForCalculateAge(1993);
        System.out.println("------");
        usluKuvvet(3,2);


    }

    /**
     * average of three numbers
     * @param x
     * @param y
     * @param z
     */
    public static void aritmeticAverage(int x, int y, int z){
        double ortalama= (x+y+z)/3;
        System.out.println("Bu sayilarin aritmetik ortalamasi =  " + ortalama );
    }


    /**
     * max one of two numbers
     * @param x
     * @param y
     */
    public static void maxNumber (double x, double y){
        if (x>y){
            System.out.println("Maximum number is = " + x);
        }else{
            System.out.println("Maximum number is =" + y);
        }
    }


    /**
     * calculate age with birthYear
     * @param birthYear
     */
    public static void birthYearForCalculateAge(int birthYear){
        int age = 2023-birthYear;
        System.out.println("Your age is : " + age);
    }

    /**
     * do the first number of second number's uslu kuvvet
     * @param a
     * @param b
     */
    public static void usluKuvvet(int a, int b){
        System.out.println(Math.pow(a,b));
        }




}
