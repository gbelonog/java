package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> mass = new ArrayList<Integer>();
        DynamicStack myStack = new DynamicStack(mass);

        myStack.printStack();
        myStack.push(1);
        myStack.push(34);
        myStack.push(-11);
        myStack.push(1);
        myStack.push(0);
        myStack.printStack();
        myStack.sort();
        System.out.println("Sorted:");
        myStack.printStack();
        System.out.println(myStack.pop());
        myStack.printStack();
    }
}
