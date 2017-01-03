package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
//first
        System.out.println("\nfirst");
        int[] mass1 = new int [4];
        int count =0;
        Random randomGenerator = new Random();

        for(int i = 0; i < mass1.length; i++)
        {
            mass1[i] = randomGenerator.nextInt(89) + 10;
            System.out.print(mass1[i] + " ");
        }

        for (int i = 0; i < (mass1.length - 1); i++)
        {
            if (mass1[i] < mass1[i+1])
            {
                count++;
            }
        }
        if (count == (mass1.length - 1))
        {
            System.out.println("последовательность возрастает");
        }else
            System.out.println("последовательность не возрастает");

//second
        System.out.println("\nsecond");
        int[] mass2 = new int [12];
        int counterPlus = 0, counterMinus = 0, n = 0, k = 0;
//        for (int i = 0; i < 12; i++)
//        {
            //n = randomGenerator.nextInt(20) - 10;
           while (k < mass2.length){
               n = randomGenerator.nextInt(20) - 10;
               if (n == 0) continue;
               if (counterPlus ==  6 && n > 0) continue;
               if (counterMinus ==  6 && n < 0) continue;
               if (n > 0) ++counterPlus;
               if (n < 0) ++counterMinus;

               mass2[k] = n;
               ++k;
           }
               /*
           }
            if (mass2[i] > 0)
            {
                counterPlus++;
            } else
                if (mass2[i] < 0)
                {
                    counterMinus++;
                }

            if (mass2[i] == 0 || counterMinus > 5 || counterMinus > 5)
            {
                mass2[i] = randomGenerator.nextInt(20) - 10;
            }

            System.out.print(mass2[i] + " ");
        }*/
        System.out.println(Arrays.toString(mass2));

//third
        System.out.print("\nthird");
        int[][] mass3 = new int [5][8];
        int max = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.println("\n");
            for(int j = 0; j < 8; j++)
            {
                mass3[i][j] = randomGenerator.nextInt(200) - 100;
                System.out.print(mass3[i][j] + " ");
            }
        }

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 7; j++) {
                if (mass3[i][j] > mass3[i][j+1]) {
                    max = mass3[i][j];
                    mass3[i][j] = mass3[i][j+1];
                    mass3[i][j+1] = max;
                }
            }
        }
        max = mass3[0][7];
        for(int i = 1; i < 5; i++) {
            if (mass3[i][7] > max) {
                max = mass3[i][7];
            }
        }

        System.out.println("\nMax version 1 = " + max);

        max = 0;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (mass3[i][j] > max) {
                    max = mass3[i][j];
                }
            }
        }
        System.out.println("\nMax version 2 = " + max);

//fourth
        System.out.println("\nfourth");
        String[] mass4Line = new String[37];
        int[] count4 = new int[35];
        int t = 0, rand = 0, end = 0;
//обнуление массива
        for(int b = 0; b < 36; b++)
        {
                mass4Line[b] = "0";
        }
//заполнение
        t = 0;
        for(int i = 0; i < 8; i++)
        {
            for(int j = end; j < 8; j++)
            {
                mass4Line[t] = (i + 2) + " * " + (j + 2);
                t++;
            }
            end++;
        }
//print
        /*for(int b = 0; b < 36; b++)
        {
                System.out.println(mass4Line[b]);
        }
*/
        t = 0;
        for (int i = 0; i < 35; i++)
        {
            count4[i] = 0;
        }
        System.out.println("");
        while (t < 15)
        {
            rand = randomGenerator.nextInt(35);
            count4[rand]++;
            if (count4[rand] < 2)
            {
                System.out.println((t+1) + ") " + mass4Line[rand] + " =");
                t++;
            }
        }
    }
}

