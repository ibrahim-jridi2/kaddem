package com.esprit.alternance.kaddemApp.controller;

import com.esprit.alternance.kaddemApp.entities.Etudiant;
import com.esprit.alternance.kaddemApp.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    EtudiantService etudiantService;
    @PostMapping("/add-etudiant")
    public Etudiant addUniversite(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }
}
