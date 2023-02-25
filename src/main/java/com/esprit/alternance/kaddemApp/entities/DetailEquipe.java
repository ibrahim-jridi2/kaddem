package com.esprit.alternance.kaddemApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
