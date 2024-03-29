package com.esprit.alternance.kaddemApp.service;

import com.esprit.alternance.kaddemApp.entities.Etudiant;

public interface EtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,
                                                     Integer idEquipe);

}
