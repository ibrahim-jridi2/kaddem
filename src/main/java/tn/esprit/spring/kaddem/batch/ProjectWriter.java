package tn.esprit.spring.kaddem.batch;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.esprit.spring.kaddem.entities.Equipe;
import tn.esprit.spring.kaddem.entities.Etudiant;
import tn.esprit.spring.kaddem.entities.Log;
import tn.esprit.spring.kaddem.repositories.EquipeRepository;
import tn.esprit.spring.kaddem.repositories.LogRepository;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Slf4j
//@AllArgsConstructor
//@NoArgsConstructor
@Component
public class ProjectWriter implements ItemWriter<Equipe> {
   /*tod6*/
    @Autowired
    private LogRepository logRepo;



    /* 13. écrire nos données dans la base de données*/
    public void write(List<? extends Equipe> equipes) {
        log.info("dans cette étape, nous pourrons stocker nos informations" +
                "dans une autre base de données, un fichier externe ou la meme" +
                " base de données si nous le souhaitons");
        for (Equipe equipe : equipes) {
            for (Etudiant etudiant : equipe.getEtudiants()) {
                etudiant.getContrats().forEach(contrat -> {
               /* todo 7   sauvagarder les nouvelles informations (etudiant, date log, nouveau montant
               *   dans la table log*/
                    Calendar calendar = Calendar.getInstance();
                    Log log = new Log();
                    log.setEtudiant(String.valueOf(etudiant));
                    log.setDateLog(calendar.getTime());
                    log.setNouveauMontant(contrat.getMontantContrat());
                    logRepo.save(log);
                });
            }
        }
    }
}
