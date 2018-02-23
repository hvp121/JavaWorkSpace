package com.example.weather;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by manoj.bhadane on 15-01-2018.
 */
class Print
{

    protected String fileName;

    protected FileWriter writer;

    public Print()
    {
    }

    public Print(String fileName) throws IOException
    {
        this.fileName = fileName;
//        this.writer = new FileWriter(this.fileName);
        this.writer = new FileWriter(new File("D:\\", this.fileName));
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public void setFileName(String fileName) throws IOException
    {
        this.fileName = fileName;
//        this.writer = new FileWriter(this.fileName);
        this.writer = new FileWriter(new File("D:\\", this.fileName));
    }

    public void close() throws IOException
    {
        this.writer.flush();
        this.writer.close();
    }

    public void addRow(String[] c) throws IOException
    {
        int l = c.length;
        for (int i = 0; i < l; i++)
        {
            this.writer.append(c[i]);
            if (i != (l - 1))
            {
                this.writer.append(",");
            }
        }
        this.writer.append('\n');
    }
}