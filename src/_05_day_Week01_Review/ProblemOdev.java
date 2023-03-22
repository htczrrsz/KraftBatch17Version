package _05_day_Week01_Review;

public class ProblemOdev {
    public static void main(String[] args ){
       /* int soru= 60;
        double net= 51.25;
        double toplamYanlis=soru-net;
        double yanlis1=1.25;
        double yanlisSayisi= toplamYanlis/yanlis1;
        System.out.println("Yanlis sayisi= " + yanlisSayisi); */

// yanlis soru= (soru sayisi-net)/1.25;

    /*    double soruSayisi= 60;
        double net= 51.25;
        double yanlisSoru=(soruSayisi-net)/1.25;
        System.out.println("yanlisSoru = " + yanlisSoru);
        */

        double toplamSoruAdedi=60;
        double oran=4;
        double net = 51.25;

        double yanlisAdet=(toplamSoruAdedi-net)/(1+1/oran);

        System.out.println(yanlisAdet);

    }
}
