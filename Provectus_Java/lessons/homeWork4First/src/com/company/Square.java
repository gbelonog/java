package com.company;

/**
 * Created by galina on 23.12.16.
 */
public class Square extends Figure{
    double length;

    Square()
    {
        super();
        this.length = 0;
    }

    Square(double x, double y, double length)
    {
        super(x, y);
        this.length = length;
    }

    Square(double length)
    {
        super();
        this.length = length;
    }

    @Override
    void print() {
        System.out.println("This is square.");
    }

    @Override
    double area() {
        return this.length * this.length;
    }

    @Override
    double perimeter() {
        return 4 * this.length;
    }
}
