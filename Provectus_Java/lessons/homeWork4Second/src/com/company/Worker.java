package com.company;

/**
 * Created by galina on 03.01.17.
 */
public abstract class Worker {
    String firstName;
    String lastName;
    int age;

    Worker(){
        this.firstName = "N/A";
        this.lastName = "N/A";
        this.age = 0;
    }

    Worker(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    abstract void work();

}
