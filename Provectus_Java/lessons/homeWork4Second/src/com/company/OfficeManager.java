package com.company;

/**
 * Created by galina on 05.01.17.
 */
public class OfficeManager extends Clerk {

    OfficeManager(){
        super();
    }
    OfficeManager(String firstName, String lastName, int age, String officeName){
        super(firstName, lastName, age, officeName);
    }

    @Override
    void work() {
        super.work();
        System.out.println("I'm office manager. I help people.");
    }
}
