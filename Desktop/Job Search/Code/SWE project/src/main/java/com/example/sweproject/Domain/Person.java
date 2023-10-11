package com.example.sweproject.Domain;
import lombok.Data;

import jakarta.persistence.*;


@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}