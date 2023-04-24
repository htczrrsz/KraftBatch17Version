package _36_Day_Wrapper_Class;

import javax.swing.text.html.HTMLDocument;

public class C06_WrapperClassMethodsTekrar {
    public static void main(String[] args) {

        // valueOf()

           //  int veya string aliyor ve cagrildigi metoda gore deger olusturuyor.
           //  wrapper class donduruyor.


            String s="123";
            int x=Integer.valueOf(s);
            int y=x+5;
            System.out.println(y);



        // parseInt()

           // String deger alip
           // primitive bir int donduruyor.


            int z= Integer.parseInt("123");
            System.out.println(z);


        // typeValue()

           // intValue,  gibi primitive int dondurur.

           Integer t= Integer.valueOf("123");
           int m=t.intValue();



        // Character.isLetter()        harf olup olmadigini  (daha kullanisli)
        // Character.isDigit()         sayi/rakam olup olmadigini kontrol ediyor
        // Character.isAlphabetic()    harf olup olmadigini









        String str="Bugun hava 25 derece";
       //  hava sicakligi 10 derece daha artarsa hava sicakligi kac derece olur ?

        String [] strArray= str.split(" ");
        int result= Integer.parseInt(strArray[2]) +10;
        System.out.println(result);


        int result2= Integer.parseInt(strArray[2]);


        String str2="Bugun hava 30 derece;Bugun hava cok sicak";
        // 40 derece ve uzerinde ise "bugun hava cok sicak"
        // altinda ise "bugun hava mevsim normallerinde"

        int havaSicakligi=Integer.parseInt(str2.split(" ")[2]);
        String expectedResult="Bugun hava cok sicak";
        String expectedResult2="Bugun hava mevsim normallerinde";
        String actualResult=str2.split(";")[1];
        if (havaSicakligi>=40 ){
            System.out.println(expectedResult.equalsIgnoreCase(actualResult));
        }else {
            System.out.println(expectedResult2.equalsIgnoreCase(actualResult));
        }







    }








}
