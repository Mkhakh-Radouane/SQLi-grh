package app.dao;

import app.domain.Collaborateur;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Collaborateur entities.
 * 
 */
public interface CollaborateurDAO extends JpaDao<Collaborateur> {

	/**
	 * JPQL Query - findCollaborateurByPrenom
	 *
	 */
	public Set<Collaborateur> findCollaborateurByPrenom(String prenom) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByPrenom
	 *
	 */
	public Set<Collaborateur> findCollaborateurByPrenom(String prenom, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAncienCollaborateur
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAncienCollaborateur(Boolean ancienCollaborateur) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAncienCollaborateur
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAncienCollaborateur(Boolean ancienCollaborateur, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByDateDepart
	 *
	 */
	public Set<Collaborateur> findCollaborateurByDateDepart(java.util.Calendar dateDepart) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByDateDepart
	 *
	 */
	public Set<Collaborateur> findCollaborateurByDateDepart(Calendar dateDepart, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySiteContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySiteContaining(String site) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySiteContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySiteContaining(String site, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAbreviation
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAbreviation(String abreviation) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAbreviation
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAbreviation(String abreviation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByNom
	 *
	 */
	public Set<Collaborateur> findCollaborateurByNom(String nom) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByNom
	 *
	 */
	public Set<Collaborateur> findCollaborateurByNom(String nom, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySite
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySite(String site_1) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySite
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySite(String site_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByMoisBap
	 *
	 */
	public Set<Collaborateur> findCollaborateurByMoisBap(Integer moisBap) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByMoisBap
	 *
	 */
	public Set<Collaborateur> findCollaborateurByMoisBap(Integer moisBap, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAncienManagerRh
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAncienManagerRh(Integer ancienManagerRh) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAncienManagerRh
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAncienManagerRh(Integer ancienManagerRh, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAbreviationContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAbreviationContaining(String abreviation_1) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByAbreviationContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByAbreviationContaining(String abreviation_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByMatricule
	 *
	 */
	public Collaborateur findCollaborateurByMatricule(Integer matricule) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByMatricule
	 *
	 */
	public Collaborateur findCollaborateurByMatricule(Integer matricule, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByPrenomContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByPrenomContaining(String prenom_1) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByPrenomContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByPrenomContaining(String prenom_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySexe
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySexe(String sexe) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySexe
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySexe(String sexe, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByDateParticipation
	 *
	 */
	public Set<Collaborateur> findCollaborateurByDateParticipation(java.util.Calendar dateParticipation) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByDateParticipation
	 *
	 */
	public Set<Collaborateur> findCollaborateurByDateParticipation(Calendar dateParticipation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySeminaireParticipation
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySeminaireParticipation(Boolean seminaireParticipation) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySeminaireParticipation
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySeminaireParticipation(Boolean seminaireParticipation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByDateEmbauche
	 *
	 */
	public Set<Collaborateur> findCollaborateurByDateEmbauche(java.util.Calendar dateEmbauche) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByDateEmbauche
	 *
	 */
	public Set<Collaborateur> findCollaborateurByDateEmbauche(Calendar dateEmbauche, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByActualManagerRh
	 *
	 */
	public Set<Collaborateur> findCollaborateurByActualManagerRh(Integer actualManagerRh) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByActualManagerRh
	 *
	 */
	public Set<Collaborateur> findCollaborateurByActualManagerRh(Integer actualManagerRh, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllCollaborateurs
	 *
	 */
	public Set<Collaborateur> findAllCollaborateurs() throws DataAccessException;

	/**
	 * JPQL Query - findAllCollaborateurs
	 *
	 */
	public Set<Collaborateur> findAllCollaborateurs(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByEmail
	 *
	 */
	public Set<Collaborateur> findCollaborateurByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByEmail
	 *
	 */
	public Set<Collaborateur> findCollaborateurByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByEmailContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByEmailContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByNomContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByNomContaining(String nom_1) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByNomContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurByNomContaining(String nom_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySexeContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySexeContaining(String sexe_1) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurBySexeContaining
	 *
	 */
	public Set<Collaborateur> findCollaborateurBySexeContaining(String sexe_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByPrimaryKey
	 *
	 */
	public Collaborateur findCollaborateurByPrimaryKey(Integer matricule_1) throws DataAccessException;

	/**
	 * JPQL Query - findCollaborateurByPrimaryKey
	 *
	 */
	public Collaborateur findCollaborateurByPrimaryKey(Integer matricule_1, int startResult, int maxRows) throws DataAccessException;

}