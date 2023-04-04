package _26_Day_StringExamples;

public class Task_13_YinelenenKarakterleriCikart {
    public static void main(String[] args) {


        System.out.println(yinelenenKarakteriCikart("Merhaba"));
        System.out.println(yinelenenKarakteriCikart("Ananas"));
        System.out.println(yinelenenKarakteriCikart("patates"));

    }
    // Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri
    // kelimenizden çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
// Merhaba Merhab
// Ananas Anas

    public static String yinelenenKarakteriCikart(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        return result;
    }


}
