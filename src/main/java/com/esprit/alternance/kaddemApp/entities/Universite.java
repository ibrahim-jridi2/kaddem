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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite",nullable=false)
    private Integer idUniversity; // Clé primaire
    private String nomUniversite;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement>dept;
}
