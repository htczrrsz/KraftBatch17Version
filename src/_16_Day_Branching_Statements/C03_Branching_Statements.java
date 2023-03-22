package _16_Day_Branching_Statements;

public class C03_Branching_Statements {
    public static void main(String[] args) {

        //      break ,     continue ,    return
        // sonlandiriyo, devam ettiriyo, icinde bulundugu metodu sonlandiriyor


        System.out.println("Program basladi");

        for (int i = 0; i <10 ; i++) {
            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("Program sonlandi");

    }
}
