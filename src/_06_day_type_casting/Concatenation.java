package _06_day_type_casting;

public class Concatenation {
    public static void main(String[] args) {
        String a ="Merhaba";
        String b= "Dunya";
        String c= a+b;
        int i=10;
        //System.out.println(c+ " Bugun nasilsin");
//        System.out.println(2+5+c);  --->7Merhabadunya
//        System.out.println(a+2+5);   ----> Merhaba25
//        System.out.println(3+8+a+2+5+7); ----> 11Merhaba257
//        System.out.println(3+8+a+(2+5)+7);   ---> 11Merhaba77
        System.out.println(i+3+8+a+(2+5)+7+ " Dunya"); // ---> 21Merhaba77 Dunya
        //string gorurse string devam eder, int gorurse int devam eder.

    }
}
