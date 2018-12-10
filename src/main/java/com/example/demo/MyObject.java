package com.example.demo;

public class MyObject
{
    private String name;
    private String major;

    public MyObject(String name, String major)
    {
        this.name = name;
        this.major = major;
    }

    public String getName() { return name; }

    public String getMajor() { return major; }
}