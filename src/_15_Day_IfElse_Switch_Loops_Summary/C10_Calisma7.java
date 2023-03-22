package _15_Day_IfElse_Switch_Loops_Summary;

public class C10_Calisma7 {
    public static void main(String[] args) {

        for (int i=10; i <=1000; i+=10){
            System.out.print(i+" ");
        }

        System.out.println();


        for (int i=10; i<=1000; i++){
            if (i%10==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        int i=10;
        while (i<=1000){
            System.out.print(i+" ");
            i+=10;
        }

        System.out.println();

        int k=10;
        while (k<=1000){
            if (k%10==0){
                System.out.print(k+" ");
            }
            k++;
        }








    }
}
