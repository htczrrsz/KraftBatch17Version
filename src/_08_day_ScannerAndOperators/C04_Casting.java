package _08_day_ScannerAndOperators;

public class C04_Casting {
    public static void main(String[] args) {

        float bodyTemperature = 36.5F;

        byte num1= (byte) bodyTemperature;   //expilicit , narrowing, manuel casting
        short num2= (short) bodyTemperature;
        int num3= (int) bodyTemperature; //narrowing, manual
        long num6= (long) bodyTemperature;  //
        float num4 = bodyTemperature; // no casting
        double num5= bodyTemperature;  //implicit, widening


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);


    }
}
