package _28_Day_Quiz;

public class Quiz4 {
    public static void main(String[] args) {
        System.out.println("concatYap(5,6) = " + concatYap(5, 6));
        System.out.println("concatYap(5,6,7) = " + concatYap(5, 6, 7));

    }

    // Concat işlemi yapan 2 adet ve
    // 3 adet değer alacak iki farklı overloading metot yazınız.


    public static int concatYap(int a, int b){
        return a+b;
    }

    public static int concatYap(int a, int b, int c){
        return a+b+c;
    }




}
