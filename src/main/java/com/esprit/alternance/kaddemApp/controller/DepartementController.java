package com.esprit.alternance.kaddemApp.controller;

import com.esprit.alternance.kaddemApp.Repo.DepartementRepo;
import com.esprit.alternance.kaddemApp.entities.Departement;
import com.esprit.alternance.kaddemApp.service.DepartementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartementController {
    DepartementService departmentService;
    private final DepartementRepo departmentRepository;

    @PutMapping("/asign-etudiant/{idEtudiant}/to-department/{idDepartement}")
    public void asignEtudiantADepartment(@PathVariable("idEtudiant") Integer idEtudiant,
            @PathVariable("idDepartement") Integer idDepartement
    ){
        departmentService.asignEtudiantADepartment(idEtudiant,idDepartement);
    }
    @PostMapping("/add-departement")
    public Departement addDepartment(@RequestBody Departement department){
        return departmentRepository.save(department);
    }
}
