package _26_Day_StringExamples;

public class Task_22_BenzersizHarfSoru18ileAyni {
    public static void main(String[] args) {

        System.out.println(ilkBenzerSizHarfBul("Merhaba"));
        System.out.println(ilkBenzerSizHarfBul("Araba"));
        System.out.println(ilkBenzerSizHarfBul("Karkas rotasi"));


    }

    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun.
    // (Büyük küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    // Merhaba M
    // Araba r
    // Karkas rotası o

    public static String ilkBenzerSizHarfBul(String str){
        str=str.toLowerCase();
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.substring(i,i+1))==str.lastIndexOf(str.substring(i,i+1))){

            }result=str.substring(i,i+1);
        }return result;
    }






}
