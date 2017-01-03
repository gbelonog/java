package com.company;

/**
 * Created by galina on 14.12.16.
 */
public class Calculator {

    Value screenValue;
    double memoryValue;

/*    boolean fraction;

    int fractionDigitCount;
*/
    int operation;
    boolean moveScreenValueToMemory;

    static final int OPERATION_NONE = -1;
    static final int OPERATION_PLUS = 0;
    static final int OPERATION_MINUS = 1;
    static final int OPERATION_MULTIPLY = 2;
    static final int OPERATION_DIVISION = 3;
    static final int OPERATION_SQRT = 4;


    Calculator()
    {
        screenValue = new Value();
        operation = OPERATION_NONE;
    }


    void input(int val) {
        if (moveScreenValueToMemory)
        {
            memoryValue = screenValue.value;
            screenValue.clear();
            moveScreenValueToMemory = false;
        }
    /*    if(!fraction) {screenValue = screenValue * 10 + val;}
        else {
            ++fractionDigitCount;
            screenValue += Math.pow(0.1, fractionDigitCount) * val;
        }*/
        screenValue.input(val);
    }

    void fraction() {
        screenValue.fraction = true;}

    void plus() {
        executePreviousOperation();
        operation = OPERATION_PLUS;
        moveScreenValueToMemory = true;
    }
    void minus() {
        executePreviousOperation();
        operation = OPERATION_MINUS;
        moveScreenValueToMemory = true;
    }
    void multiply() {
        executePreviousOperation();
        operation = OPERATION_MULTIPLY;
        moveScreenValueToMemory = true;
    }
    void division() {
        executePreviousOperation();
        operation = OPERATION_DIVISION;
        moveScreenValueToMemory = true;
    }

    void sqrt() {
        executePreviousOperation();
        operation = OPERATION_SQRT;
        moveScreenValueToMemory = true;
    }

    void executePreviousOperation(){
        if(moveScreenValueToMemory) return;

        switch (operation) {
            case OPERATION_PLUS:
                screenValue.value = memoryValue + screenValue.value;
                break;
            case OPERATION_MINUS:
                screenValue.value = memoryValue - screenValue.value;
                break;
            case OPERATION_MULTIPLY:
                screenValue.value = memoryValue * screenValue.value;
                break;
            case OPERATION_DIVISION:
                screenValue.value = memoryValue / screenValue.value;
                break;
            case OPERATION_SQRT:
                screenValue.value = Math.sqrt(screenValue.value);
                break;
        }
    }

    double getValue() {return screenValue.value;}
}
