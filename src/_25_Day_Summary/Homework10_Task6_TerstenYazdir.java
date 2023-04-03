package _25_Day_Summary;

public class Homework10_Task6_TerstenYazdir {
    public static void main(String[] args) {

        System.out.println("terstenYaz(\"Hatice\") = " + terstenYaz("Hatice"));


    }
// Girilen kelimeyi tersten yazdıran bir method yazın.

    public static String terstenYaz(String kelime){
        String reversed = " ";
        for (int i = kelime.length()-1; 0<=i; i--) {
            reversed+=kelime.charAt(i);
        }return reversed ;
    }


}
