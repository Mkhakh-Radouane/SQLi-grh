package app.service;

import app.dao.TechnologieDAO;
import app.dao.TechnologiesMaitriseesDAO;

import app.domain.Technologie;
import app.domain.TechnologiesMaitrisees;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for TechnologiesMaitrisees entities
 * 
 */

@Service("TechnologiesMaitriseesService")
@Transactional
public class TechnologiesMaitriseesServiceImpl implements
		TechnologiesMaitriseesService {

	/**
	 * DAO injected by Spring that manages Technologie entities
	 * 
	 */
	@Autowired
	private TechnologieDAO technologieDAO;

	/**
	 * DAO injected by Spring that manages TechnologiesMaitrisees entities
	 * 
	 */
	@Autowired
	private TechnologiesMaitriseesDAO technologiesMaitriseesDAO;

	/**
	 * Instantiates a new TechnologiesMaitriseesServiceImpl.
	 *
	 */
	public TechnologiesMaitriseesServiceImpl() {
	}

	/**
	 * Return all TechnologiesMaitrisees entity
	 * 
	 */
	@Transactional
	public List<TechnologiesMaitrisees> findAllTechnologiesMaitriseess(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<TechnologiesMaitrisees>(technologiesMaitriseesDAO.findAllTechnologiesMaitriseess(startResult, maxRows));
	}

	/**
	 * Load an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Transactional
	public Set<TechnologiesMaitrisees> loadTechnologiesMaitriseess() {
		return technologiesMaitriseesDAO.findAllTechnologiesMaitriseess();
	}

	/**
	 * Return a count of all TechnologiesMaitrisees entity
	 * 
	 */
	@Transactional
	public Integer countTechnologiesMaitriseess() {
		return ((Long) technologiesMaitriseesDAO.createQuerySingleResult("select count(*) from TechnologiesMaitrisees o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Technologie entity
	 * 
	 */
	@Transactional
	public TechnologiesMaitrisees saveTechnologiesMaitriseesTechnologie(Integer technologieField, Integer collaborateur, Technologie related_technologie) {
		TechnologiesMaitrisees technologiesmaitrisees = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologieField, collaborateur, -1, -1);
		Technologie existingtechnologie = technologieDAO.findTechnologieByPrimaryKey(related_technologie.getId());

		// copy into the existing record to preserve existing relationships
		if (existingtechnologie != null) {
			existingtechnologie.setId(related_technologie.getId());
			existingtechnologie.setTechnologieField(related_technologie.getTechnologieField());
			related_technologie = existingtechnologie;
		}

		technologiesmaitrisees.setTechnologie(related_technologie);
		related_technologie.getTechnologiesMaitriseeses().add(technologiesmaitrisees);
		technologiesmaitrisees = technologiesMaitriseesDAO.store(technologiesmaitrisees);
		technologiesMaitriseesDAO.flush();

		related_technologie = technologieDAO.store(related_technologie);
		technologieDAO.flush();

		return technologiesmaitrisees;
	}

	/**
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Transactional
	public void saveTechnologiesMaitrisees(TechnologiesMaitrisees technologiesmaitrisees) {
		TechnologiesMaitrisees existingTechnologiesMaitrisees = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologiesmaitrisees.getTechnologieField(), technologiesmaitrisees.getCollaborateur());

		if (existingTechnologiesMaitrisees != null) {
			if (existingTechnologiesMaitrisees != technologiesmaitrisees) {
				existingTechnologiesMaitrisees.setTechnologieField(technologiesmaitrisees.getTechnologieField());
				existingTechnologiesMaitrisees.setCollaborateur(technologiesmaitrisees.getCollaborateur());
				existingTechnologiesMaitrisees.setNiveauExpertise(technologiesmaitrisees.getNiveauExpertise());
			}
			technologiesmaitrisees = technologiesMaitriseesDAO.store(existingTechnologiesMaitrisees);
		} else {
			technologiesmaitrisees = technologiesMaitriseesDAO.store(technologiesmaitrisees);
		}
		technologiesMaitriseesDAO.flush();
	}

	/**
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Transactional
	public void deleteTechnologiesMaitrisees(TechnologiesMaitrisees technologiesmaitrisees) {
		technologiesMaitriseesDAO.remove(technologiesmaitrisees);
		technologiesMaitriseesDAO.flush();
	}

	/**
	 */
	@Transactional
	public TechnologiesMaitrisees findTechnologiesMaitriseesByPrimaryKey(Integer technologieField, Integer collaborateur) {
		return technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologieField, collaborateur);
	}

	/**
	 * Delete an existing Technologie entity
	 * 
	 */
	@Transactional
	public TechnologiesMaitrisees deleteTechnologiesMaitriseesTechnologie(Integer technologiesmaitrisees_technologieField, Integer technologiesmaitrisees_collaborateur, Integer related_technologie_id) {
		TechnologiesMaitrisees technologiesmaitrisees = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(technologiesmaitrisees_technologieField, technologiesmaitrisees_collaborateur, -1, -1);
		Technologie related_technologie = technologieDAO.findTechnologieByPrimaryKey(related_technologie_id, -1, -1);

		technologiesmaitrisees.setTechnologie(null);
		related_technologie.getTechnologiesMaitriseeses().remove(technologiesmaitrisees);
		technologiesmaitrisees = technologiesMaitriseesDAO.store(technologiesmaitrisees);
		technologiesMaitriseesDAO.flush();

		related_technologie = technologieDAO.store(related_technologie);
		technologieDAO.flush();

		technologieDAO.remove(related_technologie);
		technologieDAO.flush();

		return technologiesmaitrisees;
	}
}
