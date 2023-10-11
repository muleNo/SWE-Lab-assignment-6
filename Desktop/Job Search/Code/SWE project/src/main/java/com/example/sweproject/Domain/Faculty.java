package com.example.sweproject.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class Faculty extends Person {
    @Id
    @GeneratedValue
    private Long id;
    private String title;

}
