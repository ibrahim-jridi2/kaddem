package com.esprit.alternance.kaddemApp.service.Implementation;

import com.esprit.alternance.kaddemApp.Repo.EquipeRepo;
import com.esprit.alternance.kaddemApp.entities.Equipe;
import com.esprit.alternance.kaddemApp.service.EquipeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipeServiceImpl implements EquipeService {
    EquipeRepo equipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe, Integer equipeId) {
        Equipe equipe1 = equipeRepository.findById(equipeId).get();
        equipe1.setNomEquipe(equipe.getNomEquipe());
        equipe1.setNiveau(equipe.getNiveau());
        equipe1.setDetEquipe(equipe.getDetEquipe());

        return equipeRepository.save(equipe1);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }

    @Override
    public void deleteEquipe(Integer equipeId) {
        equipeRepository.deleteById(equipeId);
    }


}
