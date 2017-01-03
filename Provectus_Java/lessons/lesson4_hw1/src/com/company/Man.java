package com.company;

/**
 * Created by galina on 13.12.16.
 */
public class Man {
    String name;
    int age;
    String address;

    Man ()
    {
        this.name = "Alex";
        this.age = 30;
        this.address = "Odessa,Krasnova,4";
    }

    Man (String name, int age, String address)
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
