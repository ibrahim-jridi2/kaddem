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
    @OneToOne(cascade = CascadeType.ALL)
    private DetailEquipe detEquipe;

}
