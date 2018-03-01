package com.example.programs;

/**
 * Created by manoj.bhadane on 01-03-2018.
 */

public class PalindroimString
{
    public static void main(String[] args)
    {
        PalindroimString p = new PalindroimString();
        p.palindrom("madam");
        p.palindrom("Hello");
        p.palindrom("Nayan");
    }

    public void palindrom(String input)
    {
        String newString = "";
        char[] str = input.toCharArray();

        for (int i = str.length - 1; i >= 0; i--)
            newString = newString + str[i];
        
        if (input.equalsIgnoreCase(newString))
            System.out.println(input + " is Palindrom");
        else System.out.println(input + " is Not Palindrom");
    }
}
