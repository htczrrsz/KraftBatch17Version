package _16_Day_Branching_Statements;

public class C08_NestedLoop_Branching {
    public static void main(String[] args) {

        outerLoop: for (int i = 0; i <5 ; i++) {
            System.out.println("A");
            innerLoop:for (int j = 0; j <5 ; j++) {
                if (j==2){
                    break outerLoop;
                }
                System.out.println("B");

            }

        }





    }
}
