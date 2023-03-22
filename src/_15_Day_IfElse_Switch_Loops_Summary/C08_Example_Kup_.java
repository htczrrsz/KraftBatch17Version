package _15_Day_IfElse_Switch_Loops_Summary;

public class C08_Example_Kup_ {
    public static void main(String[] args) {

        // 0 ile 20 arasindaki tum sayilarin kupleri ekrana yazdir.

        for ( int i=1 ; i<=20 ; i++){    // buraya i+=3 yazarsam uc uc ekleyerek yani katlarinin karesini alir.
            System.out.println((int)Math.pow(i,3) + " ");
        }

    }
}
