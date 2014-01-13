package app.service;

import app.dao.CompteDAO;
import app.dao.ManagerRhStatusDAO;
import app.dao.ProfileDAO;

import app.domain.Compte;
import app.domain.ManagerRhStatus;
import app.domain.Profile;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Compte entities
 * 
 */

@Service("CompteService")
@Transactional
public class CompteServiceImpl implements CompteService {

	/**
	 * DAO injected by Spring that manages Compte entities
	 * 
	 */
	@Autowired
	private CompteDAO compteDAO;

	/**
	 * DAO injected by Spring that manages ManagerRhStatus entities
	 * 
	 */
	@Autowired
	private ManagerRhStatusDAO managerRhStatusDAO;

	/**
	 * DAO injected by Spring that manages Profile entities
	 * 
	 */
	@Autowired
	private ProfileDAO profileDAO;

	/**
	 * Instantiates a new CompteServiceImpl.
	 *
	 */
	public CompteServiceImpl() {
	}

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	@Transactional
	public void deleteCompte(Compte compte) {
		compteDAO.remove(compte);
		compteDAO.flush();
	}

	/**
	 * Return all Compte entity
	 * 
	 */
	@Transactional
	public List<Compte> findAllComptes(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Compte>(compteDAO.findAllComptes(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Compte findCompteByPrimaryKey(Integer id) {
		return compteDAO.findCompteByPrimaryKey(id);
	}

	/**
	 * Load an existing Compte entity
	 * 
	 */
	@Transactional
	public Set<Compte> loadComptes() {
		return compteDAO.findAllComptes();
	}

	/**
	 * Save an existing Profile entity
	 * 
	 */
	@Transactional
	public Compte saveCompteProfile(Integer id, Profile related_profile) {
		Compte compte = compteDAO.findCompteByPrimaryKey(id, -1, -1);
		Profile existingprofile = profileDAO.findProfileByPrimaryKey(related_profile.getId());

		// copy into the existing record to preserve existing relationships
		if (existingprofile != null) {
			existingprofile.setId(related_profile.getId());
			existingprofile.setProfileField(related_profile.getProfileField());
			related_profile = existingprofile;
		}

		compte.setProfile(related_profile);
		related_profile.getComptes().add(compte);
		compte = compteDAO.store(compte);
		compteDAO.flush();

		related_profile = profileDAO.store(related_profile);
		profileDAO.flush();

		return compte;
	}

	/**
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	@Transactional
	public Compte saveCompteManagerRhStatuses(Integer id, ManagerRhStatus related_managerrhstatuses) {
		Compte compte = compteDAO.findCompteByPrimaryKey(id, -1, -1);
		ManagerRhStatus existingmanagerRhStatuses = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(related_managerrhstatuses.getId());

		// copy into the existing record to preserve existing relationships
		if (existingmanagerRhStatuses != null) {
			existingmanagerRhStatuses.setId(related_managerrhstatuses.getId());
			existingmanagerRhStatuses.setCollaborateur(related_managerrhstatuses.getCollaborateur());
			existingmanagerRhStatuses.setActivation(related_managerrhstatuses.getActivation());
			related_managerrhstatuses = existingmanagerRhStatuses;
		}

		
		
		related_managerrhstatuses = managerRhStatusDAO.store(related_managerrhstatuses);
		managerRhStatusDAO.flush();

		compte = compteDAO.store(compte);
		compteDAO.flush();

		return compte;
	}

	/**
	 * Save an existing Compte entity
	 * 
	 */
	@Transactional
	public void saveCompte(Compte compte) {
		Compte existingCompte = compteDAO.findCompteByPrimaryKey(compte.getId());

		if (existingCompte != null) {
			if (existingCompte != compte) {
				existingCompte.setId(compte.getId());
				existingCompte.setLogin(compte.getLogin());
				existingCompte.setPassword(compte.getPassword());
				existingCompte.setEmail(compte.getEmail());
				existingCompte.setActivation(compte.getActivation());
			}
			compte = compteDAO.store(existingCompte);
		} else {
			compte = compteDAO.store(compte);
		}
		compteDAO.flush();
	}

	/**
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	@Transactional
	public Compte deleteCompteManagerRhStatuses(Integer compte_id, Integer related_managerrhstatuses_id) {
		ManagerRhStatus related_managerrhstatuses = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(related_managerrhstatuses_id, -1, -1);

		Compte compte = compteDAO.findCompteByPrimaryKey(compte_id, -1, -1);

		
	

		managerRhStatusDAO.remove(related_managerrhstatuses);
		managerRhStatusDAO.flush();

		return compte;
	}

	/**
	 * Delete an existing Profile entity
	 * 
	 */
	@Transactional
	public Compte deleteCompteProfile(Integer compte_id, Integer related_profile_id) {
		Compte compte = compteDAO.findCompteByPrimaryKey(compte_id, -1, -1);
		Profile related_profile = profileDAO.findProfileByPrimaryKey(related_profile_id, -1, -1);

		compte.setProfile(null);
		related_profile.getComptes().remove(compte);
		compte = compteDAO.store(compte);
		compteDAO.flush();

		related_profile = profileDAO.store(related_profile);
		profileDAO.flush();

		profileDAO.remove(related_profile);
		profileDAO.flush();

		return compte;
	}

	/**
	 * Return a count of all Compte entity
	 * 
	 */
	@Transactional
	public Integer countComptes() {
		return ((Long) compteDAO.createQuerySingleResult("select count(o) from Compte o").getSingleResult()).intValue();
	}
}
