package _25_Day_Summary;

public class Homework0_OdevTrimMethod {
    //trim(String str) şeklinde bir metot yazın trim gibi çalışsın  ve string döndürsün.
    // İçerisinde string in hazır metodu olan trim metodunu kullanmayın.

    public static void main(String[] args) {


        System.out.println(trimMethod("  Hat ice  "));

  }


       public static String trimMethod(String a) {
           int start = 0;
           int end = 0;

           for (int i = 0; i < a.length(); i++) {
               if (a.charAt(i) != ' ') {
                   start = i;
                   break;
               }
           }
           for (int i = a.length() - 1; i >= 0; i--) {
               if (a.charAt(i) != ' ') {
                   end = i;
                   break;
               } }
               return a.substring(start, end + 1);


           }


       }