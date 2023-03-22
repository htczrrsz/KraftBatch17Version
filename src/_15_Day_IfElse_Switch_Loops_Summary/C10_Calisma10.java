package _15_Day_IfElse_Switch_Loops_Summary;

public class C10_Calisma10 {
    public static void main(String[] args) {

        for (int i = 23; i <= 50; i++) {
            System.out.println(i + " C " + ((1.8 * i) + 32) + " Fahrenheit");
        }

        System.out.println();

        int i=23;
        while (i<=50){
            double fahrenheit = ((i*1.8)+32);
            System.out.println(i + " C " + fahrenheit);
            i++;
        }

    }
}
