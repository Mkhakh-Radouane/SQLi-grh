package app.service;

import app.domain.Compte;
import app.domain.ManagerRhStatus;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for ManagerRhStatus entities
 * 
 */
public interface ManagerRhStatusService {

	/**
	 * Load an existing ManagerRhStatus entity
	 * 
	 */
	public Set<ManagerRhStatus> loadManagerRhStatuss();

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	public ManagerRhStatus deleteManagerRhStatusCompte(Integer managerrhstatus_id, Integer related_compte_id);

	/**
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	public void deleteManagerRhStatus(ManagerRhStatus managerrhstatus);

	/**
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	public void saveManagerRhStatus(ManagerRhStatus managerrhstatus_1);

	/**
	 * Save an existing Compte entity
	 * 
	 */
	public ManagerRhStatus saveManagerRhStatusCompte(Integer id, Compte related_compte);

	/**
	 * Return a count of all ManagerRhStatus entity
	 * 
	 */
	public Integer countManagerRhStatuss();

	/**
	 */
	public ManagerRhStatus findManagerRhStatusByPrimaryKey(Integer id_1);

	/**
	 * Return all ManagerRhStatus entity
	 * 
	 */
	public List<ManagerRhStatus> findAllManagerRhStatuss(Integer startResult, Integer maxRows);
}