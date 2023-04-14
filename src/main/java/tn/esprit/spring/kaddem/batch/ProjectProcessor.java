package tn.esprit.spring.kaddem.batch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;
import tn.esprit.spring.kaddem.entities.Equipe;
import tn.esprit.spring.kaddem.entities.Etudiant;

@Slf4j
public class ProjectProcessor implements ItemProcessor<Equipe, Equipe> {
	/*12. logique métier de notre job*/
	@Override
	public Equipe process(Equipe equipe) {
		log.info("Start Batch Item Processor");
		for (Etudiant etudiant : equipe.getEtudiants() ) {
			etudiant.getContrats().forEach(contrat -> {
				//todo3  (mettre à jour le montant du contrat avec une augmentation de 10%)
				Integer montant = contrat.getMontantContrat();
				Integer nouveauMontant = (int) (montant * 1.1); // 10% increase
				contrat.setMontantContrat(nouveauMontant);
			});

		}
		return equipe;
	}
}
