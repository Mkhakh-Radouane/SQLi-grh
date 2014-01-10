package app.service;

import app.dao.DiplomeDAO;
import app.dao.EcoleDAO;
import app.dao.NiveauDAO;

import app.domain.Diplome;
import app.domain.Ecole;
import app.domain.Niveau;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Diplome entities
 * 
 */

@Service("DiplomeService")
@Transactional
public class DiplomeServiceImpl implements DiplomeService {

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
	 * DAO injected by Spring that manages Niveau entities
	 * 
	 */
	@Autowired
	private NiveauDAO niveauDAO;

	/**
	 * Instantiates a new DiplomeServiceImpl.
	 *
	 */
	public DiplomeServiceImpl() {
	}

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	@Transactional
	public void saveDiplome(Diplome diplome) {
		Diplome existingDiplome = diplomeDAO.findDiplomeByPrimaryKey(diplome.getId());

		if (existingDiplome != null) {
			if (existingDiplome != diplome) {
				existingDiplome.setId(diplome.getId());
				existingDiplome.setPromotion(diplome.getPromotion());
				existingDiplome.setCollaborateurMatricule(diplome.getCollaborateurMatricule());
			}
			diplome = diplomeDAO.store(existingDiplome);
		} else {
			diplome = diplomeDAO.store(diplome);
		}
		diplomeDAO.flush();
	}

	/**
	 * Delete an existing Niveau entity
	 * 
	 */
	@Transactional
	public Diplome deleteDiplomeNiveau(Integer diplome_id, Integer related_niveau_id) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(diplome_id, -1, -1);
		Niveau related_niveau = niveauDAO.findNiveauByPrimaryKey(related_niveau_id, -1, -1);

		diplome.setNiveau(null);
		related_niveau.getDiplomes().remove(diplome);
		diplome = diplomeDAO.store(diplome);
		diplomeDAO.flush();

		related_niveau = niveauDAO.store(related_niveau);
		niveauDAO.flush();

		niveauDAO.remove(related_niveau);
		niveauDAO.flush();

		return diplome;
	}

	/**
	 * Return a count of all Diplome entity
	 * 
	 */
	@Transactional
	public Integer countDiplomes() {
		return ((Long) diplomeDAO.createQuerySingleResult("select count(o) from Diplome o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Ecole entity
	 * 
	 */
	@Transactional
	public Diplome deleteDiplomeEcole(Integer diplome_id, Integer related_ecole_id) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(diplome_id, -1, -1);
		Ecole related_ecole = ecoleDAO.findEcoleByPrimaryKey(related_ecole_id, -1, -1);

		diplome.setEcole(null);
		related_ecole.getDiplomes().remove(diplome);
		diplome = diplomeDAO.store(diplome);
		diplomeDAO.flush();

		related_ecole = ecoleDAO.store(related_ecole);
		ecoleDAO.flush();

		ecoleDAO.remove(related_ecole);
		ecoleDAO.flush();

		return diplome;
	}

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	@Transactional
	public void deleteDiplome(Diplome diplome) {
		diplomeDAO.remove(diplome);
		diplomeDAO.flush();
	}

	/**
	 * Return all Diplome entity
	 * 
	 */
	@Transactional
	public List<Diplome> findAllDiplomes(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Diplome>(diplomeDAO.findAllDiplomes(startResult, maxRows));
	}

	/**
	 * Save an existing Niveau entity
	 * 
	 */
	@Transactional
	public Diplome saveDiplomeNiveau(Integer id, Niveau related_niveau) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(id, -1, -1);
		Niveau existingniveau = niveauDAO.findNiveauByPrimaryKey(related_niveau.getId());

		// copy into the existing record to preserve existing relationships
		if (existingniveau != null) {
			existingniveau.setId(related_niveau.getId());
			existingniveau.setNiveauField(related_niveau.getNiveauField());
			related_niveau = existingniveau;
		}

		diplome.setNiveau(related_niveau);
		related_niveau.getDiplomes().add(diplome);
		diplome = diplomeDAO.store(diplome);
		diplomeDAO.flush();

		related_niveau = niveauDAO.store(related_niveau);
		niveauDAO.flush();

		return diplome;
	}

	/**
	 * Save an existing Ecole entity
	 * 
	 */
	@Transactional
	public Diplome saveDiplomeEcole(Integer id, Ecole related_ecole) {
		Diplome diplome = diplomeDAO.findDiplomeByPrimaryKey(id, -1, -1);
		Ecole existingecole = ecoleDAO.findEcoleByPrimaryKey(related_ecole.getId());

		// copy into the existing record to preserve existing relationships
		if (existingecole != null) {
			existingecole.setId(related_ecole.getId());
			existingecole.setNom(related_ecole.getNom());
			existingecole.setType(related_ecole.getType());
			related_ecole = existingecole;
		}

		diplome.setEcole(related_ecole);
		related_ecole.getDiplomes().add(diplome);
		diplome = diplomeDAO.store(diplome);
		diplomeDAO.flush();

		related_ecole = ecoleDAO.store(related_ecole);
		ecoleDAO.flush();

		return diplome;
	}

	/**
	 */
	@Transactional
	public Diplome findDiplomeByPrimaryKey(Integer id) {
		return diplomeDAO.findDiplomeByPrimaryKey(id);
	}

	/**
	 * Load an existing Diplome entity
	 * 
	 */
	@Transactional
	public Set<Diplome> loadDiplomes() {
		return diplomeDAO.findAllDiplomes();
	}
}
