package _26_Day_StringExamples;

public class Task_18_BenzersizHarf {
    public static void main(String[] args) {

        System.out.println(benzersizHarf("Merhaba"));
        System.out.println(benzersizHarf("Araba"));
        System.out.println(benzersizHarf("Karkas rotasi"));

    }
    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun.
    // (Büyük küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
    // Merhaba M
    // Araba r
    // Karkas rotası o


    public static String benzersizHarf(String str){
        String str1=str.toLowerCase().trim().replace(" ","");
        String result="";
        for (int i = 0; i <str1.length() ; i++) {
            char ch=str1.charAt(i);
            if (str1.indexOf(ch)==str1.lastIndexOf(ch)){
                result=""+ch;
                break;
            }
        }return result;
    }


}
