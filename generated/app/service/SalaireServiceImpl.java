package app.service;

import app.dao.CollaborateurDAO;
import app.dao.PosteDAO;
import app.dao.SalaireDAO;

import app.domain.Collaborateur;
import app.domain.Poste;
import app.domain.Salaire;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Salaire entities
 * 
 */

@Service("SalaireService")
@Transactional
public class SalaireServiceImpl implements SalaireService {

	/**
	 * DAO injected by Spring that manages Collaborateur entities
	 * 
	 */
	@Autowired
	private CollaborateurDAO collaborateurDAO;

	/**
	 * DAO injected by Spring that manages Poste entities
	 * 
	 */
	@Autowired
	private PosteDAO posteDAO;

	/**
	 * DAO injected by Spring that manages Salaire entities
	 * 
	 */
	@Autowired
	private SalaireDAO salaireDAO;

	/**
	 * Instantiates a new SalaireServiceImpl.
	 *
	 */
	public SalaireServiceImpl() {
	}

	/**
	 * Delete an existing Poste entity
	 * 
	 */
	@Transactional
	public Salaire deleteSalairePoste(Integer salaire_id, Integer salaire_collaborateurMatricule, Integer salaire_posteIdPoste, Integer related_poste_idPoste) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(salaire_id, salaire_collaborateurMatricule, salaire_posteIdPoste, -1, -1);
		Poste related_poste = posteDAO.findPosteByPrimaryKey(related_poste_idPoste, -1, -1);

		salaire.setPoste(null);
		related_poste.getSalaires().remove(salaire);
		salaire = salaireDAO.store(salaire);
		salaireDAO.flush();

		related_poste = posteDAO.store(related_poste);
		posteDAO.flush();

		posteDAO.remove(related_poste);
		posteDAO.flush();

		return salaire;
	}

	/**
	 */
	@Transactional
	public Salaire findSalaireByPrimaryKey(Integer id, Integer collaborateurMatricule, Integer posteIdPoste) {
		return salaireDAO.findSalaireByPrimaryKey(id, collaborateurMatricule, posteIdPoste);
	}

	/**
	 * Load an existing Salaire entity
	 * 
	 */
	@Transactional
	public Set<Salaire> loadSalaires() {
		return salaireDAO.findAllSalaires();
	}

	/**
	 * Return all Salaire entity
	 * 
	 */
	@Transactional
	public List<Salaire> findAllSalaires(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Salaire>(salaireDAO.findAllSalaires(startResult, maxRows));
	}

	/**
	 * Return a count of all Salaire entity
	 * 
	 */
	@Transactional
	public Integer countSalaires() {
		return ((Long) salaireDAO.createQuerySingleResult("select count(*) from Salaire o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Poste entity
	 * 
	 */
	@Transactional
	public Salaire saveSalairePoste(Integer id, Integer collaborateurMatricule, Integer posteIdPoste, Poste related_poste) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(id, collaborateurMatricule, posteIdPoste, -1, -1);
		Poste existingposte = posteDAO.findPosteByPrimaryKey(related_poste.getIdPoste());

		// copy into the existing record to preserve existing relationships
		if (existingposte != null) {
			existingposte.setIdPoste(related_poste.getIdPoste());
			existingposte.setPosteField(related_poste.getPosteField());
			related_poste = existingposte;
		}

		salaire.setPoste(related_poste);
		related_poste.getSalaires().add(salaire);
		salaire = salaireDAO.store(salaire);
		salaireDAO.flush();

		related_poste = posteDAO.store(related_poste);
		posteDAO.flush();

		return salaire;
	}

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@Transactional
	public Salaire deleteSalaireCollaborateur(Integer salaire_id, Integer salaire_collaborateurMatricule, Integer salaire_posteIdPoste, Integer related_collaborateur_matricule) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(salaire_id, salaire_collaborateurMatricule, salaire_posteIdPoste, -1, -1);
		Collaborateur related_collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(related_collaborateur_matricule, -1, -1);

		salaire.setCollaborateur(null);
		related_collaborateur.getSalaires().remove(salaire);
		salaire = salaireDAO.store(salaire);
		salaireDAO.flush();

		related_collaborateur = collaborateurDAO.store(related_collaborateur);
		collaborateurDAO.flush();

		collaborateurDAO.remove(related_collaborateur);
		collaborateurDAO.flush();

		return salaire;
	}

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	@Transactional
	public void saveSalaire(Salaire salaire) {
		Salaire existingSalaire = salaireDAO.findSalaireByPrimaryKey(salaire.getId(), salaire.getCollaborateurMatricule(), salaire.getPosteIdPoste());

		if (existingSalaire != null) {
			if (existingSalaire != salaire) {
				existingSalaire.setId(salaire.getId());
				existingSalaire.setCollaborateurMatricule(salaire.getCollaborateurMatricule());
				existingSalaire.setPosteIdPoste(salaire.getPosteIdPoste());
				existingSalaire.setSalaireField(salaire.getSalaireField());
				existingSalaire.setDateElevation(salaire.getDateElevation());
			}
			salaire = salaireDAO.store(existingSalaire);
		} else {
			salaire = salaireDAO.store(salaire);
		}
		salaireDAO.flush();
	}

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	@Transactional
	public void deleteSalaire(Salaire salaire) {
		salaireDAO.remove(salaire);
		salaireDAO.flush();
	}

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	@Transactional
	public Salaire saveSalaireCollaborateur(Integer id, Integer collaborateurMatricule, Integer posteIdPoste, Collaborateur related_collaborateur) {
		Salaire salaire = salaireDAO.findSalaireByPrimaryKey(id, collaborateurMatricule, posteIdPoste, -1, -1);
		Collaborateur existingcollaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(related_collaborateur.getMatricule());

		// copy into the existing record to preserve existing relationships
		if (existingcollaborateur != null) {
			existingcollaborateur.setMatricule(related_collaborateur.getMatricule());
			existingcollaborateur.setAncienManagerRh(related_collaborateur.getAncienManagerRh());
			existingcollaborateur.setActualManagerRh(related_collaborateur.getActualManagerRh());
			existingcollaborateur.setNom(related_collaborateur.getNom());
			existingcollaborateur.setPrenom(related_collaborateur.getPrenom());
			existingcollaborateur.setAbreviation(related_collaborateur.getAbreviation());
			existingcollaborateur.setSexe(related_collaborateur.getSexe());
			existingcollaborateur.setSite(related_collaborateur.getSite());
			existingcollaborateur.setDateEmbauche(related_collaborateur.getDateEmbauche());
			existingcollaborateur.setMoisBap(related_collaborateur.getMoisBap());
			existingcollaborateur.setDateDepart(related_collaborateur.getDateDepart());
			existingcollaborateur.setAncienCollaborateur(related_collaborateur.getAncienCollaborateur());
			existingcollaborateur.setSeminaireParticipation(related_collaborateur.getSeminaireParticipation());
			existingcollaborateur.setDateParticipation(related_collaborateur.getDateParticipation());
			existingcollaborateur.setEmail(related_collaborateur.getEmail());
			related_collaborateur = existingcollaborateur;
		}

		salaire.setCollaborateur(related_collaborateur);
		related_collaborateur.getSalaires().add(salaire);
		salaire = salaireDAO.store(salaire);
		salaireDAO.flush();

		related_collaborateur = collaborateurDAO.store(related_collaborateur);
		collaborateurDAO.flush();

		return salaire;
	}
}
