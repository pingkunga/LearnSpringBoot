package com.cu.thesis.WeMuBPMN.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(min=3, max=30)	
    private String Fistname;

    @NotNull
    @Size(min=3, max=50)	
    private String Lastname;

    public Person()
    {

    }
    
    public Person(String pFirstname, String pLastname)
    {
        this.Fistname = pFirstname;
        this.Lastname = pLastname;
    }

    public void setId(Integer pId)
    {
        this.id = pId;
    }

    public Integer getId()
    {
        return this.id;
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