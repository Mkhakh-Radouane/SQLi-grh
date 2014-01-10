package app.dao;

import app.domain.Droit;

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
 * DAO to manage Droit entities.
 * 
 */
@Repository("DroitDAO")
@Transactional
public class DroitDAOImpl extends AbstractJpaDao<Droit> implements DroitDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Droit.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DroitDAOImpl
	 *
	 */
	public DroitDAOImpl() {
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
	 * JPQL Query - findAllDroits
	 *
	 */
	@Transactional
	public Set<Droit> findAllDroits() throws DataAccessException {

		return findAllDroits(-1, -1);
	}

	/**
	 * JPQL Query - findAllDroits
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Droit> findAllDroits(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDroits", startResult, maxRows);
		return new LinkedHashSet<Droit>(query.getResultList());
	}

	/**
	 * JPQL Query - findDroitByDroitFieldContaining
	 *
	 */
	@Transactional
	public Set<Droit> findDroitByDroitFieldContaining(String droitField) throws DataAccessException {

		return findDroitByDroitFieldContaining(droitField, -1, -1);
	}

	/**
	 * JPQL Query - findDroitByDroitFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Droit> findDroitByDroitFieldContaining(String droitField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDroitByDroitFieldContaining", startResult, maxRows, droitField);
		return new LinkedHashSet<Droit>(query.getResultList());
	}

	/**
	 * JPQL Query - findDroitByPrimaryKey
	 *
	 */
	@Transactional
	public Droit findDroitByPrimaryKey(Integer id) throws DataAccessException {

		return findDroitByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findDroitByPrimaryKey
	 *
	 */

	@Transactional
	public Droit findDroitByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDroitByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Droit) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDroitById
	 *
	 */
	@Transactional
	public Droit findDroitById(Integer id) throws DataAccessException {

		return findDroitById(id, -1, -1);
	}

	/**
	 * JPQL Query - findDroitById
	 *
	 */

	@Transactional
	public Droit findDroitById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDroitById", startResult, maxRows, id);
			return (app.domain.Droit) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDroitByDroitField
	 *
	 */
	@Transactional
	public Set<Droit> findDroitByDroitField(String droitField) throws DataAccessException {

		return findDroitByDroitField(droitField, -1, -1);
	}

	/**
	 * JPQL Query - findDroitByDroitField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Droit> findDroitByDroitField(String droitField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDroitByDroitField", startResult, maxRows, droitField);
		return new LinkedHashSet<Droit>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Droit entity) {
		return true;
	}
}
