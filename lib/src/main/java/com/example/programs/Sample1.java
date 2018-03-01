package com.example.programs;

/**
 * Created by manoj.bhadane on 01-03-2018.
 */

public class Sample1
{
    public static void main(String[] args)
    {
        Sample1 sample1 = new Sample1();
        sample1.print();
    }

    public void print()
    {
        for (int i = 1; i <= 100; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println("--RS--");
            } else if (i % 3 == 0)
            {
                System.out.println("--R--");
            } else if (i % 5 == 0)
            {
                System.out.println("--S--");
            } else
            {
                System.out.println("--" + i + "--");
            }
        }
    }
}
