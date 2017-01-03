package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Vasya", "Pupkin", "Oracle");
        employee.display();
        Object o = employee;
        Employee employee1 = (Employee) o;

//        employee.Person(new Person());
        System.out.println(employee.getName() + employee.getLastName() + employee.Company);
    }
}
