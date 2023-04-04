package _26_Day_StringExamples;

public class Task_10_Ilk5KarakterYazdirmaYaDaNoktaIleTamamlama {
    public static void main(String[] args) {


        System.out.println(ilk5KarakteriniALVeyaNoktaIleTamamla("Alp",5));

    }

    //  Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
    // 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    // Sabun Sabun Merhaba Merha Ali Ali..
    // Hey Hey..
    // Pi Pi...

    public static String ilk5KarakteriniALVeyaNoktaIleTamamla(String str, int istenenKarakterSayisi) {
        String result = "";
        if (str.length() < istenenKarakterSayisi) {
            for (int i = 0; i < (istenenKarakterSayisi - str.length()); i++) {
                result += ".";

            }
            return str + result;

        } return str.substring(0,istenenKarakterSayisi);

    }


    }
