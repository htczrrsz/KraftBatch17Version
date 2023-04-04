package _27_Day_StringLabCont;

public class _05_SonKelimeBul {
    public static void main(String[] args) {

        System.out.println(sonKelimeBul(" harun kenan can ozsoy  "));


    }

    //  Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın Ekrana
//  "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
//  Input: "Harun Kenan Can Özsoy "
//  Output: "Soy isminiz Özsoy dır."

    public static String sonKelimeBul(String str){
        if (str==null) return null;
        str=str.trim();
        return str.substring(str.lastIndexOf(" ")+1);  // trim kullandigimiz icin son kelimeden sonra bosluk kalmiyo.
    }


}
