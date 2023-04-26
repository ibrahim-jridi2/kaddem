package com.esprit.alternance.kaddemApp.Repo;

import com.esprit.alternance.kaddemApp.entities.Departement;
import com.esprit.alternance.kaddemApp.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UniversityRepo extends JpaRepository<Universite,Integer> {
    List<Departement> findDepartementsByIdUniversity(Integer idUniversity);
    Universite findByIdUniversity(Integer idUniversite);
}
