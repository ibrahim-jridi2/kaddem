package com.esprit.alternance.kaddemApp.Repo;

import com.esprit.alternance.kaddemApp.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipeRepo extends JpaRepository<Equipe,Integer> {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);

}
