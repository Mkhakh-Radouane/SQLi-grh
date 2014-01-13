package app.service;

import app.dao.CompteDAO;
import app.dao.ManagerRhStatusDAO;

import app.domain.Compte;
import app.domain.ManagerRhStatus;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for ManagerRhStatus entities
 * 
 */

@Service("ManagerRhStatusService")
@Transactional
public class ManagerRhStatusServiceImpl implements ManagerRhStatusService {

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
	 * Instantiates a new ManagerRhStatusServiceImpl.
	 *
	 */
	public ManagerRhStatusServiceImpl() {
	}

	/**
	 * Load an existing ManagerRhStatus entity
	 * 
	 */
	@Transactional
	public Set<ManagerRhStatus> loadManagerRhStatuss() {
		return managerRhStatusDAO.findAllManagerRhStatuss();
	}

	/**
	 * Delete an existing Compte entity
	 * 
	 */
	@Transactional
	public ManagerRhStatus deleteManagerRhStatusCompte(Integer managerrhstatus_id, Integer related_compte_id) {
		ManagerRhStatus managerrhstatus = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(managerrhstatus_id, -1, -1);
		Compte related_compte = compteDAO.findCompteByPrimaryKey(related_compte_id, -1, -1);

		
		managerrhstatus = managerRhStatusDAO.store(managerrhstatus);
		managerRhStatusDAO.flush();

		related_compte = compteDAO.store(related_compte);
		compteDAO.flush();

		compteDAO.remove(related_compte);
		compteDAO.flush();

		return managerrhstatus;
	}

	/**
	 * Delete an existing ManagerRhStatus entity
	 * 
	 */
	@Transactional
	public void deleteManagerRhStatus(ManagerRhStatus managerrhstatus) {
		managerRhStatusDAO.remove(managerrhstatus);
		managerRhStatusDAO.flush();
	}

	/**
	 * Save an existing ManagerRhStatus entity
	 * 
	 */
	@Transactional
	public void saveManagerRhStatus(ManagerRhStatus managerrhstatus) {
		ManagerRhStatus existingManagerRhStatus = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(managerrhstatus.getId());

		if (existingManagerRhStatus != null) {
			if (existingManagerRhStatus != managerrhstatus) {
				existingManagerRhStatus.setId(managerrhstatus.getId());
				existingManagerRhStatus.setCollaborateur(managerrhstatus.getCollaborateur());
				existingManagerRhStatus.setActivation(managerrhstatus.getActivation());
			}
			managerrhstatus = managerRhStatusDAO.store(existingManagerRhStatus);
		} else {
			managerrhstatus = managerRhStatusDAO.store(managerrhstatus);
		}
		managerRhStatusDAO.flush();
	}

	/**
	 * Save an existing Compte entity
	 * 
	 */
	@Transactional
	public ManagerRhStatus saveManagerRhStatusCompte(Integer id, Compte related_compte) {
		ManagerRhStatus managerrhstatus = managerRhStatusDAO.findManagerRhStatusByPrimaryKey(id, -1, -1);
		Compte existingcompte = compteDAO.findCompteByPrimaryKey(related_compte.getId());

		// copy into the existing record to preserve existing relationships
		if (existingcompte != null) {
			existingcompte.setId(related_compte.getId());
			existingcompte.setLogin(related_compte.getLogin());
			existingcompte.setPassword(related_compte.getPassword());
			existingcompte.setEmail(related_compte.getEmail());
			existingcompte.setActivation(related_compte.getActivation());
			related_compte = existingcompte;
		}



		managerrhstatus = managerRhStatusDAO.store(managerrhstatus);
		managerRhStatusDAO.flush();

		related_compte = compteDAO.store(related_compte);
		compteDAO.flush();

		return managerrhstatus;
	}

	/**
	 * Return a count of all ManagerRhStatus entity
	 * 
	 */
	@Transactional
	public Integer countManagerRhStatuss() {
		return ((Long) managerRhStatusDAO.createQuerySingleResult("select count(o) from ManagerRhStatus o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public ManagerRhStatus findManagerRhStatusByPrimaryKey(Integer id) {
		return managerRhStatusDAO.findManagerRhStatusByPrimaryKey(id);
	}

	/**
	 * Return all ManagerRhStatus entity
	 * 
	 */
	@Transactional
	public List<ManagerRhStatus> findAllManagerRhStatuss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<ManagerRhStatus>(managerRhStatusDAO.findAllManagerRhStatuss(startResult, maxRows));
	}
}
