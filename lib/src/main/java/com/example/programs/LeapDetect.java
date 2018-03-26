package com.example.programs;

/**
 * Created by manoj.bhadane on 07-03-2018.
 */

public class LeapDetect
{
    public static void main(String[] args)
    {
        LeapDetect detect = new LeapDetect();
        detect.isLeap(1900);
        detect.isLeap(2000);
        detect.isLeap(2004);
        detect.isLeap(2007);
    }

    private void isLeap(int year)
    {
        if ((year % 400 == 0 ? true : (year % 100 != 0 && year % 4 == 0)))
        {
            System.out.println(year + " is a Leap Year");
        } else
        {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
