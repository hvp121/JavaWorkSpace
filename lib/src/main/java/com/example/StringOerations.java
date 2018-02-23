package com.example;

/**
 * Created by manoj.bhadane on 01-02-2018.
 */

public class StringOerations
{
    public static void main(String args[])
    {
        String s1 = "manoj";//store in StringPool
        String s2 = "manoj";//store in StringPool if already exits then point to old one
        String s3 = new String("manoj");// store in Heap always create new object for new string


        /**
         * Both String and StringBuffer are final class.
         * while String class is immutable and StringBuffer mutable
         *
         */
        StringBuffer sb = new StringBuffer("manoj");

        if (s1 == s2)
            System.out.println("--true");
        else
            System.out.println("--false");


        if (s1 == s3)
            System.out.println("--true");
        else
            System.out.println("--false");

    }
}
