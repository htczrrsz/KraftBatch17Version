package _41_Day_StaticAndInteritance;

import java.util.Random;

public class BankaMusteri {

    private String adSoyad;
    private String hesapNo;
    private double bakiye;
    private static int count=1;
    static private final String SIFRE="safak";

    {
        this.hesapNo=hesapNoOlustur();
    }


    public BankaMusteri(){
    }

   public static String hesapNoOlustur() {
        Random random=new Random();
        int x= random.nextInt(9000)+1000;
        String hesapNo=count+""+2023+x;
        count++;

        return hesapNo;
    }

//    public static String yeniHesapOlustur(){      eger hesapolustur metodu private static olsaydi ve baska classtan cagirmak istiyorsak
//        String hesapNoo= hesapNoOlustur();              boyle bi metod icinde private metodu cagirabiliriz.
//        return hesapNoo;
//    }


    public BankaMusteri(String adSoyad){
        this.adSoyad=adSoyad;
       // this.hesapNo=hesapNoOlustur();   yukarda yazinca buna gerek kalmiyor.
    }

    public BankaMusteri( double bakiye){

        this.bakiye=bakiye;
        //this.hesapNo=hesapNoOlustur();
    }


    public BankaMusteri(String adSoyad, double bakiye, String hesapNo){
        this.adSoyad=adSoyad;
        this.bakiye=bakiye;
        this.hesapNo=hesapNoOlustur();
    }


    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }


    public String getHesapNo() {
        return hesapNo;
    }

public void setHesapNo(String hesapNo, String sifre){
        if (sifre.equals(SIFRE)){
            this.hesapNo=hesapNo;
        }
}

    public double getBakiye() {
        return bakiye;
    }


    public void paraEkle(double para) {
        this.bakiye+= para;
    }


    public void paraCek(double para){
        if (this.bakiye>para){
            this.bakiye=this.bakiye-para;
        }
    }

public String toString(){
        return "{ ad soyad=" + adSoyad + ", hesap no= "+hesapNo +", bakiye= " +bakiye+" }";
}


}
