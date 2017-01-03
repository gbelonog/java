package com.company;

/**
 * Created by galina on 13.12.16.
 */
public class Matrix {
    int n, m;
    int massMatrix[][];// = new int [this.n][this.m];
    Matrix()
    {
        this.n = 2;
        this.m = 2;
        this.massMatrix = new int [this.n][this.m];
        for (int i = 0; i < this.n; i++)
        {
            for (int j = 0; j < this.m; j++)
            {
                this.massMatrix[i][j] = 0;
            }
        }
    }
    Matrix(int n, int m, int matrix[][])
    {
        this.n = n;
        this.m = m;
        this.massMatrix = new int [this.n][this.m];
        for (int i = 0; i < this.n; i++)
        {
            for (int j = 0; j < this.m; j++)
            {
                massMatrix[i][j] = matrix[i][j];
            }
        }
    }
//print
    void Print()
    {
        for (int i = 0; i < 2; i++)
        {
            System.out.println("");
            for (int j = 0; j < 2; j++)
            {
                System.out.print(this.massMatrix[i][j] + " ");
            }
        }
        System.out.println("");
    }

//add
    Matrix sum(Matrix matrix2)
    {
        Matrix sumMatrix = new Matrix(this.n, this.m, massMatrix);
        for (int i = 0; i < this.n; i++)
        {
            for (int j = 0; j < this.m; j++) {
                sumMatrix.massMatrix[i][j] = 0;
            }
        }

        if ((this.n != matrix2.n) && (this.m != matrix2.m))
        {
            System.out.println("error: matrix size is wrong");
        } else
            {
                for (int i = 0; i < this.n; i++)
                {
                    for (int j = 0; j < this.m; j++)
                    {
                        sumMatrix.massMatrix[i][j] = this.massMatrix[i][j] + matrix2.massMatrix[i][j];
                    }
                }
            }
            return sumMatrix;
    }
//multiply by number
Matrix multiplyByNumber(int number)
{
    Matrix multMatrix = new Matrix(this.n, this.m, massMatrix);
    for (int i = 0; i < this.n; i++)
    {
        for (int j = 0; j < this.m; j++) {
            multMatrix.massMatrix[i][j] = 0;
        }
    }
        for (int i = 0; i < this.n; i++)
        {
            for (int j = 0; j < this.m; j++)
            {
                multMatrix.massMatrix[i][j] = this.massMatrix[i][j] * number;
            }
        }
    return multMatrix;
}

//min
int min()
{
    int minNumber = massMatrix[0][0];
    for(int i = 0; i < this.n; i++) {
        for (int j = 0; j < this.m; j++) {
            if (this.massMatrix[i][j] < minNumber) {
                minNumber = massMatrix[i][j];
            }
        }
    }
    return minNumber;
}

//compare
boolean compare(Matrix matrix2)
{
    Matrix compareMatrix = new Matrix(this.n, this.m, massMatrix);
    for (int i = 0; i < this.n; i++)
    {
        for (int j = 0; j < this.m; j++) {
            compareMatrix.massMatrix[i][j] = 0;
        }
    }

    if ((this.n != matrix2.n) && (this.m != matrix2.m))
    {
        System.out.println("error: matrix size is wrong");
    } else
    {
        for (int i = 0; i < this.n; i++)
        {
            for (int j = 0; j < this.m; j++)
            {
                compareMatrix.massMatrix[i][j] = this.massMatrix[i][j] - matrix2.massMatrix[i][j];
            }
        }
    }
    for (int i = 0; i < this.n; i++)
    {
        for (int j = 0; j < this.m; j++)
        {
            if (compareMatrix.massMatrix[i][j] != 0)
                return false;
        }
    }
    return true;
}

}
