package com.example.programs;

/**
 * Created by manoj.bhadane on 05-03-2018.
 */

public class SplitSentences
{
    public static void main(String[] args)
    {
        SplitSentences sentences = new SplitSentences();
        sentences.split("This is String");
    }

    private void split(String sentences)
    {
        char[] chars = sentences.toCharArray();
        String finalStr = "";
        StringBuilder str = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--)
        {
            if (chars[i] == ' ')
            {
                finalStr = finalStr + str.reverse() + " ";
                str = new StringBuilder();
            }
            str.append(chars[i]);

        }

        finalStr = finalStr + str.reverse();
        System.out.println("-- " + finalStr);
    }
}
