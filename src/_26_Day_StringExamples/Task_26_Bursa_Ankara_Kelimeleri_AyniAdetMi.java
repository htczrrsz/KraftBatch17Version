package _26_Day_StringExamples;

public class Task_26_Bursa_Ankara_Kelimeleri_AyniAdetMi {
    public static void main(String[] args) {

        System.out.println(ayniSayidaMi("Ankara ile Bursa arasi 500km.", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Ankara Bursa kadar yeşil değil. Bursa bir başka.", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Istanbul çok uzak", "Ankara", "Bursa"));
        System.out.println(ayniSayidaMi("Bursa ve Istanbul deneyelim", "Bursa", "Ankara"));
    }
  // Soru 26
    //  Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true
    //  farklı sayılarda dönüyorsa false yazdıran metodu yazınız.
    //  Ankara ile Bursa arası 500 km. True
    //  Ankara Bursa kadar yeşil değil. Bursa bir başka. False
    //  İstanbul çok uzak. false

    public static boolean ayniSayidaMi(String str, String istenen1, String istenen2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().contains(istenen1.toLowerCase())) {
                str = str.replaceFirst(istenen1, "");
                count1++;
            }
            if (str.toLowerCase().contains(istenen2.toLowerCase())) {
                str = str.replaceFirst(istenen2, "");
                count2++;
            }
        }
        if (count1 == count2 && count1!=0) {
            return true;
        }
        return false;
    }

}
