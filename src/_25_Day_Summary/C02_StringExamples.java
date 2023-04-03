package _25_Day_Summary;

public class C02_StringExamples {

    // length()
    // girilen String bir ifadenin uzunlugunu donduren metodu yaziniz.



    public static int uzunluk(String str){
        return str.length();
    }

    //toLowerCase
    public static String harfleriKucult(String str){
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        String cumle = "Merhaba";
        System.out.println(harfleriKucult(cumle));
        System.out.println(cumle.toLowerCase());
    }




}
