package _44_Day_Final;

public class Main {
    public static void main(String[] args) {







        Final_Example finalExample= new Final_Example();

        System.out.println(finalExample.x);
        System.out.println(finalExample.method());
        System.out.println(finalExample.x); // methodu kullandigim icin x artik 7 oldu ordaki metoda gore.

// final

        final String[] strArr={"Harun"};
        String[] strArr2={"Orhan"};

       //  strArr=strArr2; olmaz cunku nonprimitivelerde final keywordu REFERANSLARIN degismemesini engelliyor.
        strArr[0]="Hatice"; // ama degerini degistirebiliriz.

        strArr2=strArr; // bunu yapabiliriz. cunku final olmayana atama yapiyoruz.

        // arraylistlerde de ayni sekilde


    }
}
