package _22_Day_ClassAndObject_Memory;

public class CarNew {
    public static void main(String[] args) {


        Car mazda = new Car();
        mazda.marka= "Mazda";
        mazda.model="CX-9";
        mazda.beygir= 130;


        Car honda= new Car();
        honda.marka= "Honda";
        honda.model="CRV";
        honda.beygir= 120;

        if (honda.beygir>mazda.beygir){
            System.out.println(honda.marka + " " + honda.model);
           }else{
            System.out.println(mazda.marka+ " "+ mazda .model);
          }







    }
}
