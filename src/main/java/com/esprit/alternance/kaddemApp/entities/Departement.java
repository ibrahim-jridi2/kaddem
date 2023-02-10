package com.esprit.alternance.kaddemApp.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement",nullable=false)
    private Integer id; // Clé primaire
    private String nomDepartement;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "departement")
    private Set<Etudiant>etudiant;


}
