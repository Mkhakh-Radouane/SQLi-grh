package app.service;

import app.dao.PosteDAO;
import app.dao.SalaireDAO;

import app.domain.Poste;
import app.domain.Salaire;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Poste entities
 * 
 */

@Service("PosteService")
@Transactional
public class PosteServiceImpl implements PosteService {

	/**
	 * DAO injected by Spring that manages Poste entities
	 * 
	 */
	@Autowired
	private PosteDAO posteDAO;

	/**
	 * DAO injected by Spring that manages Salaire entities
	 * 
	 */
	@Autowired
	private SalaireDAO salaireDAO;

	/**
	 * Instantiates a new PosteServiceImpl.
	 *
	 */
	public PosteServiceImpl() {
	}

	/**
	 */
	@Transactional
	public Poste findPosteByPrimaryKey(Integer idPoste) {
		return posteDAO.findPosteByPrimaryKey(idPoste);
	}

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	@Transactional
	public Poste deletePosteSalaires(Integer poste_idPoste, Integer related_salaires_id, Integer related_salaires_collaborateurMatricule, Integer related_salaires_posteIdPoste) {
		Salaire related_salaires = salaireDAO.findSalaireByPrimaryKey(related_salaires_id, related_salaires_collaborateurMatricule, related_salaires_posteIdPoste, -1, -1);

		Poste poste = posteDAO.findPosteByPrimaryKey(poste_idPoste, -1, -1);

		related_salaires.setPoste(null);
		poste.getSalaires().remove(related_salaires);

		salaireDAO.remove(related_salaires);
		salaireDAO.flush();

		return poste;
	}

	/**
	 * Delete an existing Poste entity
	 * 
	 */
	@Transactional
	public void deletePoste(Poste poste) {
		posteDAO.remove(poste);
		posteDAO.flush();
	}

	/**
	 * Return a count of all Poste entity
	 * 
	 */
	@Transactional
	public Integer countPostes() {
		return ((Long) posteDAO.createQuerySingleResult("select count(o) from Poste o").getSingleResult()).intValue();
	}

	/**
	 * Return all Poste entity
	 * 
	 */
	@Transactional
	public List<Poste> findAllPostes(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Poste>(posteDAO.findAllPostes(startResult, maxRows));
	}

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	@Transactional
	public Poste savePosteSalaires(Integer idPoste, Salaire related_salaires) {
		Poste poste = posteDAO.findPosteByPrimaryKey(idPoste, -1, -1);
		Salaire existingsalaires = salaireDAO.findSalaireByPrimaryKey(related_salaires.getId(), related_salaires.getCollaborateurMatricule(), related_salaires.getPosteIdPoste());

		// copy into the existing record to preserve existing relationships
		if (existingsalaires != null) {
			existingsalaires.setId(related_salaires.getId());
			existingsalaires.setCollaborateurMatricule(related_salaires.getCollaborateurMatricule());
			existingsalaires.setPosteIdPoste(related_salaires.getPosteIdPoste());
			existingsalaires.setSalaireField(related_salaires.getSalaireField());
			existingsalaires.setDateElevation(related_salaires.getDateElevation());
			related_salaires = existingsalaires;
		}

		related_salaires.setPoste(poste);
		poste.getSalaires().add(related_salaires);
		related_salaires = salaireDAO.store(related_salaires);
		salaireDAO.flush();

		poste = posteDAO.store(poste);
		posteDAO.flush();

		return poste;
	}

	/**
	 * Load an existing Poste entity
	 * 
	 */
	@Transactional
	public Set<Poste> loadPostes() {
		return posteDAO.findAllPostes();
	}

	/**
	 * Save an existing Poste entity
	 * 
	 */
	@Transactional
	public void savePoste(Poste poste) {
		Poste existingPoste = posteDAO.findPosteByPrimaryKey(poste.getIdPoste());

		if (existingPoste != null) {
			if (existingPoste != poste) {
				existingPoste.setIdPoste(poste.getIdPoste());
				existingPoste.setPosteField(poste.getPosteField());
			}
			poste = posteDAO.store(existingPoste);
		} else {
			poste = posteDAO.store(poste);
		}
		posteDAO.flush();
	}
}
