package app.service;

import app.domain.Droit;
import app.domain.Profile;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Droit entities
 * 
 */
public interface DroitService {

	/**
	 * Delete an existing Droit entity
	 * 
	 */
	public void deleteDroit(Droit droit);

	/**
	 * Return a count of all Droit entity
	 * 
	 */
	public Integer countDroits();

	/**
	 */
	public Droit findDroitByPrimaryKey(Integer id);

	/**
	 * Load an existing Droit entity
	 * 
	 */
	public Set<Droit> loadDroits();

	/**
	 * Return all Droit entity
	 * 
	 */
	public List<Droit> findAllDroits(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Profile entity
	 * 
	 */
	public Droit saveDroitProfiles(Integer id_1, Profile related_profiles);

	/**
	 * Save an existing Droit entity
	 * 
	 */
	public void saveDroit(Droit droit_1);

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	public Droit deleteDroitProfiles(Integer droit_id, Integer related_profiles_id);
}