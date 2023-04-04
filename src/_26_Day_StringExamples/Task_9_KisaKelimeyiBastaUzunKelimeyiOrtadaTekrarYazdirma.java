package _26_Day_StringExamples;

public class Task_9_KisaKelimeyiBastaUzunKelimeyiOrtadaTekrarYazdirma {
    public static void main(String[] args) {


        System.out.println(kisaUzunBasSonEkleme("Mehmet", "Ali"));
        System.out.println(kisaUzunBasSonEkleme("Ahu", "Hasan"));
        System.out.println(kisaUzunBasSonEkleme("Ahu", "Cem"));

    }

    // Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30 defa
    // kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    // Mehmet
    // Ali
    // AliAliMehmetMehmetMehmet....AliAli




    public static String kisaUzunBasSonEkleme(String str, String str2){
        String result="";
          if (str.length()>str2.length()) {
            result=str2+str2;
            for (int i = 0; i < 30; i++) {
                result += str;
            }return result +str2+str2;

          }
        else if (str2.length()>str.length()){
            result= str+str;
            for (int i = 0; i <30 ; i++) {
                result+=str2;
            }return result+str+str;
        }else{
            return str+str2;
          }

            }



}



