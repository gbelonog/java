package com.company.com.edication.practice3;

/**
 * Created by galina on 18.01.17.
 */
public abstract class Animal {
    private double weight;
    private boolean hugry;
    Animal(double weight, boolean hungry){
        this.hugry = hungry;
        this.weight = weight;
    }
    protected Animal(){}
    public abstract void voice();
    public abstract void play();
    public abstract void eat();
    public double getWeight(){
        return this.weight;
    };
    public boolean getHungry(){
        return this.hugry;
    };

    //void get
}
