package _25_Day_Summary;

public class Homework7_Task3_SoyadindanBasHarfAyirma {


// İsminizin baş harfi soy adınızda varsa
    // soy adınızı isminizin baş harfinden arındırıp yazdıran bir method oluşturun.

    public static String soyadindanBasHarfAyirma(String isim, String soyisim) {
        String yeni= " ";
        if (soyisim.contains(isim.trim().substring(0, 1))) {
              yeni = soyisim.replace(isim.substring(0, 1), "");
            return isim+ " " + yeni;
        }else{
            return "Isminizin bas harfi soyadinizda bulunmamaktadir.";
        }

    }

        public static void main (String[]args){
            System.out.println(soyadindanBasHarfAyirma("Hadi", "Hayirlisi"));
            System.out.println(soyadindanBasHarfAyirma("Hatice", " Zararsiz"));
            System.out.println(soyadindanBasHarfAyirma("Hatice", "Hahaha"));


        }


    }

