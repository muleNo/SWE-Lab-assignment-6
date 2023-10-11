package com.example.sweproject.Domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class AcademicBlock {
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private Semester semester;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @OneToMany(mappedBy = "block", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<CourseOffering> courseOfferings;

}
