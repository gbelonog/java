package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        calculator.input(2);
        calculator.input(4);
        calculator.fraction();
        calculator.input(3);

        System.out.println(calculator.getValue());
        calculator.plus();
        calculator.input(1);
        System.out.println(calculator.getValue());

        calculator.plus();
        System.out.println(calculator.getValue());

        calculator.plus();
        System.out.println(calculator.getValue());

        calculator.minus();
        System.out.println(calculator.getValue());

        //calculator.input(4);
        calculator.sqrt();
        System.out.println(calculator.getValue());

    }
}
