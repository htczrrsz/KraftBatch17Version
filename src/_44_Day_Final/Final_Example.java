package _44_Day_Final;

public class Final_Example {

    // final

       int x=5;


        int method(){
             this.x=this.x+2;
             return this.x*5;


    }

    public static void main(String[] args) {


        // final

        final String[] strArr={"Harun"};
        String[] strArr2={"Orhan"};

        //  strArr=strArr2; olmaz cunku nonprimitivelerde final keywordu REFERANSLARIN degismemesini engelliyor.
        strArr[0]="Hatice"; // ama degerini degistirebiliriz.

        strArr2=strArr; // bunu yapabiliriz. cunku final olmayana atama yapiyoruz.

        // arraylistlerde de ayni sekilde






    }


}
