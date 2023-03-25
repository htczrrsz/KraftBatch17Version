package _20_Day_CustomMethods_Overloading;

public class C06_Homeworks {
    public static void main(String[] args) {

        System.out.println("isTheSameNumbers(45,56) = " + isTheSameNumbers(45, 56));
        boolean check = isTheSameNumbers(56,86);
        System.out.println("check = " + check);


    }
    public static boolean isTheSameNumbers (int num1, int num2){
        boolean result ;
        if (num1%10==num2%10){
            result=true;
        }else{
            result= false ;
        }
        return result ;
    }





}
