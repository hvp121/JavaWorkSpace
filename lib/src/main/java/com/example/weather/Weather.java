package com.example.weather;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by manoj.bhadane on 15-01-2018.
 */
public class Weather
{
    public static void main(String args[])
    {

        Weather weather = new Weather();
        weather.convert();
    }

    public void convert()
    {
        System.out.println("Initialize ...");
        Read read = new Read("soal01.txt");
        Print print = new Print();
        for (int i = 1; i <= 3; i++)
        {
            try
            {
                print.setFileName("jawaban" + i + ".csv");
                read.setPrint(print);
                read.exec(i);
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
        System.out.println("Finished");
    }
}
