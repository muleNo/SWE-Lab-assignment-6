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
public class Student extends Person {

    private String studentId;
    private String name;
    //private String email;
    //we will check this
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address mailing;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address homeAddress;
    @OneToMany(mappedBy = "student")
    @JsonIgnore
    private List<Registration> registrations;
    @OneToMany
    @JsonIgnore
    private List<RegistrationRequest> registrationRequests;
}
