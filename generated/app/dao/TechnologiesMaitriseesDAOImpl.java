package app.dao;

import app.domain.TechnologiesMaitrisees;

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
 * DAO to manage TechnologiesMaitrisees entities.
 * 
 */
@Repository("TechnologiesMaitriseesDAO")
@Transactional
public class TechnologiesMaitriseesDAOImpl extends AbstractJpaDao<TechnologiesMaitrisees>
		implements TechnologiesMaitriseesDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { TechnologiesMaitrisees.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TechnologiesMaitriseesDAOImpl
	 *
	 */
	public TechnologiesMaitriseesDAOImpl() {
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
	 * JPQL Query - findTechnologiesMaitriseesByNiveauExpertise
	 *
	 */
	@Transactional
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByNiveauExpertise(Integer niveauExpertise) throws DataAccessException {

		return findTechnologiesMaitriseesByNiveauExpertise(niveauExpertise, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologiesMaitriseesByNiveauExpertise
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByNiveauExpertise(Integer niveauExpertise, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTechnologiesMaitriseesByNiveauExpertise", startResult, maxRows, niveauExpertise);
		return new LinkedHashSet<TechnologiesMaitrisees>(query.getResultList());
	}

	/**
	 * JPQL Query - findTechnologiesMaitriseesByPrimaryKey
	 *
	 */
	@Transactional
	public TechnologiesMaitrisees findTechnologiesMaitriseesByPrimaryKey(Integer technologieField, Integer collaborateur) throws DataAccessException {

		return findTechnologiesMaitriseesByPrimaryKey(technologieField, collaborateur, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologiesMaitriseesByPrimaryKey
	 *
	 */

	@Transactional
	public TechnologiesMaitrisees findTechnologiesMaitriseesByPrimaryKey(Integer technologieField, Integer collaborateur, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTechnologiesMaitriseesByPrimaryKey", startResult, maxRows, technologieField, collaborateur);
			return (app.domain.TechnologiesMaitrisees) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTechnologiesMaitriseesByTechnologieField
	 *
	 */
	@Transactional
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByTechnologieField(Integer technologieField) throws DataAccessException {

		return findTechnologiesMaitriseesByTechnologieField(technologieField, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologiesMaitriseesByTechnologieField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByTechnologieField(Integer technologieField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTechnologiesMaitriseesByTechnologieField", startResult, maxRows, technologieField);
		return new LinkedHashSet<TechnologiesMaitrisees>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllTechnologiesMaitriseess
	 *
	 */
	@Transactional
	public Set<TechnologiesMaitrisees> findAllTechnologiesMaitriseess() throws DataAccessException {

		return findAllTechnologiesMaitriseess(-1, -1);
	}

	/**
	 * JPQL Query - findAllTechnologiesMaitriseess
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<TechnologiesMaitrisees> findAllTechnologiesMaitriseess(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTechnologiesMaitriseess", startResult, maxRows);
		return new LinkedHashSet<TechnologiesMaitrisees>(query.getResultList());
	}

	/**
	 * JPQL Query - findTechnologiesMaitriseesByCollaborateur
	 *
	 */
	@Transactional
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByCollaborateur(Integer collaborateur) throws DataAccessException {

		return findTechnologiesMaitriseesByCollaborateur(collaborateur, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologiesMaitriseesByCollaborateur
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByCollaborateur(Integer collaborateur, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTechnologiesMaitriseesByCollaborateur", startResult, maxRows, collaborateur);
		return new LinkedHashSet<TechnologiesMaitrisees>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(TechnologiesMaitrisees entity) {
		return true;
	}
}
