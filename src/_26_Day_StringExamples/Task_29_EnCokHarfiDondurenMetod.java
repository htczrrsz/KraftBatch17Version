package _26_Day_StringExamples;

public class Task_29_EnCokHarfiDondurenMetod {
    public static void main(String[] args) {


        System.out.println(enCokOlanHarfiDondur("Merhaba"));
        System.out.println(enCokOlanHarfiDondur("aaaaaaabbccc"));
        System.out.println(enCokOlanHarfiDondur("eeemmmsssssssssshhhhhhhhhsss"));
    }
// Soru 29
    // Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
    // Merhaba a
    // aaaaaaabbcccc a
    // eeemmmsssssssssshhhhhhhhhsss s


    public static String enCokOlanHarfiDondur(String str) {
        str=str.toLowerCase().replace(" ","");
        String result = "";
        int count;
        int sayi=0;
        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);
            count = str.length() - (str.replace(harf, "").length());

            if (count>sayi  && !result.contains(harf)){
                result= harf;
                sayi=count;
            }

        }
        return result;
    }


}
