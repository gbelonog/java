package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	    int a = 0, b = 0, c = 0, average = 0, max = 0;
        float m = 0, n = 0, differenceM = 0, differenceN = 0;
        double D = 0, aDescr = 0, bDescr = 0, cDescr = 0, x1 = 0, x2 = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input number a ");
        String s = scan.nextLine();
        a = Integer.parseInt(s);

        System.out.println("Input number b ");
        s = scan.nextLine();
        b = Integer.parseInt(s);

        System.out.println("Input number c ");
        s = scan.nextLine();
        c = Integer.parseInt(s);
//avarage
        average = (a + b + c)/3;
        System.out.println("Avarage = " + average);
//max
        max = a;
        if (max < b)
        { max = b;}
        if (max < c)
        { max = c;}

        System.out.println("Max = " + max);
//max ?:
        max = (a < b) ?  b : a;
        max = (max < c) ? c : max;
        System.out.println("Max = " + max);
// odd and even
        if ((a % 2) == 0)
            System.out.println(a + " is even number.");
        else
            System.out.println(a + " is odd number.");

        if ((b % 2) == 0)
            System.out.println(b + " is even number.");
        else
            System.out.println(b + " is odd number.");

        if ((c % 2) == 0)
            System.out.println(c + " is even number.");
        else
            System.out.println(c + " is odd number.");

// near 10
        System.out.println("Input float number m ");
        s = scan.nextLine();
        m = Float.parseFloat(s);
        differenceM = Math.abs(10 - m);


        System.out.println("Input float number n ");
        s = scan.nextLine();
        n = Float.parseFloat(s);
        differenceN = Math.abs(10 - n);

        if (differenceN < differenceM)
        {
            System.out.println(n + " is closer to 10 then " + m);
        }
        else
            if (differenceN > differenceM) {
                System.out.println(m + " is closer to 10 then " + n);
            }
            else System.out.println(m + " = " + n);

//discriminant
        System.out.println("Input number a for quadratic equation");
        s = scan.nextLine();
        aDescr = Integer.parseInt(s);

        System.out.println("Input number b for quadratic equation");
        s = scan.nextLine();
        bDescr = Integer.parseInt(s);

        System.out.println("Input number c for quadratic equation");
        s = scan.nextLine();
        cDescr = Integer.parseInt(s);

        System.out.println("Quadratic equation is " + aDescr + "x`2 + " + bDescr + "x + " + cDescr + "= 0");
        D = bDescr*bDescr - 4*aDescr*cDescr;
        System.out.println ("D = " + D);
        System.out.println ("sqrt D = " + Math.sqrt(D));
        if (D == 0)
        {
            x1 = (-1*bDescr)/(2*aDescr);
            x2 = x1;
            System.out.println("D = 0: x1 = " + x1 + ", x2 = " + x2);
        }
        if (D > 0)
            {
                x1 = (-1*bDescr + Math.sqrt(D))/(2*aDescr);
                x2 = (-1*bDescr - Math.sqrt(D))/(2*aDescr);
                System.out.println("D > 0: x1 = " + x1 + ", x2 = " + x2);
            }
        if (D < 0)
            {
                System.out.println("There is no answer, as D < 0.");
            }



    }
}
