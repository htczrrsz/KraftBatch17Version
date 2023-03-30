package _24_Day_StringClass;

import java.util.Scanner;

public class C01_StringReview {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Isminizi giriniz : ");
        String isim = scan.nextLine();

        //length(), chartAt()
        // yavuz selim

        int uzunluk = isim.length();
        char sonHarf = isim.charAt(isim.length()-1);
        System.out.println(sonHarf);

        // equals()
        System.out.println(isim.equals(" Yavuz Selim "));  // true
        System.out.println(isim==" Yavuz Selim ");   // false . referanslari karsilastiriyor o yuzden false.
        System.out.println(isim.equalsIgnoreCase(" yaVuz seLiM ")); // true

        //indexOf()
        System.out.println(isim.lastIndexOf(" "));
        int ilkIndeks= isim.indexOf(" ");
        int lastIndex= isim.lastIndexOf(" ");
        if (ilkIndeks==lastIndex){
            System.out.println("Stringde uniquetir.");
        }else{
            System.out.println("Unique dgildir.");
        }


    }
}
