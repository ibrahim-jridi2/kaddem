package com.esprit.alternance.kaddemApp.controller;

import com.esprit.alternance.kaddemApp.entities.Etudiant;
import com.esprit.alternance.kaddemApp.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    EtudiantService etudiantService;
    @PostMapping("/add-etudiant")
    public Etudiant addUniversite(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }
    @PostMapping("/asgin-etudiant-contrat-equipe/{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(
            @RequestBody Etudiant etudiant,
            @PathVariable("idContrat") Integer idContrat,
            @PathVariable("idEquipe")  Integer idEquipe
    ){
        return etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant, idContrat, idEquipe);
    }
}
