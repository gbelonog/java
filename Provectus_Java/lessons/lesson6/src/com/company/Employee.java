package com.company;

/**
 * Created by galina on 21.12.16.
 */
public class Employee extends Person{
    String Company;

    //Employee(){ this.Company = "olx";}
    //super(){}
    public Employee(String name, String LastName, String company)
    {
        super(name, LastName);
        this.Company = company;
    }

    @Override
    void display() {
        System.out.println("display");
    }
}
