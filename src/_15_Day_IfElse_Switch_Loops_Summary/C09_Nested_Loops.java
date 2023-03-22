package _15_Day_IfElse_Switch_Loops_Summary;

public class C09_Nested_Loops {
    public static void main(String[] args) {

//        Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15



        // int k=1;   --> k yi disarda da tanimlayabiliriz. ama icerde tanimlamak daha iyi.

        for (int i=0, k=1 ; i<5; i++){
            for (int j=0 ; j<=i ; j++){
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }


    }
}
