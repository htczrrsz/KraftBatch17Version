package _24_Day_StringClass;

public class Math2 {

    public static void main(String[] args) {

        Math2 mathPowHesap = new Math2();

        System.out.println("mathPowHesap.pow(3,3) = " + mathPowHesap.pow(3, 3));

        
    }

    public int pow(int taban, int kuvvet ){
       int result=1;
       for (int i=1; i<=kuvvet; i++){
           result*=taban;

       }
        return result;
    }





}
