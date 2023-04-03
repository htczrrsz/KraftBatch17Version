package _25_Day_Summary;

public class Main {
    public static void main(String[] args) {

        int f=4;
        int c=5;
        System.out.println("Math2.max(f,c) = " + Math2.max(f, c));

        int v= Math2.pow(f,c);

        System.out.println("Math2.pow(f,c) = " + Math2.pow(f, c));
       if( Math2.pow(f,c)>500){
           System.out.println("500'den buyuk");
       }


    }
}
