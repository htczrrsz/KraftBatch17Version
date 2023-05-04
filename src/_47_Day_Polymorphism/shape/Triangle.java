package _47_Day_Polymorphism.shape;

public class Triangle extends Shape {


    private double side1,side2,side3;

    public Triangle( double side1, double side2, double side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double area() {
        return 0;
    }


    @Override
    public double perimeter() {
        return side1+side2+side3;
    }
}
