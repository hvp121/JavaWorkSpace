package com.example.Filter;

/**
 * Created by manoj.bhadane on 18-01-2018.
 */
public class DataModel implements Comparable<DataModel>
{
    @Override
    public int compareTo(DataModel o)
    {
        if (o.getRollNo() < this.rollNo)
        {
            if (o.getDept().equalsIgnoreCase("d4"))
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }

        return -1;
    }

    private int rollNo;
    private String name;
    private String dept;
    private int marks;

    DataModel(int rollNo, String name, String dept, int marks)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.marks = marks;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDept()
    {
        return dept;
    }

    public void setDept(String dept)
    {
        this.dept = dept;
    }

    public int getMarks()
    {
        return marks;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }
}
