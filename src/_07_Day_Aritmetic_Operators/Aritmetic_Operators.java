package _07_Day_Aritmetic_Operators;

public class Aritmetic_Operators {
    public static void main(String[] args){
    /*    int x=5;
        int y=10;
        int z=x+y;
        System.out.println(z);   */


//        int dogumYil=1990;
//        int yas=2023-dogumYil;
//        System.out.println("yas: " +yas);


//        int dogumYil=1990;
//        int yas= 2023-dogumYil;
//        int ahmetYas= yas-5;
//        System.out.println("Ahmet Yas = " + ahmetYas);


//        double PI=3.14;     // math. 'dan us veya karekok(sqrt) vs hesaplatabiliyoruz... !!
//        double r=3;         // double PI=Math.PI;
//        double area=PI*r*r;
//        double area2= Math.PI*Math.pow(r,2);
//        double cevre=2*PI*r;
//        System.out.println("area = " + area);
//        System.out.println("area2 = " + area2);
//        System.out.println("cevre = " + cevre);


        // 300 Fahreheit kac celcius'tur ?
        // (c=(f-32)/1.8)

//        double F=300;
//        double celcius=((F-32)/1.8);
//        System.out.println("celcius = " + celcius + " Fahrenheit'tir.");



//        double fizik=92.5;
//        double kimya=90;
//        double matematik=89;
//        double ortalama=((fizik+kimya+matematik)/3);
//        System.out.println("ortalama = " + ortalama);
//        boolean isPAss=(ortalama>80);
//        System.out.println("Ali sinifi gecti mi :"+ isPAss);


//        Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır. Toplantıya 113 katılmıştır.
//        1.Toplantı salonun toplam kapasitesi nedir?
//        2.Kaç adet boş koltuk vardır ?
//        3.Kaç adet sırada oturulmaktadır ?
//        4. Kaç sıra tamamen boş kalmıştır.
//        5.Oturulan sıralarda kaç adet boş koltuk vardır?


        int sira=15;
        int koltuk=12;
        int toplantiyaKatilanKisiSayisi=113;

        int salonKapasite=sira*koltuk;

        int bosKoltuk=salonKapasite-toplantiyaKatilanKisiSayisi;

        int oturulanSira=(toplantiyaKatilanKisiSayisi/koltuk+1);

        int bosSiraAdeti=sira-oturulanSira;

        int bosKalanKoltuk=koltuk-(toplantiyaKatilanKisiSayisi%koltuk);

        System.out.println("salonKapasite = " + salonKapasite);
        System.out.println("bosKoltuk = " + bosKoltuk);
        System.out.println("oturulanSira = " + oturulanSira);
        System.out.println("bosSiraAdeti = " + bosSiraAdeti);
        System.out.println("bosKalanKoltuk = " + bosKalanKoltuk);


    }
}
