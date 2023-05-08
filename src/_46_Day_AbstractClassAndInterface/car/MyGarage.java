package _46_Day_AbstractClassAndInterface.car;

import java.util.ArrayList;
import java.util.Arrays;

public class MyGarage {
    public static void main(String[] args) {


      //   Car car1= new Car("Togg","T10X", "Kapadokya",2023,50000  )
       //  we can not create an object from an abstract class.


        Honda honda =new Honda("Accord","Black",2023,80000);
        Audi audi= new Audi("RS6","Red",2023,560000);
        Togg togg= new Togg("T10X","Kapadokya",2023,50000);


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(togg);

        System.out.println("-----------");

        togg.setColor("Anadolu");
        honda.setColor("Blue");
        audi.setColor("Pink");

        System.out.println(audi);






    }






}
