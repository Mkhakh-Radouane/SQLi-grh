package app.service;

import app.domain.Compte;
import app.domain.Droit;
import app.domain.Profile;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Profile entities
 * 
 */
public interface ProfileService {

	/**
	 * Save an existing Compte entity
	 * 
	 */
	public Profile saveProfileComptes(Integer id, Compte related_comptes);

	/**
	 * Save an existing Profile entity
	 * 
	 */
	public void saveProfile(Profile profile);

	/**
	 * Save an existing Droit entity
	 * 
	 */
	public Profile saveProfileDroits(Integer id_1, Droit related_droits);

	/**
	 * Return a count of all Profile entity
	 * 
	 */
	public Integer countProfiles();

	/**
	 */
	public Profile findProfileByPrimaryKey(Integer id_2);

	/**
	 * Delete an existing Droit entity
	 * 
	 */
	public Profile deleteProfileDroits(Integer profile_id, Integer related_droits_id);

	/**
	 * Load an existing Profile entity
	 * 
	 */
	public Set<Profile> loadProfiles();

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	public void deleteProfile(Profile profile_1);

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	public Profile deleteProfileComptes(Integer profile_id_1, Integer related_comptes_id);

	/**
	 * Return all Profile entity
	 * 
	 */
	public List<Profile> findAllProfiles(Integer startResult, Integer maxRows);
}