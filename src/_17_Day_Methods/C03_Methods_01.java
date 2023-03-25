package _17_Day_Methods;

public class C03_Methods_01 {
    public static void main(String[] args) {

//        System.out.println("Progrm basladi");
//        hello();
//        System.out.println("Program devam ediyor.");
//        hello();
//        System.out.println("Program sonlandi");


        hello();
        menu();
        System.out.println("------");
message_1();

    }
public static void message_1(){
    System.out.println("1");

}

    public static void message_2(){
        System.out.println("2");


    }





    public static void hello() {
        System.out.println("Bankamiza hosgeldiniz");

    }

public static void menu(){
    System.out.println("1: Para cekme 2:Para yatirma 3:Bakiye goruntule 4:Cikis");
}


}
