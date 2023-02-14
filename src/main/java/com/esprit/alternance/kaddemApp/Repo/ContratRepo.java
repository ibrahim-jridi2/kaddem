package com.esprit.alternance.kaddemApp.Repo;

import com.esprit.alternance.kaddemApp.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepo extends JpaRepository<Contrat,Integer> {
}
