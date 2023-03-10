package com.esprit.alternance.kaddemApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer id; // Clé primaire
    @Column(name="dateDebutContrat")
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Column(name="dateFinContrat")
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private Integer montantContrat;
    @ManyToOne
    Etudiant etudiant;
}
