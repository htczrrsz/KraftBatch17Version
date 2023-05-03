package _46_Day_AbstractClassAndInterface.animal;

public class Eagle extends Animal implements CanFly, Wild {


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed,gender,age,size,color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }


    @Override
    public void fly() {
        System.out.println(getName()+" is flying at high altitudes");
    }


    @Override
    public void hunt() {
        System.out.println(getName()+ " is hunting snake");
    }




}
