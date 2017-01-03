package com.company;

public class Main {

    public static void main(String[] args) {

        Clerk clerk1 = new Clerk("Vlad", "Volkov", 34, "USA");
        clerk1.work();

        Clerk clerk2 = new Clerk();
        clerk2.work();

    }
}
