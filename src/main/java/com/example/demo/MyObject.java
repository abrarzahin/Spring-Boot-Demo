package com.example.demo;

/**
 * This class is the 'Model' component of the MVC architecture model.
 */
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