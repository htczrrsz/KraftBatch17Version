package _17_Day_Methods;

public class C05_Methods_03 {
    public static void main(String[] args) {

        int sayi=5;
        kupHesapla(sayi);

        int sayi1=10;
        kareHesapla(sayi1);

        kareHesapla(5);

        isimYaz("Hatice");



        max(5,10);


        ortalama(4,6);
    }


    // f(x)=x*x*x
    public static void kupHesapla(int x){
        int result= x*x*x;
        System.out.println("Sonuc: "+ result);
    }

// 1  sayinin karesini yazan metod yaz
    public static void kareHesapla(int y){
        int result_=y*y;
        System.out.println("Sonuc:" + result_);
    }


    // parametre olarak isminizi alan ve sonucunda isminiz .... yazan programi yaziniz.

    public static void isimYaz(String name){
        System.out.println("Isminiz: "+ name + " dir.");
    }



    public static void max(int x, int y){
        int max;
        if (x>y){
            max=x;
        }else {
            max=y;
        }
        System.out.println("En buyuk sayi : " + max);
    }

// 2 sayinin ortalamasini veren metodu yazin

    public static void ortalama(int x, int y){
        double ort= (x+y)/2;
        System.out.println("Ortalama: "+ ort);
    }



}
