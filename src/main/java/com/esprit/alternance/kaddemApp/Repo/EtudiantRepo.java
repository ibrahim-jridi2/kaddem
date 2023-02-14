package com.esprit.alternance.kaddemApp.Repo;

import com.esprit.alternance.kaddemApp.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepo extends JpaRepository<Etudiant,Integer> {
    public List<Etudiant> FindByEquipesIdEquipeAndEtudiantNiveauSenior(Integer equipeId);
    List<Etudiant> findByDepartementsIdDeparatement(Integer departementId);
}

