package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
//everage
	    double[] mas = new double [10];
            for(int i = 0; i < 10; i++)
            {
                mas[i] = i;
                System.out.print(mas[i] + ", ");
                sum += mas[i];
            }
        System.out.println("\nEverage = " + sum/10);

//random
        Random randomGenerator = new Random();
        int[] randomMas = new int [11];
        int[] quantity = new int [10];
        int max = 0, maxNumber = 0, counter = 0;
        //boolean flag = false;

        for(int i = 0; i < 10; i++)
        {
            quantity[i] = 0;
        }
        System.out.print("\nrandomMas: ");
        for(int i = 0; i < 11; i++)
        {
            randomMas[i] = randomGenerator.nextInt(10);
            System.out.print(randomMas[i] + ", ");
            quantity[randomMas[i]] ++;
        }

        for(int i = 0; i < 10; i++)
        {
            if (quantity[i] > 1)
            {
                System.out.print("\n"+ i + " is present in randomMas " + quantity[i] + "case(s)");
            }

            if (quantity[i] > max)
            {
                max = quantity[i];
                maxNumber = i;
            }
        }

        for(int i = 0; i < 10; i++)
        {
            if (max == quantity[i])
            {
                counter++;
            }
        }
        if (counter == 1)
        {
            System.out.print("\n\n" + maxNumber + " is present in randomMas " + max + " times. It is maximum.");
        }
// natural number
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        float n = 0;
        int N = 0, countEven = 0, j = 0;


        while (flag == false) {
            System.out.println("\nInput natural number > 3.");
            n = Float.parseFloat(scan.nextLine());
            if (n % 1 != 0) {
                System.out.println("Number is not natural.");
            } else if (n <= 3) {
                System.out.println("Number is <= 3.");
            } else {
                flag = true;
            }
        }
// Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран
// Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        if (flag == true)
        {
            N = (int)n;
            int[] randomMasN = new int [N];
            int[] massEven = new int [N];

            System.out.print("\nrandomMasN: ");
            for(int i = 0; i < N; i++)
            {
                randomMasN[i] = randomGenerator.nextInt(N);
                if ((randomMasN[i] % 2) == 0)
                {
                    countEven ++;
                    massEven[j] = randomMasN[i];
                    j++;
                }
                System.out.print(randomMasN[i] + ", ");
            }
            System.out.print("\nmassEven: ");
            for(int i = 0; i < countEven; i++) {
                System.out.print(massEven[i] + ", ");
            }

        }
// Массив: {{5,10,3,0,0}, {4,9,0,0,0},{0,0,16,0,0},{22,33,1,6,10}}
        int[][] matrix = {{5,10,3,0,0}, {4,9,0,0,0},{0,0,16,0,0},{22,33,1,6,10}};
        int[][] Tmatrix = new int [5][4];
        System.out.print("\nmatrix:");
        for(int i = 0; i < 4; i++) {
            System.out.println();
            for (int m = 0; m < 5; m++)
            {
                Tmatrix[m][i] = matrix[i][m];
                System.out.print(matrix[i][m] + " ");
            }
        }
        System.out.print("\n\nTmatrix:");
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for (int m = 0; m < 4; m++)
            {
                System.out.print(Tmatrix[i][m] + " ");
            }
        }


    }
}
