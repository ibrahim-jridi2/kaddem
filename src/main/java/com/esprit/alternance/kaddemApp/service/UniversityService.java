package com.esprit.alternance.kaddemApp.service;

import com.esprit.alternance.kaddemApp.entities.Universite;

import java.util.List;

public interface UniversityService {
    List<Universite> retrieveAllEUniversites();

    Universite addUniversite(Universite e);

    Universite updateUniversite (Universite e,Integer equipeId);

    Universite retrieveUniversite (Integer idUniversite);

    void deleteUniversite(Integer UniversiteId);
}
