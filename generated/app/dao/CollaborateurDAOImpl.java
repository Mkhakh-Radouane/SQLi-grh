package app.dao;

import app.domain.Collaborateur;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Collaborateur entities.
 * 
 */
@Repository("CollaborateurDAO")
@Transactional
public class CollaborateurDAOImpl extends AbstractJpaDao<Collaborateur>
		implements CollaborateurDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Collaborateur.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CollaborateurDAOImpl
	 *
	 */
	public CollaborateurDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findCollaborateurByPrenom
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByPrenom(String prenom) throws DataAccessException {

		return findCollaborateurByPrenom(prenom, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByPrenom
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByPrenom(String prenom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByPrenom", startResult, maxRows, prenom);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByAncienCollaborateur
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByAncienCollaborateur(Boolean ancienCollaborateur) throws DataAccessException {

		return findCollaborateurByAncienCollaborateur(ancienCollaborateur, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByAncienCollaborateur
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByAncienCollaborateur(Boolean ancienCollaborateur, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByAncienCollaborateur", startResult, maxRows, ancienCollaborateur);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByDateDepart
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByDateDepart(java.util.Calendar dateDepart) throws DataAccessException {

		return findCollaborateurByDateDepart(dateDepart, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByDateDepart
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByDateDepart(java.util.Calendar dateDepart, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByDateDepart", startResult, maxRows, dateDepart);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurBySiteContaining
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurBySiteContaining(String site) throws DataAccessException {

		return findCollaborateurBySiteContaining(site, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurBySiteContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurBySiteContaining(String site, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurBySiteContaining", startResult, maxRows, site);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByAbreviation
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByAbreviation(String abreviation) throws DataAccessException {

		return findCollaborateurByAbreviation(abreviation, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByAbreviation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByAbreviation(String abreviation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByAbreviation", startResult, maxRows, abreviation);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByNom
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByNom(String nom) throws DataAccessException {

		return findCollaborateurByNom(nom, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByNom
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByNom(String nom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByNom", startResult, maxRows, nom);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurBySite
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurBySite(String site) throws DataAccessException {

		return findCollaborateurBySite(site, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurBySite
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurBySite(String site, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurBySite", startResult, maxRows, site);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByMoisBap
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByMoisBap(Integer moisBap) throws DataAccessException {

		return findCollaborateurByMoisBap(moisBap, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByMoisBap
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByMoisBap(Integer moisBap, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByMoisBap", startResult, maxRows, moisBap);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByAncienManagerRh
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByAncienManagerRh(Integer ancienManagerRh) throws DataAccessException {

		return findCollaborateurByAncienManagerRh(ancienManagerRh, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByAncienManagerRh
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByAncienManagerRh(Integer ancienManagerRh, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByAncienManagerRh", startResult, maxRows, ancienManagerRh);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByAbreviationContaining
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByAbreviationContaining(String abreviation) throws DataAccessException {

		return findCollaborateurByAbreviationContaining(abreviation, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByAbreviationContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByAbreviationContaining(String abreviation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByAbreviationContaining", startResult, maxRows, abreviation);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByMatricule
	 *
	 */
	@Transactional
	public Collaborateur findCollaborateurByMatricule(Integer matricule) throws DataAccessException {

		return findCollaborateurByMatricule(matricule, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByMatricule
	 *
	 */

	@Transactional
	public Collaborateur findCollaborateurByMatricule(Integer matricule, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCollaborateurByMatricule", startResult, maxRows, matricule);
			return (app.domain.Collaborateur) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findCollaborateurByPrenomContaining
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByPrenomContaining(String prenom) throws DataAccessException {

		return findCollaborateurByPrenomContaining(prenom, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByPrenomContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByPrenomContaining(String prenom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByPrenomContaining", startResult, maxRows, prenom);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurBySexe
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurBySexe(String sexe) throws DataAccessException {

		return findCollaborateurBySexe(sexe, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurBySexe
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurBySexe(String sexe, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurBySexe", startResult, maxRows, sexe);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByDateParticipation
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByDateParticipation(java.util.Calendar dateParticipation) throws DataAccessException {

		return findCollaborateurByDateParticipation(dateParticipation, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByDateParticipation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByDateParticipation(java.util.Calendar dateParticipation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByDateParticipation", startResult, maxRows, dateParticipation);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurBySeminaireParticipation
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurBySeminaireParticipation(Boolean seminaireParticipation) throws DataAccessException {

		return findCollaborateurBySeminaireParticipation(seminaireParticipation, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurBySeminaireParticipation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurBySeminaireParticipation(Boolean seminaireParticipation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurBySeminaireParticipation", startResult, maxRows, seminaireParticipation);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByDateEmbauche
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByDateEmbauche(java.util.Calendar dateEmbauche) throws DataAccessException {

		return findCollaborateurByDateEmbauche(dateEmbauche, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByDateEmbauche
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByDateEmbauche(java.util.Calendar dateEmbauche, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByDateEmbauche", startResult, maxRows, dateEmbauche);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByActualManagerRh
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByActualManagerRh(Integer actualManagerRh) throws DataAccessException {

		return findCollaborateurByActualManagerRh(actualManagerRh, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByActualManagerRh
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByActualManagerRh(Integer actualManagerRh, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByActualManagerRh", startResult, maxRows, actualManagerRh);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllCollaborateurs
	 *
	 */
	@Transactional
	public Set<Collaborateur> findAllCollaborateurs() throws DataAccessException {

		return findAllCollaborateurs(-1, -1);
	}

	/**
	 * JPQL Query - findAllCollaborateurs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findAllCollaborateurs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllCollaborateurs", startResult, maxRows);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByEmail
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByEmail(String email) throws DataAccessException {

		return findCollaborateurByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByEmailContaining
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByEmailContaining(String email) throws DataAccessException {

		return findCollaborateurByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByNomContaining
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurByNomContaining(String nom) throws DataAccessException {

		return findCollaborateurByNomContaining(nom, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByNomContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurByNomContaining(String nom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurByNomContaining", startResult, maxRows, nom);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurBySexeContaining
	 *
	 */
	@Transactional
	public Set<Collaborateur> findCollaborateurBySexeContaining(String sexe) throws DataAccessException {

		return findCollaborateurBySexeContaining(sexe, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurBySexeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Collaborateur> findCollaborateurBySexeContaining(String sexe, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCollaborateurBySexeContaining", startResult, maxRows, sexe);
		return new LinkedHashSet<Collaborateur>(query.getResultList());
	}

	/**
	 * JPQL Query - findCollaborateurByPrimaryKey
	 *
	 */
	@Transactional
	public Collaborateur findCollaborateurByPrimaryKey(Integer matricule) throws DataAccessException {

		return findCollaborateurByPrimaryKey(matricule, -1, -1);
	}

	/**
	 * JPQL Query - findCollaborateurByPrimaryKey
	 *
	 */

	@Transactional
	public Collaborateur findCollaborateurByPrimaryKey(Integer matricule, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCollaborateurByPrimaryKey", startResult, maxRows, matricule);
			return (app.domain.Collaborateur) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Collaborateur entity) {
		return true;
	}
}
