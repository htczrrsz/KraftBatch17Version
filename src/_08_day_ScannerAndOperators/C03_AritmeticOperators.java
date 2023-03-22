package _08_day_ScannerAndOperators;

public class C03_AritmeticOperators {
    public static void main(String[] args) {
        System.out.println("90"+10);  //9010
        System.out.println(10+"20");  // 1020
        System.out.println("90"+10+10); //901010
        System.out.println("90"+(10+10));  // 9020
        System.out.println(10+"90"+30);  //109030
        System.out.println(10+30+"90"); //4090
        System.out.println(""+10+30+"90"); // 103090

        System.out.println("--------");

        System.out.println(10+20); //30

        System.out.println("------");

        System.out.println(100/3); // 33
        System.out.println(10/4);  // 2
        System.out.println(10d/4);   // 2.5 d double olarak algila demis oluyoruz
        System.out.println("------");

        int a=100;
        double b = a/6;  // 16.0
        System.out.println(b);

        double d= (double) a/6;   // 100.0/6 olarak hesap edecegi icin 16.6666
        System.out.println(d);
        System.out.println("--------");

        System.out.println(10%2);
        System.out.println(10%3);
        System.out.println(10%4);






    }
}
