package app.service;

import app.domain.Technologie;
import app.domain.TechnologiesMaitrisees;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for TechnologiesMaitrisees entities
 * 
 */
public interface TechnologiesMaitriseesService {

	/**
	 * Return all TechnologiesMaitrisees entity
	 * 
	 */
	public List<TechnologiesMaitrisees> findAllTechnologiesMaitriseess(Integer startResult, Integer maxRows);

	/**
	 * Load an existing TechnologiesMaitrisees entity
	 * 
	 */
	public Set<TechnologiesMaitrisees> loadTechnologiesMaitriseess();

	/**
	 * Return a count of all TechnologiesMaitrisees entity
	 * 
	 */
	public Integer countTechnologiesMaitriseess();

	/**
	 * Save an existing Technologie entity
	 * 
	 */
	public TechnologiesMaitrisees saveTechnologiesMaitriseesTechnologie(Integer technologieField, Integer collaborateur, Technologie related_technologie);

	/**
	 * Save an existing TechnologiesMaitrisees entity
	 * 
	 */
	public void saveTechnologiesMaitrisees(TechnologiesMaitrisees technologiesmaitrisees);

	/**
	 * Delete an existing TechnologiesMaitrisees entity
	 * 
	 */
	public void deleteTechnologiesMaitrisees(TechnologiesMaitrisees technologiesmaitrisees_1);

	/**
	 */
	public TechnologiesMaitrisees findTechnologiesMaitriseesByPrimaryKey(Integer technologieField_1, Integer collaborateur_1);

	/**
	 * Delete an existing Technologie entity
	 * 
	 */
	public TechnologiesMaitrisees deleteTechnologiesMaitriseesTechnologie(Integer technologiesmaitrisees_technologieField, Integer technologiesmaitrisees_collaborateur, Integer related_technologie_id);
}