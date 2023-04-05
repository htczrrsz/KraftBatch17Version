package _28_Day_Quiz;

public class Quiz7_faktoriyel {
    public static void main(String[] args) {


        System.out.println("faktoriyelDondur(4) = " + faktoriyelDondur(4));

    }
// Girilen sayının faktoriyelini döndüren bir metot yazınız.

    public static int faktoriyelDondur(int sayi){
        int sayi1=1;
        for (int i = 1; i <=sayi ; i++) {
            sayi1*=i;
        }return sayi1;
    }

}
