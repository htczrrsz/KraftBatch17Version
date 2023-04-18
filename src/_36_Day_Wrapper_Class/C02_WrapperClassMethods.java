package _36_Day_Wrapper_Class;

public class C02_WrapperClassMethods {
    public static void main(String[] args) {


        // valueOf()  int ve String ve cagrildigi metoda gore deger olusturuyor.

//        String s="123";
//        int x=Integer.valueOf(s);
//        int y=x+5;
//        System.out.println(y);   // 128 cikarir. string degerini int e cevirmis olduk bu metodla
//
//
//
//
//        // parseInt()   parametre olarak string alip int donduruyor
//
//       int z= Integer.parseInt("123");
//        System.out.println("z = " + z);
//
//        Integer t=Integer.valueOf("123");
//        int m=t.intValue();
//     //    System.out.println("m = " + m);

     /*   String str="Bugun hava 40 derece";
        hava sicakligi 10 dderece daha artarsa hava sicakligi kac derece olur?.

        String [] strArray= str.split(" ");
        System.out.println("strArray[2] = " + strArray[2]);

        int result=Integer.parseInt(strArray[2]);
        System.out.println(result);

      */

        String str="Bugun hava 40 derece;Bugun hava cok sicak";
        // 40 ve uzerinde ise "Bugun hava cok sicak"
        // altinda ise bugun hava mevsim normallerinde

        int havaSicakligi=Integer.parseInt(str.split(" ")[2]);
        String expectedResult1="Bugun hava cok sicak";
        String expectedResult2="Bugun hava mevsim normallerinde";
        String actualResult=str.split(";")[1];
        if (havaSicakligi>=40){
            System.out.println(expectedResult1.equalsIgnoreCase(actualResult));
        }else {
            System.out.println(expectedResult2.equalsIgnoreCase(actualResult));
        }



    }
}
