package _17_Day_Methods;

public class C01_Ornek {
    public static void main(String[] args) {

        // 0 ile 100 dahil 30-50 sayilarini yazdirmadan tum sayilari ekrana yazdirin.


//        for (int i = 0; i <=100 ; i++) {
//            if (i>30&&i<50){
//                continue;
//            }
//            System.out.print(i+" ");
//        }



        // 0 ile 100 dahil 13e bolunmeyen sayilari sayilari ekrana yazdirin.

        for (int i = 0; i <=100 ; i++) {
            if (i%13==0){
                continue;
            }
            System.out.print(i+" ");
        }



    }
}
