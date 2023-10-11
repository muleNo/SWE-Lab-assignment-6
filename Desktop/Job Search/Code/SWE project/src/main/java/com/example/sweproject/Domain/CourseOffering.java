package com.example.sweproject.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class CourseOffering {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Faculty faculty;
    @ManyToOne
    @JsonBackReference
    private AcademicBlock block;
    @OneToMany(mappedBy = "courseOffering", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Registration> registrations;
    @OneToMany(mappedBy = "courseOffering", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<RegistrationRequest> registrationRequests;
    private int capacity;
    @Transient
    private int availableSeats;

}
