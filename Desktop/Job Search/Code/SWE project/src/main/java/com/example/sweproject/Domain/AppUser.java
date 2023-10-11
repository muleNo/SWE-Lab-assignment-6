package com.example.sweproject.Domain;

import jakarta.persistence.*;


@Entity
public class AppUser {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}

