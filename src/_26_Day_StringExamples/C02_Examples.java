package _26_Day_StringExamples;

public class C02_Examples {
    public static void main(String[] args) {


//            String kelime = "Ankara";
//            //             0123456
//            System.out.println(karakterSay(kelime, "a"));


        System.out.println(karakterSay3("Ankara", "a"));
    }




    //Kullanıcıdan bir kelime ve bir karakter alın
    // ve bu kelimenin istenen karakterin kaç adet olduğunu
    // döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
    //Ankara,a 3 Edirne,e 2

    public static int karakterSay(String str,char c ){
        String x=c+" ";   // ----> char i stringe cevirmek icin
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.substring(i,i+1).equalsIgnoreCase(x)){
                count++;
            }
        }
        return count;

    }




//    public static int karakterSay1(String str,String c ){
//        //  String x=c+" ";    ----> char i stringe cevirmek icin
//        str=str.toLowerCase();
//        c=c.toLowerCase();
//        int count=0;
//        for (int i = 0; i <str.length() ; i++) {
//            if (str.substring(i,i+1).equalsIgnoreCase(c)){
//                count++;
//            }
//        }
//        return count;

    public static int karakterSay3(String str,String c ) {
        str = str.toLowerCase();
        c = c.toLowerCase();
        int startLength = str.length();
        int finalLength = str.replace(c, "").length();
        return startLength-finalLength;
    }
    }
