package _27_Day_StringLabCont;

public class Quiz7 {
    public static void main(String[] args) {


        System.out.println("faktoriyelDondur(4) = " + faktoriyelDondur(4));

    }

    public static int faktoriyelDondur(int sayi){
        int sayi1=1;
        for (int i = 1; i <=sayi ; i++) {
            sayi1*=i;
        }return sayi1;
    }

}
