package com.example;

/**
 * Created by manoj.bhadane on 14-12-2017.
 */
public abstract class AbsractClassExample
{
//    A class can be marked as abstract with out containing any abstract method.
//    But if a class has even one abstract method, then the class has to be an abstract class.
//    An abstract class can have one or more abstract methods.
//    An abstract class can have both abstract and non abstract (or concrete) method.
//    The abstract method should not have method body. Even empty flower braces { } are not allowed.

//    public AbsractClassExample()
//    {
//        printData("This is abstract class");
//    }

    public void printthisData(int a, int b)
    {
        printData("-------This is abstract class--sum-" + (a + b));
    }

    public abstract void printData(String msg);

}
