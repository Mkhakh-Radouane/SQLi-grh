package app.dao;

import app.domain.Niveau;

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
 * DAO to manage Niveau entities.
 * 
 */
@Repository("NiveauDAO")
@Transactional
public class NiveauDAOImpl extends AbstractJpaDao<Niveau> implements NiveauDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Niveau.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new NiveauDAOImpl
	 *
	 */
	public NiveauDAOImpl() {
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
	 * JPQL Query - findNiveauById
	 *
	 */
	@Transactional
	public Niveau findNiveauById(Integer id) throws DataAccessException {

		return findNiveauById(id, -1, -1);
	}

	/**
	 * JPQL Query - findNiveauById
	 *
	 */

	@Transactional
	public Niveau findNiveauById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findNiveauById", startResult, maxRows, id);
			return (app.domain.Niveau) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findNiveauByPrimaryKey
	 *
	 */
	@Transactional
	public Niveau findNiveauByPrimaryKey(Integer id) throws DataAccessException {

		return findNiveauByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findNiveauByPrimaryKey
	 *
	 */

	@Transactional
	public Niveau findNiveauByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findNiveauByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Niveau) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findNiveauByNiveauFieldContaining
	 *
	 */
	@Transactional
	public Set<Niveau> findNiveauByNiveauFieldContaining(String niveauField) throws DataAccessException {

		return findNiveauByNiveauFieldContaining(niveauField, -1, -1);
	}

	/**
	 * JPQL Query - findNiveauByNiveauFieldContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Niveau> findNiveauByNiveauFieldContaining(String niveauField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNiveauByNiveauFieldContaining", startResult, maxRows, niveauField);
		return new LinkedHashSet<Niveau>(query.getResultList());
	}

	/**
	 * JPQL Query - findNiveauByNiveauField
	 *
	 */
	@Transactional
	public Set<Niveau> findNiveauByNiveauField(String niveauField) throws DataAccessException {

		return findNiveauByNiveauField(niveauField, -1, -1);
	}

	/**
	 * JPQL Query - findNiveauByNiveauField
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Niveau> findNiveauByNiveauField(String niveauField, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findNiveauByNiveauField", startResult, maxRows, niveauField);
		return new LinkedHashSet<Niveau>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllNiveaus
	 *
	 */
	@Transactional
	public Set<Niveau> findAllNiveaus() throws DataAccessException {

		return findAllNiveaus(-1, -1);
	}

	/**
	 * JPQL Query - findAllNiveaus
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Niveau> findAllNiveaus(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllNiveaus", startResult, maxRows);
		return new LinkedHashSet<Niveau>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Niveau entity) {
		return true;
	}
}
