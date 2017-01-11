package com.company;

/**
 * Created by galina on 10.01.17.
 */
public class TextAnalyzer {
    char letter;
    String text;

    TextAnalyzer(String text, char letter){
        this.text = text;
        this.letter = letter;
    }

    int countLetters() {
        int count = 0;
        char[] array = text.toCharArray();
        for(int i = 0; i < 10; i++) {
                if (array[i] == letter) {
                    count++;
                }
            }
        return count;
    }

    void countAllLetters() {
        int count = 0;
  //      boolean[] flagForTheSameLetters = new boolean[10];
        char[] array = text.toCharArray();
        int[] numberOfLetters = new int[10];
        for(int i = 0; i < 10; i++)
        {
            numberOfLetters[i] = 0;
  //          flagForTheSameLetters[i] = false;
        }

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if (array[i] == array[j]) {
                    numberOfLetters[i]++;
 //                   if (numberOfLetters[i] > 1) flagForTheSameLetters[i] = true;
                }
            }
        }

        System.out.println("Number of letters:");

        for(int i = 0; i < 10; i++)
        {
//            if (flagForTheSameLetters[i] == false)
                System.out.println(array[i] + " - " + numberOfLetters[i]);
        }

    }
    
}
