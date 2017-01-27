package com.company.com.edication.practice3;

/**
 * Created by galina on 18.01.17.
 */
public abstract class Mammal extends  Animal{
    private String name;
    private String owner;
    private int age;

    public void move(){};

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Mammal() {
    }

    public Mammal(double weight, boolean hungry, String name, String owner, int age) {
        super(weight, hungry);
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
