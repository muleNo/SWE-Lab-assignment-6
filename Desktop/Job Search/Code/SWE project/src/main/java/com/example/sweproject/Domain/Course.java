package com.example.sweproject.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private String description;
    @OneToMany(mappedBy = "course")
    @JsonIgnore
    private List<CourseOffering> courseOfferings;


}
