package _47_Day_Polymorphism.shape;

import _46_Day_AbstractClassAndInterface.animal.Animal;
import _46_Day_AbstractClassAndInterface.animal.Cat;
import _46_Day_AbstractClassAndInterface.animal.Dog;
import _46_Day_AbstractClassAndInterface.animal.Tiger;
import _46_Day_AbstractClassAndInterface.car.Car;

import java.util.Arrays;

public class C01_Polymorphism {
    public static void main(String[] args) {


        Animal animal = new Dog("Panco","Golden",'M',9,"Medium","Yellow");


        boolean isAnimal=  animal instanceof Animal;
        boolean isDog= animal instanceof Dog;
        boolean isCat= animal instanceof Cat;
        System.out.println(isAnimal);
        System.out.println(isDog);
        System.out.println(isCat);


        animal.eat();
        animal.drink();

     //    animal.bark  cikmiyor cunku referans type Animal
     //                  erisebilmek icin explicit casting yaptik
        ((Dog)(animal)).bark();
        ((Dog)(animal)).play();

        System.out.println(((Dog) (animal)));



        Circle circle=new Circle(5);

        System.out.println(circle.getRadius());
        System.out.println(circle.area());
        System.out.println(circle);


        Shape shape= new Circle(6);

        System.out.println(shape.perimeter());
        System.out.println(shape.area());
        System.out.println(shape.getName());
        System.out.println(shape);

        System.out.println(shape.getClass());
        System.out.println(shape.getClass().getName());

        System.out.println(shape instanceof Circle);

        String str="Golden globe";
        int a=3;
        double b=12.5;

        Object[] objectArray={str,a,b,animal};

        System.out.println(Arrays.toString(objectArray));



        



        Shape shape1=new Square(10);

        System.out.println(shape1.perimeter());

        Shape shape2= new Circle(10);

        System.out.println(shape2.perimeter());

        Square square= new Square(10);
        System.out.println(square.perimeter());


        Shape shape3 = new Cube(5);

        shape3=shape1;

        shape1= new Triangle(4,5,6);


    }
}
