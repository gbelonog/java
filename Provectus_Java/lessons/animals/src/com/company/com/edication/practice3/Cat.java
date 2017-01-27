package com.company.com.edication.practice3;

/**
 * Created by galina on 18.01.17.
 */
public class Cat extends Mammal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat() {
    }

    public Cat(double weight, boolean hungry, String name, String owner, int age, String color) {
        super(weight, hungry, name, owner, age);
        this.color = color;
    }

    @Override
    public void voice() {

    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {

    }
}
