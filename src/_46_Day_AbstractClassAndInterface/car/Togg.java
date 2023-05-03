package _46_Day_AbstractClassAndInterface.car;

public class Togg extends Car {


    public Togg( String model, String color, int year, double price){
        super("Togg",model,color,year,price);
    }

    @Override
    public void start() {
        System.out.println("Say \" Start\" to start to engine");
    }


    public void zoom(){
        System.out.println("Zoom meeting is starting, smile to the camera");
    }




}
