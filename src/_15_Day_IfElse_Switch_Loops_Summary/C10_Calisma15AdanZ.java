package _15_Day_IfElse_Switch_Loops_Summary;

public class C10_Calisma15AdanZ {
    public static void main(String[] args) {


        for (char harf= 'a'; harf<='z'; harf++){
            System.out.print(harf + " ");
        }

        System.out.println();

        char harf= 'a';
        while (harf<='z'){
            System.out.print(harf+ " ");
            harf++;
        }

        System.out.println();


        char harfBuyuk = 'A';
        do{
            System.out.print(harfBuyuk+ " ");
            harfBuyuk++;
        }while (harfBuyuk<='Z');



    }
}
