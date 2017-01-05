package com.company;

/**
 * Created by galina on 03.01.17.
 */
public class Clerk extends Worker{

    String officeName;

    Clerk(){
        super();
        this.officeName = "N/A";
    }

    Clerk(String firstName, String lastName, int age, String officeName){
        super(firstName, lastName, age);
        this.officeName = officeName;
    }

    @Override
    void work() {
        System.out.println("I'm clerk "+ super.firstName + " " + super.lastName + ".");
        System.out.println("I work in office " + officeName + ".");
    }
}
