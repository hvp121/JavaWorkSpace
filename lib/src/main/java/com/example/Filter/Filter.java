package com.example.Filter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by manoj.bhadane on 18-01-2018.
 */
public class Filter
{
    private ArrayList<DataModel> arrayList;

    public static void main(String args[])
    {
        Filter filter = new Filter();
        filter.bindList();
        filter.printList();

    }

    private void bindList()
    {
        arrayList = new ArrayList<>();
        arrayList.add(new DataModel(7, "G", "D7", 70));
        arrayList.add(new DataModel(2, "B", "D2", 20));
        arrayList.add(new DataModel(4, "D", "D4", 40));
        arrayList.add(new DataModel(3, "C", "D3", 30));
        arrayList.add(new DataModel(1, "A", "D1", 10));
        arrayList.add(new DataModel(6, "F", "D6", 60));
        arrayList.add(new DataModel(5, "E", "D5", 50));
        arrayList.add(new DataModel(8, "H", "D8", 80));
    }

    private void printList()
    {
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++)
        {
            DataModel model = arrayList.get(i);
            System.out.println("" + model.getRollNo() + " - " + model.getName() + " - " + model.getDept() + " - " + model.getMarks());
        }
    }
}
