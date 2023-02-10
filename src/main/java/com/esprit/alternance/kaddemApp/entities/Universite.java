package com.esprit.alternance.kaddemApp.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite",nullable=false)
    private Integer id; // Clé primaire
    private String nomUniversite;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement>dept;
}
