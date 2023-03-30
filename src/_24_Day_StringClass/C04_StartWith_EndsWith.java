package _24_Day_StringClass;

public class C04_StartWith_EndsWith {
    public static void main(String[] args) {

        String str= "Java is cool";
        System.out.println(str.startsWith("J"));
        System.out.println(str.startsWith("j"));  //false
        System.out.println("-----------------");
        System.out.println(str.startsWith("")); //true

        System.out.println("=================");

        System.out.println(str.endsWith("l")); //true
        System.out.println(str.endsWith(" ")); //false

    }
}
