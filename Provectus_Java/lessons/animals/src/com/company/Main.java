package com.company;

import com.company.com.edication.practice3.Animal;
import com.company.com.edication.practice3.Reptile;
import com.company.com.edication.practice3.Snake;
import com.company.com.edication.practice3.Turtle;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void voice() {

            }

            @Override
            public void play() {

            }

            @Override
            public void eat(){};

        };
        Snake snake = new Snake();
        snake.play();

        Animal turtle = new Animal() {
            @Override
            public void voice() {

            }

            @Override
            public void play() {

            }

            @Override
            public void eat() {

            }
        };
        Reptile turtle1 = new Reptile() {
            @Override
            public void voice() {

            }

            @Override
            public void play() {

            }

            @Override
            public void eat() {

            }
        };
        Turtle turtle2 = new Turtle(){};

    }
}
