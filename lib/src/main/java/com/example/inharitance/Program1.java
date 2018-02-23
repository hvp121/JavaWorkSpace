package com.example.inharitance;

/**
 * Created by manoj.bhadane on 05-02-2018.
 */

public class Program1
{
    public static void main(String args[])
    {
        /**
         * This will print com.example.inharitance.Student@42a57993 like this
         *  Classname@42d879 class name with hashcode as we didnt override toString method in Student
         *  class.. so this Student class called Object class's toString method which contain toString
         *  method implementation to print class name along with hashcode of class
         */
        Student s = new Student(10, 20);
        System.out.println("--------------" + s);

        /**
         * This will print Roll No :10 - Marks : 20 like this as we provide implementation of toString
         * methos here
         */
        Student1 s1 = new Student1(10, 20);
        System.out.println("--------------" + s1);
    }
}
