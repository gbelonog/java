package com.company;

public class Main {

    public static void main(String[] args) {
	    Man man1 = new Man();
        Man man2 = new Man("Den", 25, "Odessa,Dolgaya,5");
        Woman woman1 = new Woman();
        Woman woman2 = new Woman("Lisa", 18, "Odessa,Babushkina,1/3");

        man1.Print();
        man2.Print();
        woman1.Print();
        woman2.Print();

    }
}
