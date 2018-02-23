package com.example.programs;

/**
 * Created by manoj.bhadane on 28-12-2017.
 */
public class SumOfDigits
{
    public static void main(String args[])
    {
        SumOfDigits digits = new SumOfDigits();
        digits.sumOfDigits(123);
    }

    public void sumOfDigits(int number)
    {
        System.out.println("given number is-a--- " + number);
        int sum = 0;
        while (number > 0)
        {
            int rem = number % 10;
            number = number / 10;
            sum = sum + rem;
        }

        System.out.println("Sum of digits of given number is---- " + sum);
    }
}
