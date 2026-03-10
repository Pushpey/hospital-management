package com.pushpey.demorest4.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private String name ;
    private int age ;
    private String disease ;
    private String phone ;
    private LocalDateTime resisteredAt ;

    private Patient(){ this.resisteredAt = LocalDateTime.now() ;}
}
