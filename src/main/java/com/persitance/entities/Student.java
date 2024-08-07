package com.persitance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(length = 40,nullable = false)
private String nom;
@Column(length = 20,nullable = false)
private String groupe;
@Min(value = 1)
private int niveau;
}
