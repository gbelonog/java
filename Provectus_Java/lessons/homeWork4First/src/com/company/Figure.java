package com.company;

/**
 * Created by galina on 23.12.16.
 */
public abstract class Figure {

    double x;
    double y;

    Figure(){
        this.x = 0;
        this.y = 0;
    }

    Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    abstract void print();
    abstract double area();
    abstract double perimeter();

}
