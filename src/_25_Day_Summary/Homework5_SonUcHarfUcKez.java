package _25_Day_Summary;

public class Homework5_SonUcHarfUcKez {
    public static void main(String[] args) {


        isimSonUcHArf("Hatice");

    }
// İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.

    public static String isimSonUcHArf (String isim){
        String ucKere="";
        for (int i = 0; i <3 ; i++) {
           ucKere= isim.substring((isim.length() - 3));
            System.out.println(ucKere);
        }return ucKere;
    }




}
