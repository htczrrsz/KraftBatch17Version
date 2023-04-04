package _27_Day_StringLabCont;

public class _03_BesKaraktereTamamla {
    public static void main(String[] args) {


        System.out.println(karaktereTamamla("Alp", 5,'.'));
    }
// Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
// 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
// Sabun Sabun Merhaba Merha Ali Ali..
// Hey Hey..
// Pi Pi...


   public static String karaktereTamamla(String str1, int kacKarakterIsteniyor, char karakter){
        if (str1.length()>=kacKarakterIsteniyor){
            return str1.substring(0,kacKarakterIsteniyor);
        }
       // int count=kacKarakterIsteniyor- str1.length();

       for (int i = str1.length(); i <kacKarakterIsteniyor ; i++) {
           str1+=karakter;
       } return str1;

   }


}
