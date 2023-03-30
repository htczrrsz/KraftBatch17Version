package _23_Day_StringClass;

public class C02_StringClassMethods {
    public static void main(String[] args) {

        // LENGTH()

        String programmingLanguage = "java";   // string pool icerisind ebir obje olusturdu
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());


        programmingLanguage = "python";   //  String immutable(degistirilemez), javayi isaret ediyodu. simdi String poolda yeni obje olusturdu
                                          // o objenin icerisine de python yazdi.

        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        // 6 yazar yani pythonu

        System.out.println("-------");


        // toUpperCase(), tolowercase ()


        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());
        System.out.println("programmingLanguage = " + programmingLanguage);  // yine kucuk yazacak.


        programmingLanguage = programmingLanguage.toUpperCase();  //simdi buyuk harfli olani atamis olduk.
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase()); // kucuk

        System.out.println("programmingLanguage = " + programmingLanguage);  // buyuk yazacak. cunku atamadik usttekini.
                                                                             // sadece kullandik

        System.out.println("-------");

        // cHarAt()
                  //  programmingLanguage = PYTHON

        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0)); // P
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5)); // N
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());   // 6
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 1));

//        System.out.println("programmingLanguage.charAt(programmingLanguage.length()) = "
//                + programmingLanguage.charAt(programmingLanguage.length()));  // hata verir. 7. karakter yok der

        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-4) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 4));


        // CONCAT()

        System.out.println("programmingLanguage.concat(\" Programlama dili Java'dan daha kolaydir.\") = "
                + programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydir."));

        programmingLanguage = programmingLanguage.concat(" Programlama Dili Java'dan daha kolaydir.");


        // CONTAINS()
                    // boolean dondurur.

        System.out.println("programmingLanguage.contains(\"Dili\") = " + programmingLanguage.contains("Dili")); // true

        System.out.println("programmingLanguage.contains(\"python\") = " + programmingLanguage.contains("python")); //false

        System.out.println("programmingLanguage.contains(\"P\") = " + programmingLanguage.contains("P"));

        System.out.println("=======================================");


        // TRIM()
                // yazini onundeki ve arkasindaki bosluklari alir yani cikariyor.

        String s= "     Hello World       ";
        System.out.println( s);
        System.out.println(s.trim());

        String trimedS= s.trim();  // s=s.trim();  de yazabilirdik degistirmek yani atamak icin.
        System.out.println(trimedS);


        // REPLACE()

        System.out.println("s.replace(\"Hello\",\"Big Big\") = " + s.replace("Hello", "Big Big"));
        System.out.println("trimedS.replace(\"Hello\", \"Developer\") = " + trimedS.replace("Hello", "Developer"));
        System.out.println("trimedS.replace(\"Hel\", \"\") = " + trimedS.replace("Hel", ""));



        // indexOf()
        System.out.println(trimedS);
        System.out.println("trimedS.indexOf(\"H\") = " + trimedS.indexOf("H"));

        System.out.println("trimedS.indexOf(\"Hell\") = " + trimedS.indexOf("Hell"));
        System.out.println("trimedS.indexOf(\"World\") = " + trimedS.indexOf("World"));


    }
}
