package com.example.sweproject.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Registration {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private CourseOffering courseOffering;
}
