package _26_Day_StringExamples;

public class Task_4_ReplaceFirst {
    public static void main(String[] args) {

        System.out.println(istenenHarfiSadeceIlkYerdeDegistirme("Merhaba", "e", "a"));

    }

// Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri alan
// ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.
//(Merhaba ,a, e) Merheba (Kasaba , a, i) Kisaba


    public static String istenenHarfiSadeceIlkYerdeDegistirme(String str, String degistirilmekIstenenHarf, String yeniIstenenHarf) {
        return str.replaceFirst(degistirilmekIstenenHarf, yeniIstenenHarf);

    }



}