package _27_Day_StringLabCont;

public class Quiz6 {
    public static void main(String[] args) {

        System.out.println("kelimelerBirbirineEsitMi(\" Merhaba\", \"merhaba  \") = " + kelimelerBirbirineEsitMi(" Merhaba", "merhaba  "));
    }

    public static boolean kelimelerBirbirineEsitMi(String str1, String str2) {
        str1 = str1.toLowerCase().trim();
        str2 = str2.toLowerCase().trim();
        if (str1.equals(str2)){
            return true;
        }return false;

    }



}