package com.example.inharitance;

/**
 * Created by manoj.bhadane on 05-02-2018.
 */

public class Student1
{
    int rollNo, marks;

    public Student1(int roll, int mark)
    {
        this.rollNo = roll;
        this.marks = mark;
    }

    @Override
    public String toString()
    {
        return "Roll No :" + rollNo + " - Marks : " + marks;
    }
}
