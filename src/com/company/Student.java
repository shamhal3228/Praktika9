package com.company;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Student {

    Scanner in=new Scanner(System.in);
    private int id, size;
    private String FIO;

    Student(int id, String FIO)
    {
        this.FIO=FIO;
        this.id=id;
        System.out.print("Hello world");
        System.out.print("Hello world");
        System.out.print("Hello world");
    }

    public int getId()
    {
        return id;
    }

    public String getFIO()
    {
        return FIO;
    }
}