package _06_day_type_casting;

public class ProblemCozum {
    public static void main(String[] args) {
        //Ali sınıfta 7-7 halı saha maçı planlamak ve
        // oynanan maçta hakem olmak istiyor,
        // sınıfta 18 kişi var ise kaç kişi oyun dışı kalacaktır.

//        int sinifMevcudu= 18;
//        int takimdakiKisiSayisi=7*2;
//        int hakem=1;
//        int oyunDisiKalanKisiSayisi=(sinifMevcudu-(takimdakiKisiSayisi+hakem));
//        System.out.println(oyunDisiKalanKisiSayisi);



        //Ali oynanan maçta 1 hakem olacak şekilde
        // okulda  7-7 halı saha maçıları planlamak istiyor
        // okul mevcudu 188 ise kaç kişi dışarıda kalır.

        int okulMevcudu= 188;
        int hakem=1;
        int oyuncuSayisi=7;

        int kalan= okulMevcudu%(oyuncuSayisi*2+hakem);
        System.out.println(kalan);




    }
}
