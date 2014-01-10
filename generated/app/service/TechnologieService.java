package app.service;

import app.domain.Technologie;
import app.domain.TechnologiesMaitrisees;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Technologie entities
 * 
 */
public interface TechnologieService {

	/**
	 * Load an existing Technologie entity
	 * 
	 */
	public Set<Technologie> loadTechnologies();

	/**
	 */
	public Technologie findTechnologieByPrimaryKey(Integer id);

	/**
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	public Technologie saveTechnologieTechnologiesMaitriseeses(Integer id_1, TechnologiesMaitrisees related_technologiesmaitriseeses);

	/**
	 * Save an existing Technologie entity
	 * 
	 */
	public void saveTechnologie(Technologie technologie);

	/**
	 * Return all Technologie entity
	 * 
	 */
	public List<Technologie> findAllTechnologies(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Technologie entity
	 * 
	 */
	public Integer countTechnologies();

	/**
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	public Technologie deleteTechnologieTechnologiesMaitriseeses(Integer technologie_id, Integer related_technologiesmaitriseeses_technologieField, Integer related_technologiesmaitriseeses_collaborateur);

	/**
	 * Delete an existing Technologie entity
	 * 
	 */
	public void deleteTechnologie(Technologie technologie_1);
}