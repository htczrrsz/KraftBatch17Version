package _26_Day_StringExamples;

public class Task_16_IlkUcHarfSona {
    public static void main(String[] args) {
        System.out.println(ilkUcHarfSonaEkle("Merhaba"));

    }

    // Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3 harfini kelimeden keserek sonuna ekleyin.
    //Merhaba habaMer Ali Ali

    public static String ilkUcHarfSonaEkle(String str){
        String str1=str.trim();
        String str2= str1.replace((str1.substring(0,3)),"");
        return str2+(str1.substring(0,3));
    }


}
