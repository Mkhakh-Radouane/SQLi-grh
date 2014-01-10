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
 * Spring service that handles CRUD requests for Technologie entities
 * 
 */

@Service("TechnologieService")
@Transactional
public class TechnologieServiceImpl implements TechnologieService {

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
	 * Instantiates a new TechnologieServiceImpl.
	 *
	 */
	public TechnologieServiceImpl() {
	}

	/**
	 * Load an existing Technologie entity
	 * 
	 */
	@Transactional
	public Set<Technologie> loadTechnologies() {
		return technologieDAO.findAllTechnologies();
	}

	/**
	 */
	@Transactional
	public Technologie findTechnologieByPrimaryKey(Integer id) {
		return technologieDAO.findTechnologieByPrimaryKey(id);
	}

	/**
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Transactional
	public Technologie saveTechnologieTechnologiesMaitriseeses(Integer id, TechnologiesMaitrisees related_technologiesmaitriseeses) {
		Technologie technologie = technologieDAO.findTechnologieByPrimaryKey(id, -1, -1);
		TechnologiesMaitrisees existingtechnologiesMaitriseeses = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(related_technologiesmaitriseeses.getTechnologieField(), related_technologiesmaitriseeses.getCollaborateur());

		// copy into the existing record to preserve existing relationships
		if (existingtechnologiesMaitriseeses != null) {
			existingtechnologiesMaitriseeses.setTechnologieField(related_technologiesmaitriseeses.getTechnologieField());
			existingtechnologiesMaitriseeses.setCollaborateur(related_technologiesmaitriseeses.getCollaborateur());
			existingtechnologiesMaitriseeses.setNiveauExpertise(related_technologiesmaitriseeses.getNiveauExpertise());
			related_technologiesmaitriseeses = existingtechnologiesMaitriseeses;
		}

		related_technologiesmaitriseeses.setTechnologie(technologie);
		technologie.getTechnologiesMaitriseeses().add(related_technologiesmaitriseeses);
		related_technologiesmaitriseeses = technologiesMaitriseesDAO.store(related_technologiesmaitriseeses);
		technologiesMaitriseesDAO.flush();

		technologie = technologieDAO.store(technologie);
		technologieDAO.flush();

		return technologie;
	}

	/**
	 * Save an existing Technologie entity
	 * 
	 */
	@Transactional
	public void saveTechnologie(Technologie technologie) {
		Technologie existingTechnologie = technologieDAO.findTechnologieByPrimaryKey(technologie.getId());

		if (existingTechnologie != null) {
			if (existingTechnologie != technologie) {
				existingTechnologie.setId(technologie.getId());
				existingTechnologie.setTechnologieField(technologie.getTechnologieField());
			}
			technologie = technologieDAO.store(existingTechnologie);
		} else {
			technologie = technologieDAO.store(technologie);
		}
		technologieDAO.flush();
	}

	/**
	 * Return all Technologie entity
	 * 
	 */
	@Transactional
	public List<Technologie> findAllTechnologies(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Technologie>(technologieDAO.findAllTechnologies(startResult, maxRows));
	}

	/**
	 * Return a count of all Technologie entity
	 * 
	 */
	@Transactional
	public Integer countTechnologies() {
		return ((Long) technologieDAO.createQuerySingleResult("select count(o) from Technologie o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	@Transactional
	public Technologie deleteTechnologieTechnologiesMaitriseeses(Integer technologie_id, Integer related_technologiesmaitriseeses_technologieField, Integer related_technologiesmaitriseeses_collaborateur) {
		TechnologiesMaitrisees related_technologiesmaitriseeses = technologiesMaitriseesDAO.findTechnologiesMaitriseesByPrimaryKey(related_technologiesmaitriseeses_technologieField, related_technologiesmaitriseeses_collaborateur, -1, -1);

		Technologie technologie = technologieDAO.findTechnologieByPrimaryKey(technologie_id, -1, -1);

		related_technologiesmaitriseeses.setTechnologie(null);
		technologie.getTechnologiesMaitriseeses().remove(related_technologiesmaitriseeses);

		technologiesMaitriseesDAO.remove(related_technologiesmaitriseeses);
		technologiesMaitriseesDAO.flush();

		return technologie;
	}

	/**
	 * Delete an existing Technologie entity
	 * 
	 */
	@Transactional
	public void deleteTechnologie(Technologie technologie) {
		technologieDAO.remove(technologie);
		technologieDAO.flush();
	}
}
