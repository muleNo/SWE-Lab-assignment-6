package com.example.sweproject.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public
class RegistrationGroup {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany
    @JsonIgnore
    private List<Student> students ;
    @ManyToOne
    @JsonBackReference
    private RegistrationEvent registrationEvent;
    @ManyToMany
    private List<AcademicBlock> blocks;
}
