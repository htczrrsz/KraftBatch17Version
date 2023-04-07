package _30_Day_Review;

public class C06_Hastane {
    public static void main(String[] args) {

        Doktor hekim1= new Doktor();
        System.out.println(hekim1.cinsiyet);
        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);

        System.out.println("-----------------------");

        hekim1.isim="Kaan";
        hekim1.soyIsim="Sarp";
        hekim1.uzmanMi=true;
        hekim1.yas=32;

        System.out.println(hekim1.isim);
        System.out.println(hekim1.yas);
        System.out.println(hekim1.uzmanMi);

        System.out.println("-------------------------");

        System.out.println(Doktor.fakulte);   // static degiskene class ismi ile erisilebilir.

        System.out.println(hekim1.fakulte);   // obje ile de static degiskene ulasabildik ama tavsiye edilen yontem degil.

        Doktor.fakulte="Hacettepe Tip Fakultesi";

        System.out.println(hekim1);   // referans no yazar.



        System.out.println("----------------");

        Doktor hekim2=new Doktor();
        hekim2.isim="Buket";
        System.out.println(hekim2.isim);
        System.out.println(Doktor.fakulte);


    }



}
