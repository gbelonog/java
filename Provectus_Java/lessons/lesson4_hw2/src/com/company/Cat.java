package com.company;

/**
 * Created by galina on 13.12.16.
 */
public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    Cat()
    {
        this.name = "Vaska";
        this.age = 2;
        this.weight = 7;
        this.strength = 10;
    }

    Cat(String name, int age, int weight, int strength)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    boolean fight(Cat cat)
    {
    /*    if (this.strength > cat.strength)
        {
            return true;
        }
        if (this.weight > cat.weight)
            {
                return true;
            }
        if (this.age > cat.age)
                {
                    return true;
                }*/
        if ((this.strength > cat.strength) )
        {
            return true;
        }
        else return false;
    }
}
