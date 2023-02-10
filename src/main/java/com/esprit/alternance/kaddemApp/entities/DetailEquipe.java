package com.esprit.alternance.kaddemApp.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe",nullable=false)
    private Integer id; // Clé primaire
    private Integer salle;
    private String thematique;

    @OneToOne(mappedBy = "detEquipe")
    private Equipe equipe;
}
