package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Pushok", 2, 4, 5);
        Cat cat2 = new Cat("Barsik", 8, 3, 1);
        boolean winner = false;

        winner = cat1.fight(cat2);
        System.out.println(winner);
        if(winner == true)
        {
            System.out.println(cat1.name + " is winner.");
        } else {
            System.out.println(cat2.name + " is winner.");
        }
        winner = cat2.fight(cat1);
        System.out.println(winner);
        if(winner == true)
        {
            System.out.println(cat1.name + " is winner.");
        } else {
            System.out.println(cat2.name + " is winner.");
        }
    }
}
