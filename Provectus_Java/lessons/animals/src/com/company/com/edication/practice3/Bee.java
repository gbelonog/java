package com.company.com.edication.practice3;

/**
 * Created by galina on 18.01.17.
 */
public class Bee extends Insect {
    private boolean queen;
    private int age;
    public void work(){}

    public int getAge() {
        return age;
    }

    public boolean isQueen() {
        return queen;
    }

    public void setQueen(boolean queen) {
        this.queen = queen;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Bee(boolean queen, int age) {
        this.queen = queen;
        this.age = age;
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
