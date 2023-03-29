package _20_Day_CustomMethods_Overloading;

import java.util.Scanner;

public class C18_DugunKarti {
    public static void main(String[] args) {



dugunKarti();


    }


      public static void dugunKarti(){
          Scanner scan= new Scanner(System.in);
          System.out.println("2 adet kelime giriniz : ");
          String kelime1= scan.nextLine();
          String kelime2= scan.nextLine();
          if (kelime1.equals(kelime2)) {
                  duzeltme();
              } else if (!(kelime1.equals(kelime2))) {
             concat(kelime1,kelime2);
              }
        }

public static void duzeltme() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Kelimeler farkli olmaliydi. Lutfen tekrar kelimeleri girin : ");

    String tekrar1 = scan.nextLine();
    String tekrar2 = scan.nextLine();
    if (tekrar1.equals(tekrar2)) {
        duzeltme();
    } else {
        System.out.println("*** " + tekrar1 + "  " + tekrar2 + " ***");
    }
}

      public static void concat(String kelime1, String kelime2){
        System.out.println(" *** " + kelime1 +"  " +  kelime2 + " ***");
      }







}
