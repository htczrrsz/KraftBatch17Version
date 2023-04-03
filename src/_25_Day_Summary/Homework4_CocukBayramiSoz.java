package _25_Day_Summary;

public class Homework4_CocukBayramiSoz {
    public static void main(String[] args) {

        System.out.println(bayramMesaji("kutlu, mutlu olsun"));
        System.out.println(bayramMesaji("sevmekle baslar her sey"));
    }

//    Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini isteyin cümle içinde
//    sev köküne sahip bir kelime var ise bir method what a lovely person(ne hoş bir insan) mesajı döndürsün.


    public static String bayramMesaji (String bayramMesaji) {

        if (bayramMesaji.contains("sev")) {
            return "What a lovely person";
        }
        return "sev kelimesi icermez";

    }


}