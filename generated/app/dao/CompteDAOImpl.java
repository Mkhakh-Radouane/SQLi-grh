package app.dao;

import app.domain.Compte;

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
 * DAO to manage Compte entities.
 * 
 */
@Repository("CompteDAO")
@Transactional
public class CompteDAOImpl extends AbstractJpaDao<Compte> implements CompteDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Compte.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new CompteDAOImpl
	 *
	 */
	public CompteDAOImpl() {
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
	 * JPQL Query - findCompteByLogin
	 *
	 */
	@Transactional
	public Set<Compte> findCompteByLogin(String login) throws DataAccessException {

		return findCompteByLogin(login, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByLogin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findCompteByLogin(String login, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCompteByLogin", startResult, maxRows, login);
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Compte> findCompteByPasswordContaining(String password) throws DataAccessException {

		return findCompteByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findCompteByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCompteByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteByPassword
	 *
	 */
	@Transactional
	public Set<Compte> findCompteByPassword(String password) throws DataAccessException {

		return findCompteByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findCompteByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCompteByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteByPrimaryKey
	 *
	 */
	@Transactional
	public Compte findCompteByPrimaryKey(Integer id) throws DataAccessException {

		return findCompteByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByPrimaryKey
	 *
	 */

	@Transactional
	public Compte findCompteByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCompteByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Compte) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllComptes
	 *
	 */
	@Transactional
	public Set<Compte> findAllComptes() throws DataAccessException {

		return findAllComptes(-1, -1);
	}

	/**
	 * JPQL Query - findAllComptes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findAllComptes(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllComptes", startResult, maxRows);
	
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteByLoginContaining
	 *
	 */
	@Transactional
	public Set<Compte> findCompteByLoginContaining(String login) throws DataAccessException {

		return findCompteByLoginContaining(login, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByLoginContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findCompteByLoginContaining(String login, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCompteByLoginContaining", startResult, maxRows, login);
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteByActivation
	 *
	 */
	@Transactional
	public Set<Compte> findCompteByActivation(Boolean activation) throws DataAccessException {

		return findCompteByActivation(activation, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByActivation
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findCompteByActivation(Boolean activation, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCompteByActivation", startResult, maxRows, activation);
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteByEmail
	 *
	 */
	@Transactional
	public Set<Compte> findCompteByEmail(String email) throws DataAccessException {

		return findCompteByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findCompteByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCompteByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteByEmailContaining
	 *
	 */
	@Transactional
	public Set<Compte> findCompteByEmailContaining(String email) throws DataAccessException {

		return findCompteByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findCompteByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Compte> findCompteByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findCompteByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Compte>(query.getResultList());
	}

	/**
	 * JPQL Query - findCompteById
	 *
	 */
	@Transactional
	public Compte findCompteById(Integer id) throws DataAccessException {

		return findCompteById(id, -1, -1);
	}

	/**
	 * JPQL Query - findCompteById
	 *
	 */

	@Transactional
	public Compte findCompteById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findCompteById", startResult, maxRows, id);
			return (app.domain.Compte) query.getSingleResult();
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
	public boolean canBeMerged(Compte entity) {
		return true;
	}
}
