package com.example.inharitance;

/**
 * Created by manoj.bhadane on 14-12-2017.
 */
public class ChildClass extends ParentClass
{
//    NOTE :
//    Overloading is an example of compiler-time polymorphism and
//    Overriding is an example of run time polymorphism.

//    Polymorphism is the ability of an object to take on many forms.
//    The most common use of polymorphism in OOP occurs when a parent class reference is used to refer
//    to a child class object.


    //This is run time polimorphism
    @Override
    public void ThisIsParent()
    {
//        super.ThisIsParent();
        System.out.println("-------This is Child method");
    }

    public static void main(String args[])
    {
        ChildClass childClass = new ChildClass();
        childClass.ThisIsParent();

        //This is run time polimorphism
        ParentClass parentClass = new ChildClass();
        parentClass.ThisIsParent();
    }
}
