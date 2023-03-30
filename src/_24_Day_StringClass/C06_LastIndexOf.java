package _24_Day_StringClass;

public class C06_LastIndexOf {
    public static void main(String[] args) {

        // indexOf() ilk bulunanin indeksini getirir.
        // lastIndexOf

        String str="Merhaba";
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));

        System.out.println("----------------");

        int length= str.length();

        int lengthFinal = str.replace("a","").length();  // BURA ONEMLI !! sildigimiz seyin length ini aldik

        System.out.println(str+ " icerisinde a " + (length-lengthFinal) +" adet mevcuttur." );

        System.out.println("-----------------");



    }
}
