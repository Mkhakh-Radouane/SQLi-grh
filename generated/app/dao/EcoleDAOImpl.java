package app.dao;

import app.domain.Ecole;

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
 * DAO to manage Ecole entities.
 * 
 */
@Repository("EcoleDAO")
@Transactional
public class EcoleDAOImpl extends AbstractJpaDao<Ecole> implements EcoleDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Ecole.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new EcoleDAOImpl
	 *
	 */
	public EcoleDAOImpl() {
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
	 * JPQL Query - findEcoleByTypeContaining
	 *
	 */
	@Transactional
	public Set<Ecole> findEcoleByTypeContaining(String type) throws DataAccessException {

		return findEcoleByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findEcoleByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ecole> findEcoleByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEcoleByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<Ecole>(query.getResultList());
	}

	/**
	 * JPQL Query - findEcoleByNomContaining
	 *
	 */
	@Transactional
	public Set<Ecole> findEcoleByNomContaining(String nom) throws DataAccessException {

		return findEcoleByNomContaining(nom, -1, -1);
	}

	/**
	 * JPQL Query - findEcoleByNomContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ecole> findEcoleByNomContaining(String nom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEcoleByNomContaining", startResult, maxRows, nom);
		return new LinkedHashSet<Ecole>(query.getResultList());
	}

	/**
	 * JPQL Query - findEcoleByNom
	 *
	 */
	@Transactional
	public Set<Ecole> findEcoleByNom(String nom) throws DataAccessException {

		return findEcoleByNom(nom, -1, -1);
	}

	/**
	 * JPQL Query - findEcoleByNom
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ecole> findEcoleByNom(String nom, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEcoleByNom", startResult, maxRows, nom);
		return new LinkedHashSet<Ecole>(query.getResultList());
	}

	/**
	 * JPQL Query - findEcoleByType
	 *
	 */
	@Transactional
	public Set<Ecole> findEcoleByType(String type) throws DataAccessException {

		return findEcoleByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findEcoleByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ecole> findEcoleByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findEcoleByType", startResult, maxRows, type);
		return new LinkedHashSet<Ecole>(query.getResultList());
	}

	/**
	 * JPQL Query - findEcoleByPrimaryKey
	 *
	 */
	@Transactional
	public Ecole findEcoleByPrimaryKey(Integer id) throws DataAccessException {

		return findEcoleByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findEcoleByPrimaryKey
	 *
	 */

	@Transactional
	public Ecole findEcoleByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findEcoleByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Ecole) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllEcoles
	 *
	 */
	@Transactional
	public Set<Ecole> findAllEcoles() throws DataAccessException {

		return findAllEcoles(-1, -1);
	}

	/**
	 * JPQL Query - findAllEcoles
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Ecole> findAllEcoles(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllEcoles", startResult, maxRows);
		return new LinkedHashSet<Ecole>(query.getResultList());
	}

	/**
	 * JPQL Query - findEcoleById
	 *
	 */
	@Transactional
	public Ecole findEcoleById(Integer id) throws DataAccessException {

		return findEcoleById(id, -1, -1);
	}

	/**
	 * JPQL Query - findEcoleById
	 *
	 */

	@Transactional
	public Ecole findEcoleById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findEcoleById", startResult, maxRows, id);
			return (app.domain.Ecole) query.getSingleResult();
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
	public boolean canBeMerged(Ecole entity) {
		return true;
	}
}
