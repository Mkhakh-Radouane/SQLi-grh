package app.service;

import app.dao.BuDAO;
import app.dao.CollaborateurDAO;

import app.domain.Bu;
import app.domain.Collaborateur;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Bu entities
 * 
 */

@Service("BuService")
@Transactional
public class BuServiceImpl implements BuService {

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
	 * Instantiates a new BuServiceImpl.
	 *
	 */
	public BuServiceImpl() {
	}

	/**
	 * Load an existing Bu entity
	 * 
	 */
	@Transactional
	public Set<Bu> loadBus() {
		return buDAO.findAllBus();
	}

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	@Transactional
	public Bu saveBuCollaborateurs(Integer id, Collaborateur related_collaborateurs) {
		Bu bu = buDAO.findBuByPrimaryKey(id, -1, -1);
		Collaborateur existingcollaborateurs = collaborateurDAO.findCollaborateurByPrimaryKey(related_collaborateurs.getMatricule());

		// copy into the existing record to preserve existing relationships
		if (existingcollaborateurs != null) {
			existingcollaborateurs.setMatricule(related_collaborateurs.getMatricule());
			existingcollaborateurs.setAncienManagerRh(related_collaborateurs.getAncienManagerRh());
			existingcollaborateurs.setActualManagerRh(related_collaborateurs.getActualManagerRh());
			existingcollaborateurs.setNom(related_collaborateurs.getNom());
			existingcollaborateurs.setPrenom(related_collaborateurs.getPrenom());
			existingcollaborateurs.setAbreviation(related_collaborateurs.getAbreviation());
			existingcollaborateurs.setSexe(related_collaborateurs.getSexe());
			existingcollaborateurs.setSite(related_collaborateurs.getSite());
			existingcollaborateurs.setDateEmbauche(related_collaborateurs.getDateEmbauche());
			existingcollaborateurs.setMoisBap(related_collaborateurs.getMoisBap());
			existingcollaborateurs.setDateDepart(related_collaborateurs.getDateDepart());
			existingcollaborateurs.setAncienCollaborateur(related_collaborateurs.getAncienCollaborateur());
			existingcollaborateurs.setSeminaireParticipation(related_collaborateurs.getSeminaireParticipation());
			existingcollaborateurs.setDateParticipation(related_collaborateurs.getDateParticipation());
			existingcollaborateurs.setEmail(related_collaborateurs.getEmail());
			related_collaborateurs = existingcollaborateurs;
		} else {
			related_collaborateurs = collaborateurDAO.store(related_collaborateurs);
			collaborateurDAO.flush();
		}

		related_collaborateurs.setBu(bu);
		bu.getCollaborateurs().add(related_collaborateurs);
		related_collaborateurs = collaborateurDAO.store(related_collaborateurs);
		collaborateurDAO.flush();

		bu = buDAO.store(bu);
		buDAO.flush();

		return bu;
	}

	/**
	 */
	@Transactional
	public Bu findBuByPrimaryKey(Integer id) {
		return buDAO.findBuByPrimaryKey(id);
	}

	/**
	 * Return a count of all Bu entity
	 * 
	 */
	@Transactional
	public Integer countBus() {
		return ((Long) buDAO.createQuerySingleResult("select count(o) from Bu o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	@Transactional
	public Bu deleteBuCollaborateurs(Integer bu_id, Integer related_collaborateurs_matricule) {
		Collaborateur related_collaborateurs = collaborateurDAO.findCollaborateurByPrimaryKey(related_collaborateurs_matricule, -1, -1);

		Bu bu = buDAO.findBuByPrimaryKey(bu_id, -1, -1);

		related_collaborateurs.setBu(null);
		bu.getCollaborateurs().remove(related_collaborateurs);

		collaborateurDAO.remove(related_collaborateurs);
		collaborateurDAO.flush();

		return bu;
	}

	/**
	 * Delete an existing Bu entity
	 * 
	 */
	@Transactional
	public void deleteBu(Bu bu) {
		buDAO.remove(bu);
		buDAO.flush();
	}

	/**
	 * Save an existing Bu entity
	 * 
	 */
	@Transactional
	public void saveBu(Bu bu) {
	
			bu = buDAO.store(bu);
		
		buDAO.flush();
	}

	/**
	 * Return all Bu entity
	 * 
	 */
	@Transactional
	public List<Bu> findAllBus(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Bu>(buDAO.findAllBus(startResult, maxRows));
	}
}
