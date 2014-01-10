package app.service;

import app.domain.Diplome;
import app.domain.Niveau;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Niveau entities
 * 
 */
public interface NiveauService {

	/**
	 */
	public Niveau findNiveauByPrimaryKey(Integer id);

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	public Niveau saveNiveauDiplomes(Integer id_1, Diplome related_diplomes);

	/**
	 * Save an existing Niveau entity
	 * 
	 */
	public void saveNiveau(Niveau niveau);

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	public Niveau deleteNiveauDiplomes(Integer niveau_id, Integer related_diplomes_id);

	/**
	 * Load an existing Niveau entity
	 * 
	 */
	public Set<Niveau> loadNiveaus();

	/**
	 * Delete an existing Niveau entity
	 * 
	 */
	public void deleteNiveau(Niveau niveau_1);

	/**
	 * Return a count of all Niveau entity
	 * 
	 */
	public Integer countNiveaus();

	/**
	 * Return all Niveau entity
	 * 
	 */
	public List<Niveau> findAllNiveaus(Integer startResult, Integer maxRows);
}