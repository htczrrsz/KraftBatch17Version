package _39_Day_Constructor_Overloading;

public class C03_CarObjects {
    public static void main(String[] args) {

        Car car1=new Car();

        System.out.println("car1 = " + car1);


        Car car2= new Car("VW");
        System.out.println("car2 = " + car2);

        Car car3=new Car("Honda","Civic");
        System.out.println("car3.marka = " + car3.marka);
        System.out.println(car3);

       Car.renkSec(car3, "kirmizi");

        System.out.println(car3);

        Car car4=new Car("BMW","M6","Siyah",300,true);
        System.out.println("car4 = " + car4);




    }

    // renkSec metodunu buraya da yazabilirdik. buraya yazarsak car kismini cikarmamiz gerekir.

}
