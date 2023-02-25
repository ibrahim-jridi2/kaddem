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
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Integer idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "etudiant")
    private Set<Contrat> contrats;
    @ManyToOne
    Departement departement;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipe>equipe;

// Constructeur et accesseurs (getters) et mutateurs (setters)
}

