package app.service;

import app.dao.BuDAO;
import app.dao.CollaborateurDAO;
import app.dao.SalaireDAO;

import app.domain.Bu;
import app.domain.Collaborateur;
import app.domain.Salaire;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Collaborateur entities
 * 
 */

@Service("CollaborateurService")
@Transactional
public class CollaborateurServiceImpl implements CollaborateurService {

	/**
	 * DAO injected by Spring that manages Bu entities
	 * 
	 */
	@Autowired
	private BuDAO buDAO;

	/**
	 * DAO injected by Spring that manages Collaborateur entities
	 * 
	 */
	@Autowired
	private CollaborateurDAO collaborateurDAO;

	/**
	 * DAO injected by Spring that manages Salaire entities
	 * 
	 */
	@Autowired
	private SalaireDAO salaireDAO;

	/**
	 * Instantiates a new CollaborateurServiceImpl.
	 *
	 */
	public CollaborateurServiceImpl() {
	}

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	@Transactional
	public void saveCollaborateur(Collaborateur collaborateur) {
		Collaborateur existingCollaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(collaborateur.getMatricule());

		if (existingCollaborateur != null) {
			if (existingCollaborateur != collaborateur) {
				existingCollaborateur.setMatricule(collaborateur.getMatricule());
				existingCollaborateur.setAncienManagerRh(collaborateur.getAncienManagerRh());
				existingCollaborateur.setActualManagerRh(collaborateur.getActualManagerRh());
				existingCollaborateur.setNom(collaborateur.getNom());
				existingCollaborateur.setPrenom(collaborateur.getPrenom());
				existingCollaborateur.setAbreviation(collaborateur.getAbreviation());
				existingCollaborateur.setSexe(collaborateur.getSexe());
				existingCollaborateur.setSite(collaborateur.getSite());
				existingCollaborateur.setDateEmbauche(collaborateur.getDateEmbauche());
				existingCollaborateur.setMoisBap(collaborateur.getMoisBap());
				existingCollaborateur.setDateDepart(collaborateur.getDateDepart());
				existingCollaborateur.setAncienCollaborateur(collaborateur.getAncienCollaborateur());
				existingCollaborateur.setSeminaireParticipation(collaborateur.getSeminaireParticipation());
				existingCollaborateur.setDateParticipation(collaborateur.getDateParticipation());
				existingCollaborateur.setEmail(collaborateur.getEmail());
			}
			collaborateur = collaborateurDAO.store(existingCollaborateur);
		} else {
			collaborateur = collaborateurDAO.store(collaborateur);
		}
		collaborateurDAO.flush();
	}

	/**
	 * Return a count of all Collaborateur entity
	 * 
	 */
	@Transactional
	public Integer countCollaborateurs() {
		return ((Long) collaborateurDAO.createQuerySingleResult("select count(o) from Collaborateur o").getSingleResult()).intValue();
	}

	/**
	 * Return all Collaborateur entity
	 * 
	 */
	@Transactional
	public List<Collaborateur> findAllCollaborateurs(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Collaborateur>(collaborateurDAO.findAllCollaborateurs(startResult, maxRows));
	}

	/**
	 * Save an existing Bu entity
	 * 
	 */
	@Transactional
	public Collaborateur saveCollaborateurBu(Integer matricule, Bu related_bu) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(matricule, -1, -1);
		Bu existingbu = buDAO.findBuByPrimaryKey(related_bu.getId());

		// copy into the existing record to preserve existing relationships
		if (existingbu != null) {
			existingbu.setId(related_bu.getId());
			existingbu.setBuField(related_bu.getBuField());
			related_bu = existingbu;
		} else {
			related_bu = buDAO.store(related_bu);
			buDAO.flush();
		}

		collaborateur.setBu(related_bu);
		related_bu.getCollaborateurs().add(collaborateur);
		collaborateur = collaborateurDAO.store(collaborateur);
		collaborateurDAO.flush();

		related_bu = buDAO.store(related_bu);
		buDAO.flush();

		return collaborateur;
	}

	/**
	 */
	@Transactional
	public Collaborateur findCollaborateurByPrimaryKey(Integer matricule) {
		return collaborateurDAO.findCollaborateurByPrimaryKey(matricule);
	}

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	@Transactional
	public Collaborateur saveCollaborateurSalaires(Integer matricule, Salaire related_salaires) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(matricule, -1, -1);
		Salaire existingsalaires = salaireDAO.findSalaireByPrimaryKey(related_salaires.getId(), related_salaires.getCollaborateurMatricule(), related_salaires.getPosteIdPoste());

		// copy into the existing record to preserve existing relationships
		if (existingsalaires != null) {
			existingsalaires.setId(related_salaires.getId());
			existingsalaires.setCollaborateurMatricule(related_salaires.getCollaborateurMatricule());
			existingsalaires.setPosteIdPoste(related_salaires.getPosteIdPoste());
			existingsalaires.setSalaireField(related_salaires.getSalaireField());
			existingsalaires.setDateElevation(related_salaires.getDateElevation());
			related_salaires = existingsalaires;
		}

		related_salaires.setCollaborateur(collaborateur);
		collaborateur.getSalaires().add(related_salaires);
		related_salaires = salaireDAO.store(related_salaires);
		salaireDAO.flush();

		collaborateur = collaborateurDAO.store(collaborateur);
		collaborateurDAO.flush();

		return collaborateur;
	}

	/**
	 * Load an existing Collaborateur entity
	 * 
	 */
	@Transactional
	public Set<Collaborateur> loadCollaborateurs() {
		return collaborateurDAO.findAllCollaborateurs();
	}

	/**
	 * Delete an existing Bu entity
	 * 
	 */
	@Transactional
	public Collaborateur deleteCollaborateurBu(Integer collaborateur_matricule, Integer related_bu_id) {
		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(collaborateur_matricule, -1, -1);
		Bu related_bu = buDAO.findBuByPrimaryKey(related_bu_id, -1, -1);

		collaborateur.setBu(null);
		related_bu.getCollaborateurs().remove(collaborateur);
		collaborateur = collaborateurDAO.store(collaborateur);
		collaborateurDAO.flush();

		related_bu = buDAO.store(related_bu);
		buDAO.flush();

		buDAO.remove(related_bu);
		buDAO.flush();

		return collaborateur;
	}

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@Transactional
	public void deleteCollaborateur(Collaborateur collaborateur) {
		collaborateurDAO.remove(collaborateur);
		collaborateurDAO.flush();
	}

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	@Transactional
	public Collaborateur deleteCollaborateurSalaires(Integer collaborateur_matricule, Integer related_salaires_id, Integer related_salaires_collaborateurMatricule, Integer related_salaires_posteIdPoste) {
		Salaire related_salaires = salaireDAO.findSalaireByPrimaryKey(related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste, -1, -1);

		Collaborateur collaborateur = collaborateurDAO.findCollaborateurByPrimaryKey(collaborateur_matricule, -1, -1);

		related_salaires.setCollaborateur(null);
		collaborateur.getSalaires().remove(related_salaires);

		salaireDAO.remove(related_salaires);
		salaireDAO.flush();

		return collaborateur;
	}

	@Override
	public Set<Collaborateur> loadManagerRH() {
		
		return collaborateurDAO.findAllManagersRH();
		}
}
