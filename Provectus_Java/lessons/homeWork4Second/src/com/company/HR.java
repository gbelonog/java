package com.company;

/**
 * Created by galina on 03.01.17.
 */
public class HR extends Clerk {
    int numberOfWorkers;

    HR(String firstName, String lastName, int age, String offocaName, int numberOfWorkers){
        super(firstName, lastName, age, offocaName);
        this.numberOfWorkers = numberOfWorkers;
    }

    HR(){
        super();
        this.numberOfWorkers = 0;
    }
    void work(){
        super.work();
        System.out.println("I'm HR and I work with " + this.numberOfWorkers + " people.");
    }
}
