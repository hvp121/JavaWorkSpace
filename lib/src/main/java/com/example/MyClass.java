package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass extends AbsractClassExample
{
    public static void main(String[] arg)
    {
        String hi = "Hello World";
        System.out.println("-------" + hi);

        Student s1 = new Student(101, "M");
        Student s2 = new Student(102, "M");

        HashMap<Student, String> map = new HashMap<>();
        map.put(s1, "M");
        map.put(s2, "N");

        System.out.println("-------size- " + map.size());

//        new AbsractClassExample(){
//            @Override
//            public void printData(String msg)
//            {
//                System.out.println("-------" + msg);
//            }
//        };

        //Calling of abstract class method
        MyClass myClass = new MyClass();
        myClass.printthisData(3, 7);

    }

    @Override
    public void printData(String msg)
    {
        System.out.println(msg);
    }

    public static class Student
    {
        Student(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            if (id != student.id) return false;
            return name.equals(student.name);

        }

        @Override
        public int hashCode()
        {
            int result = id;
            result = 31 * result + name.hashCode();
            return result;
        }

        int id;
        String name;
    }

    private void exampleLinkList()
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("Two");
        list.add("Threee");
        list.add("Four");
        list.add("Five");

        Iterator<String> iterator = list.iterator();
        if (iterator.hasNext())
            System.out.println("-------" + iterator.next());
    }

}
