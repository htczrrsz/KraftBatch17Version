package _26_Day_StringExamples;

public class Task_5_HerHarfiUcKereYazdir {
    public static void main(String[] args) {

        System.out.println(herHarfiUcDefaYazdirma("Merhaba"));
        System.out.println(herHarfiUcDefaYazdirma("Hatice"));


    }

    // Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    //Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii

    public static String herHarfiUcDefaYazdirma(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <3 ; j++) {
                result+=str.charAt(i);
            }
        }return result;
    }


}
