package _07_Day_Aritmetic_Operators;

public class Aritmetic_operators_3 {
    public static void main(String[] args) {
        //4500 dk kac saattir ?
//        int dk=4500;
//        int saat=4500/60;
//        System.out.println("saat = " + saat);

        //4321dk saat dk ve saniye cinsine cevrildikten sonra saniyeyi ekrana yaziniz.
//        int dk=4321;
//        int sn=dk%60;
//        System.out.println("sn = " + sn);



       // 31502 saniye kaç saat kaç dakika kaç saniyedir? (1 saat 60 dakika 1 dakika 60 sn)

        int toplamSaniye=5400;
        int saat=toplamSaniye/3600;
       // int dk= (toplamSaniye-saat*3600)/60;

        int dakika=toplamSaniye%3600/60;

        int saniye=toplamSaniye%60;

        System.out.println("saat = " + saat);
        System.out.println("dakika = " + dakika);
        System.out.println("saniye = " + saniye);


    }
}
