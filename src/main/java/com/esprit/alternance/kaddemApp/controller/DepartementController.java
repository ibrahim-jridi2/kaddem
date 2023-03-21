package com.esprit.alternance.kaddemApp.controller;

import com.esprit.alternance.kaddemApp.Repo.DepartementRepo;
import com.esprit.alternance.kaddemApp.entities.Departement;
import com.esprit.alternance.kaddemApp.service.DepartementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Tag(name = "department mangement")
@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartementController {
    DepartementService departmentService;
    private final DepartementRepo departmentRepository;

    @Operation(description = "assign student to department")
    @PutMapping("/assign-etudiant/{idEtudiant}/to-department/{idDepartement}")
    public void assignEtudiantADepartment(@PathVariable("idEtudiant") Integer idEtudiant,
            @PathVariable("idDepartement") Integer idDepartement
    ){
        departmentService.assignEtudiantADepartment(idEtudiant,idDepartement);
    }
    @Operation(description = "add new department")
    @PostMapping("/add-departement")
    public Departement addDepartment(@RequestBody Departement department){
        return departmentRepository.save(department);
    }
    @GetMapping("retrieveDepartementsByid-universite/{idUniversite}")
    public Set<Departement> retrieveDepartementsByUniversite(@PathVariable("idUniversite") Integer idUniversite){
        return departmentService.retrieveDepartementsByUniversite(idUniversite);
    }
}
