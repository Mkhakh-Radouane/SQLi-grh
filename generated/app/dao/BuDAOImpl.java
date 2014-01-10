package app.dao;

import app.domain.Bu;

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
 * DAO to manage Bu entities.
 * 
 */
@Repository("BuDAO")
@Transactional
public class BuDAOImpl extends AbstractJpaDao<Bu> implements BuDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Bu.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new BuDAOImpl
	 *
	 */
	public BuDAOImpl() {
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
	 * JPQL Query - findBuByBuField
	 *
	 */
	@Transactional
	public Set<Bu> findBuByBuField(String buField) throws DataAccessException {

		return findBuByBuField(buField, -1, -1);
	}

	/**
	 * JPQL Query - findBuByBuField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bu> findBuByBuField(String buField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBuByBuField", startResult, maxRows, buField);
		return new LinkedHashSet<Bu>(query.getResultList());
	}

	/**
	 * JPQL Query - findBuByPrimaryKey
	 *
	 */
	@Transactional
	public Bu findBuByPrimaryKey(Integer id) throws DataAccessException {

		return findBuByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findBuByPrimaryKey
	 *
	 */

	@Transactional
	public Bu findBuByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBuByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Bu) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findBuById
	 *
	 */
	@Transactional
	public Bu findBuById(Integer id) throws DataAccessException {

		return findBuById(id, -1, -1);
	}

	/**
	 * JPQL Query - findBuById
	 *
	 */

	@Transactional
	public Bu findBuById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findBuById", startResult, maxRows, id);
			return (app.domain.Bu) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllBus
	 *
	 */
	@Transactional
	public Set<Bu> findAllBus() throws DataAccessException {

		return findAllBus(-1, -1);
	}

	/**
	 * JPQL Query - findAllBus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bu> findAllBus(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllBus", startResult, maxRows);
		return new LinkedHashSet<Bu>(query.getResultList());
	}

	/**
	 * JPQL Query - findBuByBuFieldContaining
	 *
	 */
	@Transactional
	public Set<Bu> findBuByBuFieldContaining(String buField) throws DataAccessException {

		return findBuByBuFieldContaining(buField, -1, -1);
	}

	/**
	 * JPQL Query - findBuByBuFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Bu> findBuByBuFieldContaining(String buField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findBuByBuFieldContaining", startResult, maxRows, buField);
		return new LinkedHashSet<Bu>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Bu entity) {
		return true;
	}
}
