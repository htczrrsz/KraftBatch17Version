package _26_Day_StringExamples;

public class Task_15_UnluUnsuzHarfler {
    public static void main(String[] args) {

        System.out.println(unluUnsuzHarfler("Ankara"));
        System.out.println(unluUnsuzHarfler("Hatice"));


    }
 // soru 15
    // Kullanıcıdan bir kelime alın ve bu kelimenin
    // içerisindeki ünlü ve ünsüz harfleri ayrı ayrı ekrana yazan programı yazınız.
    // Ankara
    // ünlü harfler=Aa
    // Ünsüz harfler=nkr



    public static String unluUnsuzHarfler(String str){
        String unlu="";
        String unsuz="";

        for (int i = 0; i <str.length() ; i++) {
            if (str.substring(i,i+1).equalsIgnoreCase("a") || str.substring(i,i+1).equalsIgnoreCase("e") ||
                    str.substring(i,i+1).equalsIgnoreCase("i")
                || str.substring(i,i+1).equalsIgnoreCase("o") || str.substring(i,i+1).equalsIgnoreCase("u")) {

                if (!unlu.contains(str.substring(i,i+1))){
                    unlu+=str.substring(i,i+1);
                }

            }else
                if (!unsuz.contains(str.substring(i,i+1)))
                unsuz+= str.substring(i,i+1);

        }
        return "unlu harfler : " + unlu + " unsuz harfler : " + unsuz ;
    }



}
