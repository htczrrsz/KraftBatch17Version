package _47_Day_Polymorphism.shape;

import _46_Day_AbstractClassAndInterface.animal.Animal;

public class Sphere extends Shape implements Volume {

    public Sphere(String name) {
        super(name);
    }





    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }



}
