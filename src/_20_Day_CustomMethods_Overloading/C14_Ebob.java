package _20_Day_CustomMethods_Overloading;

public class C14_Ebob {
    public static void main(String[] args) {

        System.out.println("ebob(10,5) = " + ebob(10, 5));
        System.out.println("ebob(5,10) = " + ebob(5, 10));

    }

    public static int ebob(int num1, int num2){
        int ebob=1;
        for (int i=1; i<=num1&& i<=num2; i++){
            if (num1%i==0 && num2%i==0){
                ebob=i;
            }
        }
        return ebob;

    }


}
