package com.company;

/**
 * Created by galina on 20.12.16.
 */
public class Value {
    double value;
    boolean fraction;
    int fractionDigitCount;

    void input(int val)
    {
        if(!fraction) {
            value = value * 10 + val;
        }
        else {
            ++fractionDigitCount;
            value += Math.pow(0.1, fractionDigitCount) * val;
        }
    }

    void fraction (boolean fraction){
        this.fraction = fraction;
    }


    void clear(){
        value = 0;
        fraction = false;
        fractionDigitCount = 0;
    }
}
