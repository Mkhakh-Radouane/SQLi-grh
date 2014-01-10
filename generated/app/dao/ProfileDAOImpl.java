package app.dao;

import app.domain.Profile;

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
 * DAO to manage Profile entities.
 * 
 */
@Repository("ProfileDAO")
@Transactional
public class ProfileDAOImpl extends AbstractJpaDao<Profile> implements
		ProfileDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Profile.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ProfileDAOImpl
	 *
	 */
	public ProfileDAOImpl() {
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
	 * JPQL Query - findProfileByProfileFieldContaining
	 *
	 */
	@Transactional
	public Set<Profile> findProfileByProfileFieldContaining(String profileField) throws DataAccessException {

		return findProfileByProfileFieldContaining(profileField, -1, -1);
	}

	/**
	 * JPQL Query - findProfileByProfileFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Profile> findProfileByProfileFieldContaining(String profileField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProfileByProfileFieldContaining", startResult, maxRows, profileField);
		return new LinkedHashSet<Profile>(query.getResultList());
	}

	/**
	 * JPQL Query - findProfileByPrimaryKey
	 *
	 */
	@Transactional
	public Profile findProfileByPrimaryKey(Integer id) throws DataAccessException {

		return findProfileByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findProfileByPrimaryKey
	 *
	 */

	@Transactional
	public Profile findProfileByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProfileByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Profile) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProfileById
	 *
	 */
	@Transactional
	public Profile findProfileById(Integer id) throws DataAccessException {

		return findProfileById(id, -1, -1);
	}

	/**
	 * JPQL Query - findProfileById
	 *
	 */

	@Transactional
	public Profile findProfileById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findProfileById", startResult, maxRows, id);
			return (app.domain.Profile) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findProfileByProfileField
	 *
	 */
	@Transactional
	public Set<Profile> findProfileByProfileField(String profileField) throws DataAccessException {

		return findProfileByProfileField(profileField, -1, -1);
	}

	/**
	 * JPQL Query - findProfileByProfileField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Profile> findProfileByProfileField(String profileField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findProfileByProfileField", startResult, maxRows, profileField);
		return new LinkedHashSet<Profile>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllProfiles
	 *
	 */
	@Transactional
	public Set<Profile> findAllProfiles() throws DataAccessException {

		return findAllProfiles(-1, -1);
	}

	/**
	 * JPQL Query - findAllProfiles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Profile> findAllProfiles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllProfiles", startResult, maxRows);
		return new LinkedHashSet<Profile>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Profile entity) {
		return true;
	}
}
