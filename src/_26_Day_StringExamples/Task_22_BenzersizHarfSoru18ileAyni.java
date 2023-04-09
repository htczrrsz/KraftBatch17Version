package _26_Day_StringExamples;

public class Task_22_BenzersizHarfSoru18ileAyni {
    public static void main(String[] args) {

        System.out.println(ilkBenzerSizHarfiBul("Merhaba"));
        System.out.println(ilkBenzerSizHarfiBul("Araba"));
        System.out.println(ilkBenzerSizHarfiBul("Karkas rotasi"));


    }
// Soru 22
    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun.
    // (Büyük küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    // Merhaba M
    // Araba r
    // Karkas rotası o

    public static String ilkBenzerSizHarfiBul(String str){
        str=str.toLowerCase().trim().replace(" ","");
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.substring(i,i+1))==str.lastIndexOf(str.substring(i,i+1))){
                result=str.substring(i,i+1);
                break;
            }
        }return result;
    }






}
