package com.esprit.alternance.kaddemApp.controller;

import com.esprit.alternance.kaddemApp.entities.DetailEquipe;
import com.esprit.alternance.kaddemApp.entities.Equipe;
import com.esprit.alternance.kaddemApp.service.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {
    EquipeService equipeService;
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }
    @PostMapping("/addEquipe")
    public Equipe addEquipe(@RequestBody Equipe equipe){


        return equipeService.addEquipe(equipe);
    }
    @DeleteMapping("/deleteEquipe/{equipeId}")
    public void deleteEquipe(@PathVariable Integer equipeId){
         equipeService.deleteEquipe(equipeId);
    }
    @PutMapping("/updateEquipe")
    public Equipe updateEquipe(Equipe equipe,@PathVariable Integer equipeId){
        return equipeService.updateEquipe(equipe,equipeId);
    }
}
