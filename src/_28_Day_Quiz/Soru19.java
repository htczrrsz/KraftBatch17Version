package _28_Day_Quiz;

public class Soru19 {
    public static void main(String[] args) {

       // System.out.println(ayniHarftenMiOlusuyor("Zehra", "Ezhar"));
        System.out.println(ayniHarftenMiOlusuyor("Nefes", "Enfes"));
//        System.out.println(ayniHarftenMiOlusuyor("Selcuk", "Elyase"));
//        System.out.println(ayniHarftenMiOlusuyor("iftar", "tarif"));


    }
// Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa
// (her harf eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true
// oluşmuyorsa false yazdırın. (anagram kelime ise)
// İftar – Tarif true Zehra – Ezhar true Nefes – Enfes true Selcuk-Elyase false


    public static boolean ayniHarftenMiOlusuyor(String str1, String str2) {
        String str1new=str1.toLowerCase();
        String str2new= str2.toLowerCase();
        if (str1new.length()!=str2new.length()){
            return false;
        }
       for (int i = 0; i <str1new.length() ; i++) {
           int index= str2new.indexOf(str1new.charAt(i));
           if (index==-1){
               return false;
           }
           str2new=str2new.substring(0,index)+str2new.substring(index+1); //harfleri buldukca bosalttik
       }
       return true;
    }


}