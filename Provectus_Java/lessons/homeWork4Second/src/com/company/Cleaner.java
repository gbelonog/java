package com.company;

/**
 * Created by galina on 05.01.17.
 */
public class Cleaner extends Clerk {
    double sizePlace;

    Cleaner(){
        super();
        this.sizePlace = 0;
    }
    Cleaner(String firstName, String lastName, int age, String officeName, double sizePlace){
        super(firstName, lastName, age, officeName);
        this.sizePlace = sizePlace;
    }

    void work(){
        super.work();
        System.out.println("I'm cleaner. I'm clearning the " + super.officeName + " office. " +
                "It's size is " + sizePlace + " meters.");
    }
}
