package com.persitance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(length = 30, nullable = false)
private String nom;
@Email
@Column(nullable = false,unique = true)
private String email;
@Column(nullable = false)
private String mdp;

}
