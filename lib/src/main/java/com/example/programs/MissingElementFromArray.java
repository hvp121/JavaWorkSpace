package com.example.programs;

import java.util.Random;

/**
 * Created by manoj.bhadane on 07-03-2018.
 */

public class MissingElementFromArray
{
    public static void main(String[] args)
    {
        MissingElementFromArray missingElementFromArray = new MissingElementFromArray();
        missingElementFromArray.missingElement();

    }

    private void missingElement()
    {
        // Ans should be 5 as its missing
        int[] bigArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] smallArray = {1, 2, 3, 4, 6, 7, 8, 9};

        int sumOfBigArr = 0, sumOfSmallArr = 0;

        for (int i = 0; i < bigArray.length; i++)
        {
            if (i < smallArray.length)
                sumOfSmallArr = sumOfSmallArr + smallArray[i];
            sumOfBigArr = sumOfBigArr + bigArray[i];
        }
        System.out.println("Missing element is " + (sumOfBigArr - sumOfSmallArr));
    }
}
