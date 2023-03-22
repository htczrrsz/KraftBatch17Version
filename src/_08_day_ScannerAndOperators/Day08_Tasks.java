package _08_day_ScannerAndOperators;

public class Day08_Tasks {
    public static void main(String[] args) {

        int num1=20;
        int num2=30;
        int num3=40;
        int sum=num1+num2+num3;
        System.out.println(""+num1+ "+" + num2+ "+" + num3+ "=" + (num1+num2+num3));

        System.out.println("-------------");

        int km = 100;
        double mil = 0.625*km;
        System.out.println(km + " km " + mil + " mil yapar. ");

        System.out.println("-------------");

        int yaricap = 3;
        double cevre = 2*Math.PI*yaricap;
        double alan = Math.PI*yaricap*yaricap;
        System.out.println(yaricap + " cm yaricapli dairenin cevresi; " + cevre + " cm'dir alani ise " +alan + " cm²'dir. " );

        System.out.println("-------------");

     //   (int)(5.1+5)+(int)(3.1);
      //  (double)(3+2);         ----> diger taskta yaziyodu anlamadim
       // (int)(4.3+(double)(3/1));

    }
}
