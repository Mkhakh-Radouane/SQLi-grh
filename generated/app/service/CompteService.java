package app.service;

import app.domain.Compte;
import app.domain.ManagerRhStatus;
import app.domain.Profile;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Compte entities
 * 
 */
public interface CompteService {

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	public void deleteCompte(Compte compte);

	/**
	 * Return all Compte entity
	 * 
	 */
	public List<Compte> findAllComptes(Integer startResult, Integer maxRows);

	/**
	 */
	public Compte findCompteByPrimaryKey(Integer id);

	/**
	 * Load an existing Compte entity
	 * 
	 */
	public Set<Compte> loadComptes();

	/**
	 * Save an existing Profile entity
	 * 
	 */
	public Compte saveCompteProfile(Integer id_1, Profile related_profile);

	/**
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	public Compte saveCompteManagerRhStatuses(Integer id_2, ManagerRhStatus related_managerrhstatuses);

	/**
	 * Save an existing Compte entity
	 * 
	 */
	public void saveCompte(Compte compte_1);

	/**
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	public Compte deleteCompteManagerRhStatuses(Integer compte_id, Integer related_managerrhstatuses_id);

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	public Compte deleteCompteProfile(Integer compte_id_1, Integer related_profile_id);

	/**
	 * Return a count of all Compte entity
	 * 
	 */
	public Integer countComptes();
}