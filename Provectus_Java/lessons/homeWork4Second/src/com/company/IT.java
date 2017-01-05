package com.company;

/**
 * Created by galina on 05.01.17.
 */
public abstract class IT extends Worker{
    String projectName;

    IT(){
        super();
        projectName = "N/A";
    }
    IT(String firstName, String lastName, int age, String projectName){
        super(firstName, lastName, age);
        this.projectName = projectName;
    }

    void work(){
        System.out.println("I'm IT specialist. My project is " + projectName + ".");
    }

}
