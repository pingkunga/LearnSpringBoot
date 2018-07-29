package com.cu.thesis.WeMuBPMN.service;

import com.cu.thesis.WeMuBPMN.entity.Person;

import org.springframework.stereotype.Service;

@Service
public class PersonService
{
    public Person viewPerson()
    {
        return new Person("Chatri", "Ngambenchawong");
    }
}