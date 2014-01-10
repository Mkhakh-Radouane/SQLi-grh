package app.service;

import app.dao.DiplomeDAO;
import app.dao.EcoleDAO;

import app.domain.Diplome;
import app.domain.Ecole;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Ecole entities
 * 
 */

@Service("EcoleService")
@Transactional
public class EcoleServiceImpl implements EcoleService {

	/**
	 * DAO injected by Spring that manages Diplome entities
	 * 
	 */
	@Autowired
	private DiplomeDAO diplomeDAO;

	/**
	 * DAO injected by Spring that manages Ecole entities
	 * 
	 */
	@Autowired
	private EcoleDAO ecoleDAO;

	/**
	 * Instantiates a new EcoleServiceImpl.
	 *
	 */
	public EcoleServiceImpl() {
	}

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	@Transactional
	public Ecole deleteEcoleDiplomes(Integer ecole_id, Integer related_diplomes_id) {
		Diplome related_diplomes = diplomeDAO.findDiplomeByPrimaryKey(related_diplomes_id, -1, -1);

		Ecole ecole = ecoleDAO.findEcoleByPrimaryKey(ecole_id, -1, -1);

		related_diplomes.setEcole(null);
		ecole.getDiplomes().remove(related_diplomes);

		diplomeDAO.remove(related_diplomes);
		diplomeDAO.flush();

		return ecole;
	}

	/**
	 * Save an existing Ecole entity
	 * 
	 */
	@Transactional
	public void saveEcole(Ecole ecole) {
		Ecole existingEcole = ecoleDAO.findEcoleByPrimaryKey(ecole.getId());

		if (existingEcole != null) {
			if (existingEcole != ecole) {
				existingEcole.setId(ecole.getId());
				existingEcole.setNom(ecole.getNom());
				existingEcole.setType(ecole.getType());
			}
			ecole = ecoleDAO.store(existingEcole);
		} else {
			ecole = ecoleDAO.store(ecole);
		}
		ecoleDAO.flush();
	}

	/**
	 * Return a count of all Ecole entity
	 * 
	 */
	@Transactional
	public Integer countEcoles() {
		return ((Long) ecoleDAO.createQuerySingleResult("select count(o) from Ecole o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Ecole entity
	 * 
	 */
	@Transactional
	public Set<Ecole> loadEcoles() {
		return ecoleDAO.findAllEcoles();
	}

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	@Transactional
	public Ecole saveEcoleDiplomes(Integer id, Diplome related_diplomes) {
		Ecole ecole = ecoleDAO.findEcoleByPrimaryKey(id, -1, -1);
		Diplome existingdiplomes = diplomeDAO.findDiplomeByPrimaryKey(related_diplomes.getId());

		// copy into the existing record to preserve existing relationships
		if (existingdiplomes != null) {
			existingdiplomes.setId(related_diplomes.getId());
			existingdiplomes.setPromotion(related_diplomes.getPromotion());
			existingdiplomes.setCollaborateurMatricule(related_diplomes.getCollaborateurMatricule());
			related_diplomes = existingdiplomes;
		}

		related_diplomes.setEcole(ecole);
		ecole.getDiplomes().add(related_diplomes);
		related_diplomes = diplomeDAO.store(related_diplomes);
		diplomeDAO.flush();

		ecole = ecoleDAO.store(ecole);
		ecoleDAO.flush();

		return ecole;
	}

	/**
	 */
	@Transactional
	public Ecole findEcoleByPrimaryKey(Integer id) {
		return ecoleDAO.findEcoleByPrimaryKey(id);
	}

	/**
	 * Return all Ecole entity
	 * 
	 */
	@Transactional
	public List<Ecole> findAllEcoles(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Ecole>(ecoleDAO.findAllEcoles(startResult, maxRows));
	}

	/**
	 * Delete an existing Ecole entity
	 * 
	 */
	@Transactional
	public void deleteEcole(Ecole ecole) {
		ecoleDAO.remove(ecole);
		ecoleDAO.flush();
	}
}
