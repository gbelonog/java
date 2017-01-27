package com.company.com.edication.practice3;

/**
 * Created by galina on 18.01.17.
 */
public class Snake extends Reptile {
    private  double length;
    private  boolean poison;
    @Override
    public void voice() {

    }

    @Override
    public void play() {
        if (length > 200){
            System.out.println("You are died;");
        } else if(poison){
            System.out.println("Вас укусила змея");
        }
        else {
            System.out.println("You are alive.");
        }
    }

    @Override
    public void eat() {

    }

    public double getLength() {
        return length;
    }

    public boolean isPoison() {
        return poison;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPoison(boolean poison) {
        this.poison = poison;
    }

    public Snake(double weight, boolean hungry, double length, boolean poison) {
        super(weight, hungry);
        this.length = length;
        this.poison = poison;
    }

    public Snake(double length, boolean poison) {


        this.length = length;
        this.poison = poison;
    }

    public Snake() {}
}
