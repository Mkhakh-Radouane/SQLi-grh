package app.dao;

import app.domain.Poste;

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
 * DAO to manage Poste entities.
 * 
 */
@Repository("PosteDAO")
@Transactional
public class PosteDAOImpl extends AbstractJpaDao<Poste> implements PosteDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Poste.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new PosteDAOImpl
	 *
	 */
	public PosteDAOImpl() {
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
	 * JPQL Query - findPosteByPrimaryKey
	 *
	 */
	@Transactional
	public Poste findPosteByPrimaryKey(Integer idPoste) throws DataAccessException {

		return findPosteByPrimaryKey(idPoste, -1, -1);
	}

	/**
	 * JPQL Query - findPosteByPrimaryKey
	 *
	 */

	@Transactional
	public Poste findPosteByPrimaryKey(Integer idPoste, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPosteByPrimaryKey", startResult, maxRows, idPoste);
			return (app.domain.Poste) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllPostes
	 *
	 */
	@Transactional
	public Set<Poste> findAllPostes() throws DataAccessException {

		return findAllPostes(-1, -1);
	}

	/**
	 * JPQL Query - findAllPostes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Poste> findAllPostes(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllPostes", startResult, maxRows);
		return new LinkedHashSet<Poste>(query.getResultList());
	}

	/**
	 * JPQL Query - findPosteByPosteField
	 *
	 */
	@Transactional
	public Set<Poste> findPosteByPosteField(String posteField) throws DataAccessException {

		return findPosteByPosteField(posteField, -1, -1);
	}

	/**
	 * JPQL Query - findPosteByPosteField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Poste> findPosteByPosteField(String posteField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPosteByPosteField", startResult, maxRows, posteField);
		return new LinkedHashSet<Poste>(query.getResultList());
	}

	/**
	 * JPQL Query - findPosteByPosteFieldContaining
	 *
	 */
	@Transactional
	public Set<Poste> findPosteByPosteFieldContaining(String posteField) throws DataAccessException {

		return findPosteByPosteFieldContaining(posteField, -1, -1);
	}

	/**
	 * JPQL Query - findPosteByPosteFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Poste> findPosteByPosteFieldContaining(String posteField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findPosteByPosteFieldContaining", startResult, maxRows, posteField);
		return new LinkedHashSet<Poste>(query.getResultList());
	}

	/**
	 * JPQL Query - findPosteByIdPoste
	 *
	 */
	@Transactional
	public Poste findPosteByIdPoste(Integer idPoste) throws DataAccessException {

		return findPosteByIdPoste(idPoste, -1, -1);
	}

	/**
	 * JPQL Query - findPosteByIdPoste
	 *
	 */

	@Transactional
	public Poste findPosteByIdPoste(Integer idPoste, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findPosteByIdPoste", startResult, maxRows, idPoste);
			return (app.domain.Poste) query.getSingleResult();
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
	public boolean canBeMerged(Poste entity) {
		return true;
	}
}
