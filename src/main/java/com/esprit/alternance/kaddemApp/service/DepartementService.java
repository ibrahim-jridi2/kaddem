package com.esprit.alternance.kaddemApp.service;

import com.esprit.alternance.kaddemApp.entities.Departement;

import java.util.Set;

public interface DepartementService {
    void assignEtudiantADepartment(Integer idEtudiant, Integer idDepartement);
    Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
}
