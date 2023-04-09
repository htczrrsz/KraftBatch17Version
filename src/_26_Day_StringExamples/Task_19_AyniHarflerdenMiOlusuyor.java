package _26_Day_StringExamples;

public class Task_19_AyniHarflerdenMiOlusuyor {
    public static void main(String[] args) {

        System.out.println(ayniHarflerdenMiOlusuyor("Nefes", "Enfes"));
        System.out.println(ayniHarflerdenMiOlusuyor("Iftar", "Tarif"));
        System.out.println(ayniHarflerdenMiOlusuyor("Selcuk", "Elyase"));
        System.out.println(ayniHarflerdenMiOlusuyor("Ennfes", "Nefess"));
//  sonuncusu false cikmasi gerekirken true cikiyor, duzeltemedim.
    }


    // Soru 19
    //Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa
    // (her harf eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true
    // oluşmuyorsa false yazdırın. (anagram kelime ise)
    //İftar – Tarif true
    // Zehra – Ezhar true
    // Nefes – Enfes true
    // Selcuk-Elyase false


    public static boolean ayniHarflerdenMiOlusuyor(String str, String str1) {
      //  String result = "";
        String strNew = str.toLowerCase().trim();
        String str1New = str1.toLowerCase().trim();
        if (strNew.length() != str1New.length()) {
            return false;
        }
        for (int i = 0; i < strNew.length(); i++) {
            char ch = strNew.charAt(i);
            if (str1New.indexOf(ch) == -1) {
                return false;
            }
            strNew= strNew.replace("" + ch, "");

        }
        return true;

    }
}