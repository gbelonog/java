package com.company;

/**
 * Created by galina on 13.12.16.
 */
public class Woman {
    String name;
    int age;
    String address;

    Woman ()
    {
        this.name = "Anna";
        this.age = 20;
        this.address = "Odessa,Bazarnaya,3";
    }

    Woman (String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void Print()
    {
        System.out.println(this.name + " " + age + " " + address);
    }
}
