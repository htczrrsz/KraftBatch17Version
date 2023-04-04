package _26_Day_StringExamples;

public class C01_StringExamples {
    public static void main(String[] args) {

String kelime="Merhaba";
        System.out.println(ikiIndexSubString(kelime, 3, 5));
        System.out.println(ikiIndexSubString(kelime, 4, 7));

        System.out.println(subStringMethod(kelime, 5));

    }

    // cift indeks numarasi alan substring metodunuz yzdir.
    //"Merhaba"   str.substring(3,5)= ha
    // substring (String str, int start, int end)

    public static String ikiIndexSubString(String str, int start, int end){
        String result ="";
        for (int i = start; i <end ; i++) {
            result+=str.charAt(i);
        }
        return result;
    }


    //tek index  numarası alan substring metodunu yazınız
    // "Merhaba"     str.substring(3)=haba
    //  subString(String str,int index)
    public static String subStringMethod(String str, int indeks){
        String result="";
        for (int i = indeks; i <str.length() ; i++) {
            result+=str.charAt(i);
        }
        return result;
    }


}
