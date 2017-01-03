package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int number = 0;
//        boolean comparing = false;
        Scanner scan = new Scanner(System.in);

	    Matrix matrix1 = new Matrix();
        System.out.print("Matrix 1:");
        matrix1.Print();

        int arrayForMatrix2[][] = {{1,2},{3,4}};
        Matrix matrix2 = new Matrix(2, 2, arrayForMatrix2);
        System.out.print("\nMatrix 2:");
        matrix2.Print();

        int arrayForMatrix3[][] = {{1,2},{3,4}};
        Matrix matrix3 = new Matrix(2, 2, arrayForMatrix2);
        System.out.print("\nMatrix 3:");
        matrix2.Print();

        Matrix sum = new Matrix();
        sum = matrix3.sum(matrix2);
        System.out.print("\nSum Matrix:");
        sum.Print();

        Matrix multByNumberMatrix = new Matrix();
        System.out.println("Input number");
        number = Integer.parseInt(scan.nextLine());
        multByNumberMatrix = matrix2.multiplyByNumber(number);
        System.out.print("\nMatrix is multiplied by number " + number + ":");
        multByNumberMatrix.Print();

        number = matrix2.min();
        System.out.println("\nMin element of matrix2 = " + number);

        if (matrix1.compare(matrix2) == true)
            System.out.println("\nmatrix1 = matrix2");
        else
            System.out.println("\nmatrix1 != matrix2");

        if (matrix3.compare(matrix2) == true)
            System.out.println("\nmatrix3 = matrix2");
        else
            System.out.println("\nmatrix3 != matrix2");

    }
}
