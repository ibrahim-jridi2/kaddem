package com.esprit.alternance.kaddemApp.service.Implementation;

import com.esprit.alternance.kaddemApp.Repo.DepartementRepo;
import com.esprit.alternance.kaddemApp.Repo.EtudiantRepo;
import com.esprit.alternance.kaddemApp.Repo.UniversityRepo;
import com.esprit.alternance.kaddemApp.entities.Departement;
import com.esprit.alternance.kaddemApp.entities.Etudiant;
import com.esprit.alternance.kaddemApp.entities.Universite;
import com.esprit.alternance.kaddemApp.service.DepartementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@AllArgsConstructor
@Service
public class DepartementServiceImpl implements DepartementService {
    EtudiantRepo etudiantRepository;
    DepartementRepo departmentRepository;
    UniversityRepo universiteRepository;
    @Override
    public void assignEtudiantADepartment(Integer idEtudiant, Integer idDepartement) {
        Departement department = departmentRepository.findById(idDepartement).get();
        Etudiant etudiant = etudiantRepository.findById(idEtudiant).get();
        if(department != null && etudiant != null){
            etudiant.setDepartement(department);
            etudiantRepository.save(etudiant);
        }

    }
    @Override
    public Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findByIdUniversity(idUniversite);
        if(universite == null)
            return null;

        return universite.getDept();
    }
}
