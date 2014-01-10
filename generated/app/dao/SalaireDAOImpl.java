package app.dao;

import app.domain.Salaire;

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
 * DAO to manage Salaire entities.
 * 
 */
@Repository("SalaireDAO")
@Transactional
public class SalaireDAOImpl extends AbstractJpaDao<Salaire> implements
		SalaireDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Salaire.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new SalaireDAOImpl
	 *
	 */
	public SalaireDAOImpl() {
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
	 * JPQL Query - findSalaireByDateElevation
	 *
	 */
	@Transactional
	public Set<Salaire> findSalaireByDateElevation(java.util.Calendar dateElevation) throws DataAccessException {

		return findSalaireByDateElevation(dateElevation, -1, -1);
	}

	/**
	 * JPQL Query - findSalaireByDateElevation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Salaire> findSalaireByDateElevation(java.util.Calendar dateElevation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalaireByDateElevation", startResult, maxRows, dateElevation);
		return new LinkedHashSet<Salaire>(query.getResultList());
	}

	/**
	 * JPQL Query - findSalaireById
	 *
	 */
	@Transactional
	public Set<Salaire> findSalaireById(Integer id) throws DataAccessException {

		return findSalaireById(id, -1, -1);
	}

	/**
	 * JPQL Query - findSalaireById
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Salaire> findSalaireById(Integer id, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalaireById", startResult, maxRows, id);
		return new LinkedHashSet<Salaire>(query.getResultList());
	}

	/**
	 * JPQL Query - findSalaireByPosteIdPoste
	 *
	 */
	@Transactional
	public Set<Salaire> findSalaireByPosteIdPoste(Integer posteIdPoste) throws DataAccessException {

		return findSalaireByPosteIdPoste(posteIdPoste, -1, -1);
	}

	/**
	 * JPQL Query - findSalaireByPosteIdPoste
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Salaire> findSalaireByPosteIdPoste(Integer posteIdPoste, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalaireByPosteIdPoste", startResult, maxRows, posteIdPoste);
		return new LinkedHashSet<Salaire>(query.getResultList());
	}

	/**
	 * JPQL Query - findSalaireByCollaborateurMatricule
	 *
	 */
	@Transactional
	public Set<Salaire> findSalaireByCollaborateurMatricule(Integer collaborateurMatricule) throws DataAccessException {

		return findSalaireByCollaborateurMatricule(collaborateurMatricule, -1, -1);
	}

	/**
	 * JPQL Query - findSalaireByCollaborateurMatricule
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Salaire> findSalaireByCollaborateurMatricule(Integer collaborateurMatricule, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalaireByCollaborateurMatricule", startResult, maxRows, collaborateurMatricule);
		return new LinkedHashSet<Salaire>(query.getResultList());
	}

	/**
	 * JPQL Query - findSalaireByPrimaryKey
	 *
	 */
	@Transactional
	public Salaire findSalaireByPrimaryKey(Integer id, Integer collaborateurMatricule, Integer posteIdPoste) throws DataAccessException {

		return findSalaireByPrimaryKey(id, collaborateurMatricule, posteIdPoste, -1, -1);
	}

	/**
	 * JPQL Query - findSalaireByPrimaryKey
	 *
	 */

	@Transactional
	public Salaire findSalaireByPrimaryKey(Integer id, Integer collaborateurMatricule, Integer posteIdPoste, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findSalaireByPrimaryKey", startResult, maxRows, id, collaborateurMatricule, posteIdPoste);
			return (app.domain.Salaire) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findSalaireBySalaireField
	 *
	 */
	@Transactional
	public Set<Salaire> findSalaireBySalaireField(java.math.BigDecimal salaireField) throws DataAccessException {

		return findSalaireBySalaireField(salaireField, -1, -1);
	}

	/**
	 * JPQL Query - findSalaireBySalaireField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Salaire> findSalaireBySalaireField(java.math.BigDecimal salaireField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findSalaireBySalaireField", startResult, maxRows, salaireField);
		return new LinkedHashSet<Salaire>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllSalaires
	 *
	 */
	@Transactional
	public Set<Salaire> findAllSalaires() throws DataAccessException {

		return findAllSalaires(-1, -1);
	}

	/**
	 * JPQL Query - findAllSalaires
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Salaire> findAllSalaires(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllSalaires", startResult, maxRows);
		return new LinkedHashSet<Salaire>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Salaire entity) {
		return true;
	}
}
