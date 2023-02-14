package com.esprit.alternance.kaddemApp.Repo;

import com.esprit.alternance.kaddemApp.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepo extends JpaRepository<Etudiant,Integer> {
    //Récupérer les étudiants dont l’équipe a un niveau SENIOR
     List<Etudiant> FindByEquipesIdEquipeAndEtudiantNiveauSenior();
    List<Etudiant> findByEquipeNiveau(String niveau);
    //Récupérer les étudiants d’un département donné
    List<Etudiant> findByDepartementsIdDeparatement(Integer departementId);
}

