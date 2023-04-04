package _26_Day_StringExamples;

public class Task_7_HarfKaldir {
    public static void main(String[] args) {

        System.out.println(harfKaldir("Merhaba", "a"));

        System.out.println(harfKaldir2("Merhaba", 'a'));

    }

    // Kullanıcıdan bir kelime ve bir harf alın
    // kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
    // (Merhaba, a) Merhb


    public static String harfKaldir(String str, String harf) {
        return str.replace(harf, "");
    }


    public static String harfKaldir2(String str, char harf) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != harf) {
                result += str.charAt(i);
            }

        }
        return result;
    }


    
}