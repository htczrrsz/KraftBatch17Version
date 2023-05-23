package _58_Day_JavaReviews3;

import _58_Day_JavaReviews3.abstractionReview.*;

public class C02_PolymorphismReview {
    public static void main(String[] args) {

//     Car car = new Car();    can not create obj from abstract classes


        Car car1 = new Tofas();
        Car car2 = new BMW();
        Car car3 = new Togg();   // typecasting -->  upcasting (implicitly oldu) (otomatik) !!!

//        Autopilot autopilot = new Autopilot();   can not create obj from interface

//        Autopilot autopilot = (Autopilot) new Tofas();  class cast exception verdi runtime'da  !!!


        Autopilot autopilot = new BMW();
        autopilot.autoPark();


        Car electricCar = new Togg();
        electricCar.driver();
        electricCar.start();
        electricCar.start();
//         electricCar.autoPark();     reference type decides what to be access  --> "Car" is our reference type

        ((Togg)electricCar).autoPark();  //  type casting --> downcasting  !!!




    }

}
