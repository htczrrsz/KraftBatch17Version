package _27_Day_StringLabCont;

public class Quiz6 {
    public static void main(String[] args) {

        System.out.println("kelimelerBirbirineEsitMi(\" Merhaba\", \"merhaba  \") = " + kelimelerBirbirineEsitMi(" Merhaba", "merhaba  "));
    }


    // .equalsIgnorecase() metodunu kullanmadan girilen 2 string türündeki değeri
    // büyükküçük harfleri baz almadan kontrol eden bir metot yazınız.


    public static boolean kelimelerBirbirineEsitMi(String str1, String str2) {
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();
        if (str1.equals(str2)){
            return true;   // direkt bunu da yazabilirdik.
                           // return str1.toLowerCase().equals(str2.toLowerCase());
        }return false;

    }

// ya da direkt //


}