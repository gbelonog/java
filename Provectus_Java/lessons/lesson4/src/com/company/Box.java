package com.company;

/**
 * Created by galina on 07.12.16.
 */
public class Box {
    double width;
    double heigth;
    double depth;

    Box()
    {
        width = 4;
        heigth = 2;
        depth = 3;
    }

    double volume()
    {
        return (width*heigth*depth);
    }

}
