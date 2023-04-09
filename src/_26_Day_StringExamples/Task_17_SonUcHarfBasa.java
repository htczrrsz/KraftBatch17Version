package _26_Day_StringExamples;

public class Task_17_SonUcHarfBasa {
    public static void main(String[] args) {

        System.out.println(sonUcHarfBasa("Merhaba"));
        System.out.println(sonUcHarfBasa("Ali"));
        System.out.println(sonUcHarfBasa("Hatice"));

    }

    // Soru 17
//  Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve
//  bu kelimenin son 3 harfini kelimeden keserek kelimenin başına ekleyin.
//  Merhaba abaMerh Ali Ali


    public static String sonUcHarfBasa(String str){
        String str1=str.trim();
        String str2=str1.replace(str1.substring(str1.length()-3),"");
        return str1.substring(str1.length()-3).concat(str2);
    }


}
