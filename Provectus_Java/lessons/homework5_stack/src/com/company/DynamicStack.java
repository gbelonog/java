package com.company;


import java.util.ArrayList;

/**
 * Created by galina on 28.01.17.
 */
public class DynamicStack implements Stack, Sortable {

    ArrayList<Integer> stack = new ArrayList<Integer>();

    public DynamicStack(ArrayList stack) {
        this.stack = stack;
    }

    public void setStack(ArrayList stack) {
        this.stack = stack;
    }

    public ArrayList getStack() {

        return stack;
    }

    @Override
    public void push(int e) {
        this.stack.add(e);

    }

    @Override
    public int pop() {
        Integer n = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() - 1);
        return n;
    }

    @Override
    public void printStack(){
        System.out.println(getStack());
    }

    @Override
    public void sort() {
        int temp = 0;
        for(int i = 0; i < (this.stack.size() - 1); i++)
        {
            if(this.stack.get(i) < this.stack.get(i + 1)){
                temp = this.stack.get(i);
                this.stack.set(i, this.stack.get(i + 1));
                this.stack.set(i+1, temp);
            }
        }
    }
}
