package com.company.com.edication.practice3;

import com.company.com.edication.practice3.Reptile;

/**
 * Created by galina on 18.01.17.
 */
public class Turtle extends Reptile{
    private double speed;
    public void hideHead(){};

    Turtle(double speed) {
        this.speed = speed;
    }

     protected Turtle() {
    }

    @Override
    public void voice() {

    }

    @Override
    public void play() {
        if(speed > 200){
            System.out.println("Бегите");
        }else
        {
            System.out.println("ok");
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public boolean getHungry() {
        return super.getHungry();
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {

        return speed;
    }

    public static void m(Animal animal){

    }
}

