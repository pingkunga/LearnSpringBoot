package com.cu.thesis.WeMuBPMN.entity;


public class Person
{
    private String Fistname;
    private String Lastname;

    public Person(String pFirstname, String pLastname)
    {
        this.Fistname = pFirstname;
        this.Lastname = pLastname;
    }

    public void setFirstname(String pFirstname)
    {
        this.Fistname = pFirstname;
    }

    public String getFirstname()
    {
        return this.Fistname;
    }

    public void setLastname(String pLastname)
    {
        this.Lastname = pLastname;
    }

    public String getLastname()
    {
        return this.Lastname;
    }

    public String getFullname()
    {
        return this.getFirstname() + " " + this.getLastname();
    }
}