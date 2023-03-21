package com.esprit.alternance.kaddemApp.service.Implementation;

import com.esprit.alternance.kaddemApp.Repo.ContratRepo;
import com.esprit.alternance.kaddemApp.entities.Contrat;
import com.esprit.alternance.kaddemApp.service.ContratService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Service
public class ContratServiceImpl implements ContratService {
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(Log.class.getName());
    ContratRepo contratRepository;

    @Scheduled(fixedDelay = 20000)
    void retrieveAndUpdateStatusContrat(){
        List<Contrat> contratList;
        contratList = contratRepository.findAll();
        Date limitDate = new Date(System.currentTimeMillis() + 15 * 24 * 60 * 60 * 1000);

        contratList.stream().filter(
                contrat -> {
                    if(limitDate.getTime()-contrat.getDateFinContrat().getTime()>0)
                        return true;
                    return false;
                }
        ).forEach(
                contrat -> log.info("THIS CONTRAT ID: "+contrat.getId()+" WILL BE EN IN "+contrat.getDateFinContrat())
        );

    }
}
