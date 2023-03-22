package _16_Day_Branching_Statements;

public class C05_Soru_5inKatlari {
    public static void main(String[] args) {

        // 1den 100e kadar 5 in katlarini ekrana yazdiran prog continue kullanarak yazdirin


        for (int i = 1; i <=100 ; i++) {
            if (!(i%5==0)){
                continue;
            }
            System.out.print(i+" ");

            }





    }
}
