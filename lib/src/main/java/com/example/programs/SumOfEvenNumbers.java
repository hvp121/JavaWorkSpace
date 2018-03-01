package com.example.programs;

/**
 * Created by manoj.bhadane on 01-03-2018.
 */

public class SumOfEvenNumbers
{
    public static void main(String[] args)
    {
        SumOfEvenNumbers numbers = new SumOfEvenNumbers();
        System.out.println("----Sum of even numbers--- : " + numbers.sumOfEvenNumbers());
    }

    public int sumOfEvenNumbers()
    {
        int sum = 0;
        int[] arr = {1, 5, 4, 6, 3, 5, 8, 9};

        for (int num: arr)
        {
            sum = sum + (num % 2 == 0 ? num : 0);
        }

        return sum;
    }
}
