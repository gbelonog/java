package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        circle1.print();
        System.out.println("Circle area = " + circle1.area());
        System.out.println("Circle perimeter = " + circle1.perimeter());

        Square square1 = new Square(3);
        square1.print();
        System.out.println("Square area = " + square1.area());
        System.out.println("Square perimeter = " + square1.perimeter());

        Rectangle rectangle1 = new Rectangle(3, 4);
        rectangle1.print();
        System.out.println("Rectangle area = " + rectangle1.area());
        System.out.println("Rectangle perimeter = " + rectangle1.perimeter());
    }
}
