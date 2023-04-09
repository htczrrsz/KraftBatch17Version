package _26_Day_StringExamples;

public class Task_23_TerstenAyniMi {
    public static void main(String[] args) {
        System.out.println(terstenAyniMi("Kabak"));
        System.out.println(terstenAyniMi("Nalan"));
        System.out.println(terstenAyniMi("Kasaba"));
        System.out.println(terstenAyniMi("Ahmet"));
        System.out.println(terstenAyniMi(" Talat"));

    }
// Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu
// kelime ile aynı ise true değil ise false döndüren metot yazınız.
// Kabak true
// Nalan true
// Ara true
// talat true
// Kasaba false
// ahmet false

    public static boolean terstenAyniMi(String str){
        String result="";
        String str1=str.trim().toLowerCase();
        for (int i = str1.length()-1; 0<=i ; i--) {
            result+=str1.charAt(i);
        }if (result.equals(str1)){
            return true;
        }return false;


    }


}
