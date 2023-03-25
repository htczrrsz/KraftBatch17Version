package _20_Day_CustomMethods_Overloading;

public class C08_NegatifPozitif {
    public static void main(String[] args) {

        System.out.println("changeNegativeToPositive(-30) = " + changeNegativeToPositive(-30));
        System.out.println("changeNegativeToPositive(40) = " + changeNegativeToPositive(40));


    }

    public static int changeNegativeToPositive (int number){
        int result;
        if (number<0){
            result = -(number);

        }else{
            result=number;
        }
        return result;
    }


}
