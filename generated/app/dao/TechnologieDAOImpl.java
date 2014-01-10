package app.dao;

import app.domain.Technologie;

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
 * DAO to manage Technologie entities.
 * 
 */
@Repository("TechnologieDAO")
@Transactional
public class TechnologieDAOImpl extends AbstractJpaDao<Technologie> implements
		TechnologieDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Technologie.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new TechnologieDAOImpl
	 *
	 */
	public TechnologieDAOImpl() {
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
	 * JPQL Query - findAllTechnologies
	 *
	 */
	@Transactional
	public Set<Technologie> findAllTechnologies() throws DataAccessException {

		return findAllTechnologies(-1, -1);
	}

	/**
	 * JPQL Query - findAllTechnologies
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Technologie> findAllTechnologies(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllTechnologies", startResult, maxRows);
		return new LinkedHashSet<Technologie>(query.getResultList());
	}

	/**
	 * JPQL Query - findTechnologieByTechnologieFieldContaining
	 *
	 */
	@Transactional
	public Set<Technologie> findTechnologieByTechnologieFieldContaining(String technologieField) throws DataAccessException {

		return findTechnologieByTechnologieFieldContaining(technologieField, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologieByTechnologieFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Technologie> findTechnologieByTechnologieFieldContaining(String technologieField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTechnologieByTechnologieFieldContaining", startResult, maxRows, technologieField);
		return new LinkedHashSet<Technologie>(query.getResultList());
	}

	/**
	 * JPQL Query - findTechnologieByPrimaryKey
	 *
	 */
	@Transactional
	public Technologie findTechnologieByPrimaryKey(Integer id) throws DataAccessException {

		return findTechnologieByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologieByPrimaryKey
	 *
	 */

	@Transactional
	public Technologie findTechnologieByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTechnologieByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Technologie) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTechnologieById
	 *
	 */
	@Transactional
	public Technologie findTechnologieById(Integer id) throws DataAccessException {

		return findTechnologieById(id, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologieById
	 *
	 */

	@Transactional
	public Technologie findTechnologieById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findTechnologieById", startResult, maxRows, id);
			return (app.domain.Technologie) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findTechnologieByTechnologieField
	 *
	 */
	@Transactional
	public Set<Technologie> findTechnologieByTechnologieField(String technologieField) throws DataAccessException {

		return findTechnologieByTechnologieField(technologieField, -1, -1);
	}

	/**
	 * JPQL Query - findTechnologieByTechnologieField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Technologie> findTechnologieByTechnologieField(String technologieField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findTechnologieByTechnologieField", startResult, maxRows, technologieField);
		return new LinkedHashSet<Technologie>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Technologie entity) {
		return true;
	}
}
