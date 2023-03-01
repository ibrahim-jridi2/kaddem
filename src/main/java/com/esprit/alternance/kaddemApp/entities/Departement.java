package com.esprit.alternance.kaddemApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement",nullable=false)
    private Integer idDepartement; // Clé primaire
    private String nomDepartement;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "departement")
    private Set<Etudiant>etudiant;


}
