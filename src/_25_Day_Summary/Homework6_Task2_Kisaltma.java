package _25_Day_Summary;

public class Homework6_Task2_Kisaltma {
    public static void main(String[] args) {

        System.out.println(birlestirme("Hatice", "Zararsiz"));

    }


 //   İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna kısaltın
    //   yani fazla karakterleri atın.
    //   Ve isminizle soy adınızı birleştirin.

    public static String birlestirme(String isim, String soyisim){
            int isimLength = isim.length();
            int soyisimLength = soyisim.length();

            if (isimLength>soyisimLength){
                return (isim.substring(0,soyisimLength) +" " + soyisim);
            }else if (soyisimLength>isimLength){
                return ( isim+" " +soyisim.substring(0,isimLength ));
            } else{
                return "Hatali giris";
            }
    }


}
