package _36_Day_Wrapper_Class;

public class C04_WrapperClass_Characters {
    public static void main(String[] args) {

    //    Character.isLetter()         harf olup olmadigi
    //    Character.isDigit()          sayi/rakam olup olmadigini kontrol ediyor.
    //    Character.isAlphabetic()     harf olup olmadigi


//        System.out.println(Character.isAlphabetic('Δ'));     true
//        System.out.println(Character.isLetter('Δ'));         true




//
//    String str= "^+!j4546*&5435-a_:';.v3258{}a();[^%";
//    String result1="";
//        for (int i = 0; i <str.length() ; i++) {
//if (Character.isLetter(str.charAt(i))){
//    result1+=str.charAt(i);
//}
//        }
//        System.out.println(result1);
//
//
//        // String icindeki gomulu cumleyi cikarin.
//
//        String str2 ="|''11'>>///M++>,,_//e%%&/'-&&r//%<>/)h>%//'9a+%^^^((b><###a678* +%&&/))<+J>>>" +
//                ">56a##v||;;;a~>>> 4500001<<İ##n--//+%^^s>><<|478a12%%n" +
//                "*-<<|>>012345l679--a**//##++34r``~~((ı[234]+||";
//
//
//        String result2="";
//        for (int i = 0; i <str2.length() ; i++) {
//            if (Character.isLetter(str2.charAt(i)) || str2.charAt(i)== ' '){
//                result2+=str2.charAt(i);
//            }
//        }
//        System.out.println(result2);
//
//
//
//        String str3 ="|''11'>>///M++>,,_//e%%&/'-&&r//%<>/)h>%//'9a+%^^^((b><###a678* +%&&/))<+J>>>" +
//                ">56a##v||;;;a~>>> 4500001<<İ##n--//+%^^s>><<|478a12%%n" +
//                "*-<<|>>012345l679--a**//##++34r``~~((ı[234]+||";
//
//        String harf="";
//        String sayi="";
//        String karakter="";
//
//        for (int i=0; i<str3.length(); i++){
//            if (Character.isLetter(str3.charAt(i))){
//                harf+=str2.charAt(i);
//            }else if (Character.isDigit(str3.charAt(i))){
//                sayi+=str3.charAt(i);
//            }else{
//                karakter+=str3.charAt(i);
//            }
//        }
//        System.out.println("harf = " + harf);
//        System.out.println("sayi = " + sayi);
//        System.out.println("karakter = " + karakter);



        String s="merhaba 3 nasilsin 10, neler23 yapiyorsun?";

        System.out.println(textSayiTopla(s));


    }

    String s="merhaba 3 nasilsin 10, neler23 yapiyorsun?";

    //Sayilari toplayip ekrana donduren metod


    public static int textSayiTopla (String str){
        String[] strArray=str.split("");
        int sayi=0;
        for (int i = 0; i <strArray.length ; i++) {

            if (Character.isDigit(strArray[i].charAt(0))){
                sayi+=Integer.parseInt(strArray[i]);
            }

        } return sayi;


    }








}
