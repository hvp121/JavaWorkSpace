package com.example.programs;

import java.io.FileOutputStream;

/**
 * Created by manoj.bhadane on 06-01-2018.
 */
public class FibonacciSeries
{
    public static void main(String[] args)
    {
        FibonacciSeries series = new FibonacciSeries();
        series.printSeries(10);
    }

    private void printSeries(int no)
    {
        int n1 = 0, n2 = 1, s = 0;
        for (int i = 0; i < no; i++)
        {
            System.out.println("---------" + n1);
            s = n1 + n2;
            n1 = n2;
            n2 = s;
        }
    }
}
