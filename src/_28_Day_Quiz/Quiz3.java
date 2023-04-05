package _28_Day_Quiz;

public class Quiz3 {
    public static void main(String[] args) {
        System.out.println("kacCharVar(\"Merhaba\",'a') = " + kacCharVar("Merhaba", 'a'));



    }
    // Kullanicidan bir String bir de char deger alin.
    // Stringin icinde kac tane char oldugunu donen bir metodla sayiyi hesaplatin.
    // Stringde kac adet o harften oldugunu da asagidaki formatta ekrana yazdirin.
    // İpucu: length(), frequency(String str,char ch)

    public static int kacCharVar(String str, char ch){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                result+=str.charAt(i);

            }
        }return result.length();

    }

}
