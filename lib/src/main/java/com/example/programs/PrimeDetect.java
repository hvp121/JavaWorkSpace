package com.example.programs;

/**
 * Created by manoj.bhadane on 29-12-2017.
 */
public class PrimeDetect
{
    public static void main(String args[])
    {
        PrimeDetect detect = new PrimeDetect();
        detect.check(11);
        detect.check(12);
        detect.check(13);
        detect.check(14);
        detect.check(15);
    }

    public void check(int number)
    {
        boolean isPrime = true;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(number + " is prime");
        else
            System.out.println(number + " is not prime");
    }
}
