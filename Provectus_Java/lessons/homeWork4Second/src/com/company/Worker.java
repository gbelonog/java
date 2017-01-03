package com.company;

/**
 * Created by galina on 03.01.17.
 */
public abstract class Worker {
    String firstName;
    String lastName;
    int age;

    Worker(){
        this.firstName = "Ivan";
        this.lastName = "Ivanov";
        this.age = 20;
    }

    Worker(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 20;
    }
    abstract void work();

}
