package app.service;

import app.domain.Bu;
import app.domain.Collaborateur;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Bu entities
 * 
 */
public interface BuService {

	/**
	 * Load an existing Bu entity
	 * 
	 */
	public Set<Bu> loadBus();

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	public Bu saveBuCollaborateurs(Integer id, Collaborateur related_collaborateurs);

	/**
	 */
	public Bu findBuByPrimaryKey(Integer id_1);

	/**
	 * Return a count of all Bu entity
	 * 
	 */
	public Integer countBus();

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	public Bu deleteBuCollaborateurs(Integer bu_id, Integer related_collaborateurs_matricule);

	/**
	 * Delete an existing Bu entity
	 * 
	 */
	public void deleteBu(Bu bu);

	/**
	 * Save an existing Bu entity
	 * 
	 */
	public void saveBu(Bu bu_1);

	/**
	 * Return all Bu entity
	 * 
	 */
	public List<Bu> findAllBus(Integer startResult, Integer maxRows);
}