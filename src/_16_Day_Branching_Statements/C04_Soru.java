package _16_Day_Branching_Statements;

public class C04_Soru {
    public static void main(String[] args) {

        // 0 ve 20 dahil aradaki cift sayilarin toplamini ekrana ayzdiran prog yazdirin.
//        int toplam=0;
//        for (int i = 0; i <=20 ; i+=2) {
//                toplam += i;
//        }
//        System.out.print(toplam);


//          int sum=0;
//        for (int i = 0; i <=20 ; i++) {
//            if (i%2==0){
//                sum+=i;
//            }
//            System.out.println(sum
//            );
//        }


        int sum=0;
        for (int i = 0; i <=20 ; i++) {
            if (i%2==1){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);




    }
}
