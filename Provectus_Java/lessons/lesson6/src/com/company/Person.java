package com.company;

/**
 * Created by galina on 21.12.16.
 */
public abstract class Person {
    private String name;
    private String LastName;

    public Person(){
        this.name = "Olga";
        this.LastName = "Lee";
    }

    public Person(String name, String Lastname){
        this.name = name;
        this.LastName = Lastname;
    }
    abstract void display();

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }
}
