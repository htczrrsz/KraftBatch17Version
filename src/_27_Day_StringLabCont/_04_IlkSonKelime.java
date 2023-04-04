package _27_Day_StringLabCont;

public class _04_IlkSonKelime {
    public static void main(String[] args) {
        System.out.println(ilkSonKelimeKontrol("Salsa", 0));


    }

    // Kullanıcıdan bir kelime alın ve
    // bu kelimenin ilk 2 harfi sonunda yer alıyorsa true almıyorsa false yazdırın.
    // Ankara false Kafka true Salsa true Saksı false

    public static boolean ilkSonKelimeKontrol (String str, int karakterSayisi){
        if (str==null || str.length()<karakterSayisi || karakterSayisi<1 ){return false;}

        return  str.substring(0,karakterSayisi).equalsIgnoreCase(str.substring(str.length()-karakterSayisi));
    }


}
