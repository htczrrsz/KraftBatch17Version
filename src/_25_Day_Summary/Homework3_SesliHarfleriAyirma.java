package _25_Day_Summary;

public class Homework3_SesliHarfleriAyirma {
    public static void main(String[] args) {

        System.out.println("mesaj(\"Deneyelim bakalim\") = " + mesaj("Deneyelim bakalim"));
        System.out.println("mesaj(\"nasil olur\") = " + mesaj("nasil olur"));

    }
// Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın.

    public static String mesaj(String mesaj) {
        String sesli = "";

        for (int i = 0; i < mesaj.length(); i++) {
            if (mesaj.charAt(i) == 'a' || mesaj.charAt(i) == 'e' || mesaj.charAt(i) == 'i' || mesaj.charAt(i) == 'o'
                    || mesaj.charAt(i) == 'u') {
                sesli += mesaj.charAt(i);
            }
        }
        return sesli;

    }
}
