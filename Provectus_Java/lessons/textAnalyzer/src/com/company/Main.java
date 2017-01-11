package com.company;

public class Main {

    public static void main(String[] args) {

	    TextAnalyzer first = new TextAnalyzer("I love you", 'o');
        System.out.println("Number of letters 'o' = " + first.countLetters());

        first.countAllLetters();
    }
}
