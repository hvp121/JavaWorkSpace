package com.example.inharitance;

import java.awt.SystemTray;

/**
 * Created by manoj.bhadane on 14-12-2017.
 */
public class ParentClass
{
    public void ThisIsParent()
    {
        System.out.println("-------This is Parent method");
    }

    //This is compile time polimorphism
    public void ThisIsParent(String msg)
    {
        System.out.println("-------" + msg);
    }

    public void ThisIsParent(String msg, String msg1)
    {
        System.out.println("-------" + msg + msg1);
    }

    public void printFinalInt()
    {
        //you can only assign value to final only once or at the time of intialisation
        // 1.
        final int i;
        i = 5;
        // i=4; this is not possible here

        //2.
        final int j = 5;

        System.out.println("-------" + i);
    }
}
