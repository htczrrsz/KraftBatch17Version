package _24_Day_StringClass;

public class C03_String_IsEmpty {
    public static void main(String[] args) {

        // isEmpty()
                  // stringin bos olup olmadigini kontrol ediyor.  boolean donuyor

        String s1= "Merhaba";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        System.out.println("----------");
        String s2="";
        System.out.println(s2.isEmpty()); // true , bos.
        System.out.println(s2.isBlank());

        String s3= " ";
        System.out.println(s3.isEmpty());  // false . dolu

        System.out.println(s3.isBlank()); // true   bosluk var mi diyor




    }
}
