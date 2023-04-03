package _25_Day_Summary;

public class Homework8_Task4_Nickname {
    public static void main(String[] args) {

        System.out.println("nickName(\"Hatice\", \"Zararsiz\") = " + nickName("Hatice", "Zararsiz"));

    }

// İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname oluşturan bir method yazın.

    public static String nickName(String isim, String soyisim){
        String nickName = isim.substring(0,3)+soyisim.substring(soyisim.length()-3);
        return nickName;
    }



}
