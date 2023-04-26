package _39_Day_Constructor_Overloading;


public class Odev_Square {

    public int sideLengt;


    public Odev_Square(int sideLengt) {
        this.sideLengt = sideLengt;
    }

    public int calculateArea() {
        return sideLengt * sideLengt;
    }

    public int calculatePerimeter() {
        return sideLengt * 4;
    }

    public String toString() {
        return "Square's side length is = " + sideLengt + ", area= " + calculateArea() +
                ", perimeter= " + calculatePerimeter() + "}";
    }
}

class SquareObjects {
    public static void main(String[] args) {

        Odev_Square square1 = new Odev_Square(5);

        System.out.println("square1.sideLengt = " + square1.sideLengt);

        System.out.println("square1.calculateArea() = " + square1.calculateArea());

        System.out.println("square1.calculatePerimeter() = " + square1.calculatePerimeter());

        System.out.println(square1);
    }
}

