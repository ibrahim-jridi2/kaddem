package com.esprit.alternance.kaddemApp.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe",nullable=false)
    private Integer id; // Clé primaire
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    private String nomEquipe;
    @ManyToMany(mappedBy = "equipe",cascade = CascadeType.ALL)
    private Set<Etudiant> etudiant;
    @OneToOne
    private DetailEquipe detEquipe;

}
