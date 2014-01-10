package app.service;

import app.dao.DiplomeDAO;
import app.dao.NiveauDAO;

import app.domain.Diplome;
import app.domain.Niveau;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Niveau entities
 * 
 */

@Service("NiveauService")
@Transactional
public class NiveauServiceImpl implements NiveauService {

	/**
	 * DAO injected by Spring that manages Diplome entities
	 * 
	 */
	@Autowired
	private DiplomeDAO diplomeDAO;

	/**
	 * DAO injected by Spring that manages Niveau entities
	 * 
	 */
	@Autowired
	private NiveauDAO niveauDAO;

	/**
	 * Instantiates a new NiveauServiceImpl.
	 *
	 */
	public NiveauServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Niveau findNiveauByPrimaryKey(Integer id) {
		return niveauDAO.findNiveauByPrimaryKey(id);
	}

	/**
	 * Save an existing Diplome entity
	 * 
	 */
	@Transactional
	public Niveau saveNiveauDiplomes(Integer id, Diplome related_diplomes) {
		Niveau niveau = niveauDAO.findNiveauByPrimaryKey(id, -1, -1);
		Diplome existingdiplomes = diplomeDAO.findDiplomeByPrimaryKey(related_diplomes.getId());

		// copy into the existing record to preserve existing relationships
		if (existingdiplomes != null) {
			existingdiplomes.setId(related_diplomes.getId());
			existingdiplomes.setPromotion(related_diplomes.getPromotion());
			existingdiplomes.setCollaborateurMatricule(related_diplomes.getCollaborateurMatricule());
			related_diplomes = existingdiplomes;
		}

		related_diplomes.setNiveau(niveau);
		niveau.getDiplomes().add(related_diplomes);
		related_diplomes = diplomeDAO.store(related_diplomes);
		diplomeDAO.flush();

		niveau = niveauDAO.store(niveau);
		niveauDAO.flush();

		return niveau;
	}

	/**
	 * Save an existing Niveau entity
	 * 
	 */
	@Transactional
	public void saveNiveau(Niveau niveau) {
		Niveau existingNiveau = niveauDAO.findNiveauByPrimaryKey(niveau.getId());

		if (existingNiveau != null) {
			if (existingNiveau != niveau) {
				existingNiveau.setId(niveau.getId());
				existingNiveau.setNiveauField(niveau.getNiveauField());
			}
			niveau = niveauDAO.store(existingNiveau);
		} else {
			niveau = niveauDAO.store(niveau);
		}
		niveauDAO.flush();
	}

	/**
	 * Delete an existing Diplome entity
	 * 
	 */
	@Transactional
	public Niveau deleteNiveauDiplomes(Integer niveau_id, Integer related_diplomes_id) {
		Diplome related_diplomes = diplomeDAO.findDiplomeByPrimaryKey(related_diplomes_id, -1, -1);

		Niveau niveau = niveauDAO.findNiveauByPrimaryKey(niveau_id, -1, -1);

		related_diplomes.setNiveau(null);
		niveau.getDiplomes().remove(related_diplomes);

		diplomeDAO.remove(related_diplomes);
		diplomeDAO.flush();

		return niveau;
	}

	/**
	 * Load an existing Niveau entity
	 * 
	 */
	@Transactional
	public Set<Niveau> loadNiveaus() {
		return niveauDAO.findAllNiveaus();
	}

	/**
	 * Delete an existing Niveau entity
	 * 
	 */
	@Transactional
	public void deleteNiveau(Niveau niveau) {
		niveauDAO.remove(niveau);
		niveauDAO.flush();
	}

	/**
	 * Return a count of all Niveau entity
	 * 
	 */
	@Transactional
	public Integer countNiveaus() {
		return ((Long) niveauDAO.createQuerySingleResult("select count(o) from Niveau o").getSingleResult()).intValue();
	}

	/**
	 * Return all Niveau entity
	 * 
	 */
	@Transactional
	public List<Niveau> findAllNiveaus(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Niveau>(niveauDAO.findAllNiveaus(startResult, maxRows));
	}
}
