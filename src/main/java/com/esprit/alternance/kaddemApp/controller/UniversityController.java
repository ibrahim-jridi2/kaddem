package com.esprit.alternance.kaddemApp.controller;

import com.esprit.alternance.kaddemApp.Repo.UniversityRepo;
import com.esprit.alternance.kaddemApp.entities.Departement;
import com.esprit.alternance.kaddemApp.entities.Equipe;
import com.esprit.alternance.kaddemApp.entities.Universite;
import com.esprit.alternance.kaddemApp.service.EquipeService;
import com.esprit.alternance.kaddemApp.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/university")
public class UniversityController {
    UniversityService universityService;
    @GetMapping("/retrieve-all-universities")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universityService.retrieveAllEUniversites();
        return listUniversites;
    }
    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite Universite){


        return universityService.addUniversite(Universite);
    }
    @DeleteMapping("/deleteUniversite/{equipeId}")
    public void deleteUniversite(@PathVariable Integer UniversiteId){
        universityService.deleteUniversite(UniversiteId);
    }
    @PutMapping("/updateEquipe")
    public Universite updateEquipe(Universite Universite,@PathVariable Integer UniversiteId){
        return universityService.updateUniversite(Universite,UniversiteId);
    }
    @GetMapping("/retrieve-departement-by-id/{idUniversite}")
    public List<Departement> getDepartementsByUniversityId(@PathVariable("idUniversite") Integer idUniversity) {
        List<Departement> list = universityService.retrieveDepartementsByUniversite(idUniversity);
        return list;
    }
    @GetMapping("getChiffreAffaireEntreStartDate={startDate}&endDate={endDate}")
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate){
        return 0.0f;
    }
}
