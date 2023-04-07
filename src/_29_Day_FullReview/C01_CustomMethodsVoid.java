package _29_Day_FullReview;

public class C01_CustomMethodsVoid {
    public static void main(String[] args) {


        oddOrEven(5);


    }

    public static void oddOrEven (int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number ");
        }else {
            System.out.println(num + " is an odd number ");
        }
    }



}
