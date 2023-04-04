package _26_Day_StringExamples;

public class Task_12_AdSoyadSonKelimeBul {
    public static void main(String[] args) {

        System.out.println(sonKelimeBul("  Harun kenan can ozsoy"));

    }

//  Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın Ekrana
//  "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
//  Input: "Harun Kenan Can Özsoy "
//  Output: "Soy isminiz Özsoy dır."


    public static String sonKelimeBul(String str){
        if (str==null){return null ;}
        str = str.trim();
        return str.trim().substring(str.lastIndexOf(" ")+1);
    }

}
