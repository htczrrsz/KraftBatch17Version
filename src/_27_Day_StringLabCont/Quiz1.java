package _27_Day_StringLabCont;

public class Quiz1 {
    public static void main(String[] args) {

        System.out.println(toplam(7));
        System.out.println(toplam(3));


    }


    public static int toplam(int sayi){
        int result=0;
        for (int i = 1; i <=sayi ; i++) {
            result+=i;
        }return result;
    }

}