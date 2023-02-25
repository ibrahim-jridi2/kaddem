package com.esprit.alternance.kaddemApp.service;

import com.esprit.alternance.kaddemApp.entities.Equipe;

import java.util.List;

public interface EquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e,Integer equipeId);

    Equipe retrieveEquipe (Integer idEquipe);

    void deleteEquipe(Integer equipeId);
}
