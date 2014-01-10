package app.service;

import app.domain.Diplome;
import app.domain.Ecole;
import app.domain.Niveau;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Diplome entities
 * 
 */
public interface DiplomeService {

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	public void saveDiplome(Diplome diplome);

	/**
	 * Delete an existing Niveau entity
	 * 
	 */
	public Diplome deleteDiplomeNiveau(Integer diplome_id, Integer related_niveau_id);

	/**
	 * Return a count of all Diplome entity
	 * 
	 */
	public Integer countDiplomes();

	/**
	 * Delete an existing Ecole entity
	 * 
	 */
	public Diplome deleteDiplomeEcole(Integer diplome_id_1, Integer related_ecole_id);

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	public void deleteDiplome(Diplome diplome_1);

	/**
	 * Return all Diplome entity
	 * 
	 */
	public List<Diplome> findAllDiplomes(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Niveau entity
	 * 
	 */
	public Diplome saveDiplomeNiveau(Integer id, Niveau related_niveau);

	/**
	 * Save an existing Ecole entity
	 * 
	 */
	public Diplome saveDiplomeEcole(Integer id_1, Ecole related_ecole);

	/**
	 */
	public Diplome findDiplomeByPrimaryKey(Integer id_2);

	/**
	 * Load an existing Diplome entity
	 * 
	 */
	public Set<Diplome> loadDiplomes();
}