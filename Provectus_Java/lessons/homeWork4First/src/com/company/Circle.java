package com.company;

/**
 * Created by galina on 23.12.16.
 */
public class Circle extends Figure {
    double radius;

    Circle()
    {
        super();
        this.radius = 0;
    }

    Circle(double x, double y, double radius)
    {
        super(x, y);
        this.radius = radius;
    }
    Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    @Override
    void print() {
        System.out.println("This is circle.");
    }

    @Override
    double area() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    double perimeter() {
        return 2 * 3.14 * this.radius;
    }
}
