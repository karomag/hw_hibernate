package com.example.hw_hibernate.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PersonPK implements Serializable {
    private String name;
    private String surname;
    private int age;
}
