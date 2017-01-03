package com.company;
import pack2.B;
public class Main {

    public static void main(String[] args) {
        Box box = new Box();

       /* box.width = 1;
        box.heigth = 2;
        box.depth = 3;
        double volume = box.width * box.heigth * box.depth;

        System.out.println(box.width);
        System.out.println(box.heigth);
        System.out.println(box.depth);
        System.out.println(volume);*/

        double volume1 = box.volume();
        System.out.println(volume1);
    }
}
