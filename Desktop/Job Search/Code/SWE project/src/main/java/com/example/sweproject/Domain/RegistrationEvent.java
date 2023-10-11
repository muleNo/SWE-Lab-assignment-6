package com.example.sweproject.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public
class RegistrationEvent {
    @Id
    @GeneratedValue
    private long id;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @OneToMany(mappedBy = "registrationEvent")
    @JsonManagedReference
    private List<RegistrationGroup> registrationGroups = new ArrayList<>();
    @Transient
    private RegistrationEventStatus status;

    public void addRegistrationGroup(RegistrationGroup registrationGroup){
        this.registrationGroups.add(registrationGroup);
        registrationGroup.setRegistrationEvent(this);
    }
}

