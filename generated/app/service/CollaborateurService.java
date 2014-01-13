package app.service;

import app.domain.Bu;
import app.domain.Collaborateur;
import app.domain.Salaire;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Collaborateur entities
 * 
 */
public interface CollaborateurService {

	/**
	 * Save an existing Collaborateur entity
	 * 
	 */
	public void saveCollaborateur(Collaborateur collaborateur);

	/**
	 * Return a count of all Collaborateur entity
	 * 
	 */
	public Integer countCollaborateurs();

	/**
	 * Return all Collaborateur entity
	 * 
	 */
	public List<Collaborateur> findAllCollaborateurs(Integer startResult, Integer maxRows);

	/**
	 * Save an existing Bu entity
	 * 
	 */
	public Collaborateur saveCollaborateurBu(Integer matricule, Bu related_bu);

	/**
	 */
	public Collaborateur findCollaborateurByPrimaryKey(Integer matricule_1);

	/**
	 * Save an existing Salaire entity
	 * 
	 */
	public Collaborateur saveCollaborateurSalaires(Integer matricule_2, Salaire related_salaires);

	/**
	 * Load an existing Collaborateur entity
	 * 
	 */
	public Set<Collaborateur> loadCollaborateurs();
	/**
	 * Charger le managerRH
	 * 
	 */
	public Set<Collaborateur> loadManagerRH();


	/**
	 * Delete an existing Bu entity
	 * 
	 */
	public Collaborateur deleteCollaborateurBu(Integer collaborateur_matricule, Integer related_bu_id);

	/**
	 * Delete an existing Collaborateur entity
	 * 
	 */
	public void deleteCollaborateur(Collaborateur collaborateur_1);

	/**
	 * Delete an existing Salaire entity
	 * 
	 */
	public Collaborateur deleteCollaborateurSalaires(Integer collaborateur_matricule_1, Integer related_salaires_id, Integer related_salaires_collaborateurMatricule, Integer related_salaires_posteIdPoste);
}