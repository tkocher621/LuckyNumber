package com.company;
import java.util.*;

/**
 * Created by tk304 on 10/9/18.
 */

public class Random {

    java.util.Random rand = new java.util.Random();
    String name;
    int maxInt = 2147483647;

    public Random(String name)
    {
        this.name = name;
    }

    public int getRandomInt(int max)
    {
        return rand.nextInt(max);
    }

    public boolean isPerfectSquare(double x)
    {
        double sr = Math.sqrt(x);
        return ((sr - Math.floor(sr)) == 0);
    }

    public int perfectRandom()
    {
        int a = rand.nextInt(maxInt);
        while (!isPerfectSquare(a) || a == 0)
        {
            a = getRandomInt(maxInt);
        }
        return a;
    }

}
