package _16_Day_Branching_Statements;

public class C01_Day15_Summary {
    public static void main(String[] args) {

// PIRAMIT




        for (int i = 5; i>0 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 6-i; k >0 ; k--) {
                System.out.print("* ");
            }
            System.out.println();

        }



    }
}
