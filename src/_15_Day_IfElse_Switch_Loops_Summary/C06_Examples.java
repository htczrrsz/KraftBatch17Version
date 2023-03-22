package _15_Day_IfElse_Switch_Loops_Summary;

public class C06_Examples {
    public static void main(String[] args) {

        // Soru 1  1-100 e kadar olan cift sayilari yazin.

        for (int i=1 ; i<=100 ; i++){
            if (i%2==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println("================");

        for (int i=2 ; i<=100 ; i+=2){
                System.out.print(i+ " ");
            }


        System.out.println();


        int j=2;
        while (j<=100){
            System.out.println(j + " ");
            j+=2 ;   // j=j+2

        }


        System.out.println();

        int k=0;
        do {
            System.out.println(k+ " ");
            k+=2;
        }while (k<=100);





    }
}
