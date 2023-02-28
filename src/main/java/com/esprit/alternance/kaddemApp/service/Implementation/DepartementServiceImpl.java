package com.esprit.alternance.kaddemApp.service.Implementation;

import com.esprit.alternance.kaddemApp.Repo.DepartementRepo;
import com.esprit.alternance.kaddemApp.Repo.EtudiantRepo;
import com.esprit.alternance.kaddemApp.entities.Departement;
import com.esprit.alternance.kaddemApp.entities.Etudiant;
import com.esprit.alternance.kaddemApp.service.DepartementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DepartementServiceImpl implements DepartementService {
    EtudiantRepo etudiantRepository;
    DepartementRepo departmentRepository;
    @Override
    public void asignEtudiantADepartment( Integer idEtudiant,Integer idDepartement) {
        Departement department = departmentRepository.findDepartmentByIdDepartment(idDepartement);
        Etudiant etudiant = etudiantRepository.findEtudiantByIdEtudiant(idEtudiant);
        if(department != null && etudiant != null){
            etudiant.setDepartement(department);
            etudiantRepository.save(etudiant);
        }

    }
}
