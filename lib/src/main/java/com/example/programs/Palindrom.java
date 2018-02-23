package com.example.programs;

/**
 * Created by manoj.bhadane on 20-12-2017.
 */
public class Palindrom
{
    public static void main(String args[])
    {
        Palindrom palindrom = new Palindrom();
        palindrom.check(121);
    }

    public void check(int no)
    {
        int original = no;
        int sum = 0;
        int rem = 0;
        while (no > 0)
        {
            rem = no % 10;
            sum = (sum * 10) + rem;
            no = no / 10;
        }

        if (sum == original)
            System.out.println("--Palindrom--");
        else
            System.out.println("-Not--Palindrom--");
    }
}
