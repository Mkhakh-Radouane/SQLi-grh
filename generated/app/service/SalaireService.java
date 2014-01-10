package app.service;

import app.domain.Collaborateur;
import app.domain.Poste;
import app.domain.Salaire;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Salaire entities
 * 
 */
public interface SalaireService {

	/**
	 * Delete an existing Poste entity
	 * 
	 */
	public Salaire deleteSalairePoste(Integer salaire_id, Integer salaire_collaborateurMatricule, Integer salaire_posteIdPoste, Integer related_poste_idPoste);

	/**
	 */
	public Salaire findSalaireByPrimaryKey(Integer id, Integer collaborateurMatricule, Integer posteIdPoste);

	/**
	 * Load an existing Salaire entity
	 * 
	 */
	public Set<Salaire> loadSalaires();

	/**
	 * Return all Salaire entity
	 * 
	 */
	public List<Salaire> findAllSalaires(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all Salaire entity
	 * 
	 */
	public Integer countSalaires();

	/**
	 * Save an existing Poste entity
	 * 
	 */
	public Salaire saveSalairePoste(Integer id_1, Integer collaborateurMatricule_1, Integer posteIdPoste_1, Poste related_poste);

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	public Salaire deleteSalaireCollaborateur(Integer salaire_id_1, Integer salaire_collaborateurMatricule_1, Integer salaire_posteIdPoste_1, Integer related_collaborateur_matricule);

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	public void saveSalaire(Salaire salaire);

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	public void deleteSalaire(Salaire salaire_1);

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	public Salaire saveSalaireCollaborateur(Integer id_2, Integer collaborateurMatricule_2, Integer posteIdPoste_2, Collaborateur related_collaborateur);
}