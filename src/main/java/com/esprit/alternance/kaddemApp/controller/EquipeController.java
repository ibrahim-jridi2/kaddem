package com.esprit.alternance.kaddemApp.controller;

import com.esprit.alternance.kaddemApp.entities.DetailEquipe;
import com.esprit.alternance.kaddemApp.entities.Equipe;
import com.esprit.alternance.kaddemApp.service.EquipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Equipe Management")
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
    @Operation(description = "Retrieve all products")
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
