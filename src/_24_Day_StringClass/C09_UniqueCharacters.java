package _24_Day_StringClass;

public class C09_UniqueCharacters {
    public static void main(String[] args) {

        String str= "aaabcc";   // unique olan karakteri getirsin.
                                // ilk indexle son indeks ayniysa o unique olur cunku ilk bastan seciyor index.
                               // sonuncusu da oysa demek ki ondan baska yok

        String result = "";
        for (int i=0; i<str.length(); i++ ){
            char ch = str.charAt(i);  // a
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result +=ch;
            }
        }
        System.out.println(result);




    }
}
