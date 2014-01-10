package app.dao;

import app.domain.ManagerRhStatus;

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
 * DAO to manage ManagerRhStatus entities.
 * 
 */
@Repository("ManagerRhStatusDAO")
@Transactional
public class ManagerRhStatusDAOImpl extends AbstractJpaDao<ManagerRhStatus>
		implements ManagerRhStatusDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { ManagerRhStatus.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ManagerRhStatusDAOImpl
	 *
	 */
	public ManagerRhStatusDAOImpl() {
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
	 * JPQL Query - findManagerRhStatusByActivation
	 *
	 */
	@Transactional
	public Set<ManagerRhStatus> findManagerRhStatusByActivation(Boolean activation) throws DataAccessException {

		return findManagerRhStatusByActivation(activation, -1, -1);
	}

	/**
	 * JPQL Query - findManagerRhStatusByActivation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ManagerRhStatus> findManagerRhStatusByActivation(Boolean activation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findManagerRhStatusByActivation", startResult, maxRows, activation);
		return new LinkedHashSet<ManagerRhStatus>(query.getResultList());
	}

	/**
	 * JPQL Query - findManagerRhStatusByPrimaryKey
	 *
	 */
	@Transactional
	public ManagerRhStatus findManagerRhStatusByPrimaryKey(Integer id) throws DataAccessException {

		return findManagerRhStatusByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findManagerRhStatusByPrimaryKey
	 *
	 */

	@Transactional
	public ManagerRhStatus findManagerRhStatusByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findManagerRhStatusByPrimaryKey", startResult, maxRows, id);
			return (app.domain.ManagerRhStatus) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findManagerRhStatusByCollaborateur
	 *
	 */
	@Transactional
	public Set<ManagerRhStatus> findManagerRhStatusByCollaborateur(Integer collaborateur) throws DataAccessException {

		return findManagerRhStatusByCollaborateur(collaborateur, -1, -1);
	}

	/**
	 * JPQL Query - findManagerRhStatusByCollaborateur
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ManagerRhStatus> findManagerRhStatusByCollaborateur(Integer collaborateur, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findManagerRhStatusByCollaborateur", startResult, maxRows, collaborateur);
		return new LinkedHashSet<ManagerRhStatus>(query.getResultList());
	}

	/**
	 * JPQL Query - findManagerRhStatusById
	 *
	 */
	@Transactional
	public ManagerRhStatus findManagerRhStatusById(Integer id) throws DataAccessException {

		return findManagerRhStatusById(id, -1, -1);
	}

	/**
	 * JPQL Query - findManagerRhStatusById
	 *
	 */

	@Transactional
	public ManagerRhStatus findManagerRhStatusById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findManagerRhStatusById", startResult, maxRows, id);
			return (app.domain.ManagerRhStatus) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllManagerRhStatuss
	 *
	 */
	@Transactional
	public Set<ManagerRhStatus> findAllManagerRhStatuss() throws DataAccessException {

		return findAllManagerRhStatuss(-1, -1);
	}

	/**
	 * JPQL Query - findAllManagerRhStatuss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<ManagerRhStatus> findAllManagerRhStatuss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllManagerRhStatuss", startResult, maxRows);
		return new LinkedHashSet<ManagerRhStatus>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(ManagerRhStatus entity) {
		return true;
	}
}
