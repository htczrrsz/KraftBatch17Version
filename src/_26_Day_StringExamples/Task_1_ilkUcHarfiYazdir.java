package _26_Day_StringExamples;

public class Task_1_ilkUcHarfiYazdir {
    public static void main(String[] args) {

        System.out.println(ilkUcHarf("Merhaba"));
        System.out.println(ilkUcHarf("Mer"));
        System.out.println(ilkUcHarf("SA"));


    }
    // Soru 1
    // Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
    // 3 kelimeden az ise inputu döndüren bir metot yazınız.
    // Merhaba Mer Ali Ali

    public static String ilkUcHarf(String str){
        if (str.length()<3){
            return str;
        }else{
            return str.substring(0,3);
        }
    }




}
