package com.example.sweproject.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class RegistrationRequest {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private CourseOffering courseOffering;
    private int priorityNumber;
}
