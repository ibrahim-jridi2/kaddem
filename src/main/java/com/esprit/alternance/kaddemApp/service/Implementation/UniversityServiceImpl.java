package com.esprit.alternance.kaddemApp.service.Implementation;

import com.esprit.alternance.kaddemApp.Repo.UniversityRepo;
import com.esprit.alternance.kaddemApp.entities.Departement;
import com.esprit.alternance.kaddemApp.entities.Universite;
import com.esprit.alternance.kaddemApp.service.UniversityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class UniversityServiceImpl implements UniversityService {
    UniversityRepo universityRepository;

    @Override
    public List<Universite> retrieveAllEUniversites() {
        return universityRepository.findAll();
    }



    @Override
    public Universite addUniversite(Universite e) {
        return universityRepository.save(e);
    }

    @Override
    public Universite updateUniversite(Universite Universite, Integer UniversiteId) {
        Universite Universite1 = universityRepository.findById(UniversiteId).get();
        Universite1.setNomUniversite(Universite.getNomUniversite());
        Universite1.setDept(Universite.getDept());


        return universityRepository.save(Universite1);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universityRepository.findById(idUniversite).get();
    }

    @Override
    public void deleteUniversite(Integer UniversiteId) {
        universityRepository.deleteById(UniversiteId);
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        List<Departement> list= universityRepository.findDepartementsByIdUniversity(idUniversite);
        return list;
    }
    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate) {
        return 0;
    }
}
