package app.service;

import app.domain.Poste;
import app.domain.Salaire;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Poste entities
 * 
 */
public interface PosteService {

	/**
	 */
	public Poste findPosteByPrimaryKey(Integer idPoste);

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	public Poste deletePosteSalaires(Integer poste_idPoste, Integer related_salaires_id, Integer related_salaires_collaborateurMatricule, Integer related_salaires_posteIdPoste);

	/**
	 * Delete an existing Poste entity
	 * 
	 */
	public void deletePoste(Poste poste);

	/**
	 * Return a count of all Poste entity
	 * 
	 */
	public Integer countPostes();

	/**
	 * Return all Poste entity
	 * 
	 */
	public List<Poste> findAllPostes(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	public Poste savePosteSalaires(Integer idPoste_1, Salaire related_salaires);

	/**
	 * Load an existing Poste entity
	 * 
	 */
	public Set<Poste> loadPostes();

	/**
	 * Save an existing Poste entity
	 * 
	 */
	public void savePoste(Poste poste_1);
}