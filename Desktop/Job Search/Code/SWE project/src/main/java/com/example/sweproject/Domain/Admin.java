package com.example.sweproject.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends Person{
    @Id
    @GeneratedValue
    private Long id;

    private String role;

}
