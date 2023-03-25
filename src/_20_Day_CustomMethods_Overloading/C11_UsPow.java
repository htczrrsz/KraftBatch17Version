package _20_Day_CustomMethods_Overloading;

public class C11_UsPow {
    public static void main(String[] args) {

        System.out.println("mathPow(3,4) = " + mathPow(3, 4));
        System.out.println("mathPow(2,5) = " + mathPow(2, 5));
        System.out.println("mathPow(-2,3) = " + mathPow(-2, 3));
        System.out.println("mathPow(2,0) = " + mathPow(2, 0));


    }

    public static int mathPow (int taban, int us){
       int result=1;
       for (int i=1; i<=us; i++){
           result*=taban;
       }
       return result;
    }



}
