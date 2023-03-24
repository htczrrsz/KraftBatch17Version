package _20_Day_CustomMethods_Overloading;

public class C04_MethodOverloading2 {
    public static void main(String[] args) {


        calculateArea(3,4);
        calculateArea(4,4);
        calculateArea(3);



    }

    /*
    CalculateArea isminde method yazin ve overload olsun. Birincisi kare-dikdortgen alanini hesaplasin
    ikincisi dairenin alanini hesaplasin. PI= 3.14
     */

    public static void calculateArea (int a, int b){
        System.out.println(a*b);
    }


    public static void calculateArea (int radius){
        System.out.println(Math.round(Math.PI*radius*radius));
    }

// cannot overload with return type
//public static int calculateArea(int a, int b){
//
//}



}
