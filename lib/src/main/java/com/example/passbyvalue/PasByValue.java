package com.example.passbyvalue;

/**
 * Created by manoj.bhadane on 31-01-2018.
 */

public class PasByValue
{
    public static void main(String arg[])
    {
        new PasByValue().processData();
    }

    public void processData(){
        Emp emp = new Emp("Manoj");
//        emp.setName("xyz");
        changeName(emp);
        System.out.println("------------" + emp.name);

    }

    public void changeName(Emp emp){
        emp.setName("abc");

    }
}
