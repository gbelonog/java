package com.company;

/**
 * Created by galina on 23.12.16.
 */
public class Rectangle extends Figure{
    double length;
    double width;

    Rectangle()
    {
        super();
        this.length = 0;
        this.width = 0;
    }

    Rectangle(double x, double y, double length, double width)
    {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    Rectangle(double length, double width)
    {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    void print() {
        System.out.println("This is rectangle.");
    }

    @Override
    double area() {
        return this.length * this.width;
    }

    @Override
    double perimeter() {
        return 2 * (this.length + this.width);
    }
}
