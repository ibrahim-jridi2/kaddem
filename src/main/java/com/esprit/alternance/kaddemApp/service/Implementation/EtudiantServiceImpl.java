package com.esprit.alternance.kaddemApp.service.Implementation;

import com.esprit.alternance.kaddemApp.Repo.EtudiantRepo;
import com.esprit.alternance.kaddemApp.entities.Etudiant;
import com.esprit.alternance.kaddemApp.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class EtudiantServiceImpl implements EtudiantService {
    EtudiantRepo etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
