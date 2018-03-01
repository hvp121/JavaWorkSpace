package com.example.programs;

/**
 * Created by manoj.bhadane on 01-03-2018.
 */

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        MultiplicationTable table = new MultiplicationTable();
        table.multiplicationTable(3);
    }

    public void multiplicationTable(int no)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(no + " * " + i + " = " + (no * i));
        }
    }
}
