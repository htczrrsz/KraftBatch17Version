package _27_Day_StringLabCont;

public class _02_BasaOrtayaSonaYazdir {
    public static void main(String[] args) {

//        System.out.println(kisaUzunKelime("Mehmet", "Ali"));
//        System.out.println(kisaUzunKelime("ali", "mehmet"));

        System.out.println(cokluYazdir("Ahmet", "Ali", 2, 5));

    }

    // Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa
    // uzun kelimeyi ortada 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    // Mehmet
    // Ali
    // AliAliMehmetMehmet...AliAli

//    public static String kisaUzunKelime(String str, String str2) {
//        String kelime = "";
//        if (str.length() > str2.length()) {
//            kelime = str2 + str2;
//            for (int i = 0; i < 30; i++) {
//                kelime += str;
//            }
//            return kelime + str2 + str2;
//        } else {
//            kelime = str + str;
//            for (int i = 0; i < 30; i++) {
//                kelime += str2;
//            }
//            return kelime + str + str;
//        }
//    }

    public static String cokluYazdir(String str1, String str2, int ilkDongu, int ortaDongu) {
        String result = "";
        if (str1.length() < str2.length()) {

            for (int i = 0; i < ilkDongu; i++) {
                result += str1;
            }
            for (int i = 0; i < ortaDongu; i++) {
                result += str2;

            }
            for (int i = 0; i < ilkDongu; i++) {
                result += str1;
            }
        } else if (str1.length() > str2.length()) {

            for (int i = 0; i < ilkDongu; i++) {
                result += str2;
            }
            for (int i = 0; i < ortaDongu; i++) {
                result += str1;

            }
            for (int i = 0; i < ilkDongu; i++) {
                result += str2;
            }
        }return result;

    }
}