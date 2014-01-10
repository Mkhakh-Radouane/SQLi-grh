package app.service;

import app.domain.Diplome;
import app.domain.Ecole;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Ecole entities
 * 
 */
public interface EcoleService {

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	public Ecole deleteEcoleDiplomes(Integer ecole_id, Integer related_diplomes_id);

	/**
	 * Save an existing Ecole entity
	 * 
	 */
	public void saveEcole(Ecole ecole);

	/**
	 * Return a count of all Ecole entity
	 * 
	 */
	public Integer countEcoles();

	/**
	 * Load an existing Ecole entity
	 * 
	 */
	public Set<Ecole> loadEcoles();

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	public Ecole saveEcoleDiplomes(Integer id, Diplome related_diplomes);

	/**
	 */
	public Ecole findEcoleByPrimaryKey(Integer id_1);

	/**
	 * Return all Ecole entity
	 * 
	 */
	public List<Ecole> findAllEcoles(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Ecole entity
	 * 
	 */
	public void deleteEcole(Ecole ecole_1);
}