package app.dao;

import app.domain.Diplome;

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
 * DAO to manage Diplome entities.
 * 
 */
@Repository("DiplomeDAO")
@Transactional
public class DiplomeDAOImpl extends AbstractJpaDao<Diplome> implements
		DiplomeDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Diplome.class }));

	/**
	 * EntityManager injected by Spring for persistence unit mysql1
	 *
	 */
	@PersistenceContext(unitName = "mysql1")
	private EntityManager entityManager;

	/**
	 * Instantiates a new DiplomeDAOImpl
	 *
	 */
	public DiplomeDAOImpl() {
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
	 * JPQL Query - findAllDiplomes
	 *
	 */
	@Transactional
	public Set<Diplome> findAllDiplomes() throws DataAccessException {

		return findAllDiplomes(-1, -1);
	}

	/**
	 * JPQL Query - findAllDiplomes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diplome> findAllDiplomes(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllDiplomes", startResult, maxRows);
		return new LinkedHashSet<Diplome>(query.getResultList());
	}

	/**
	 * JPQL Query - findDiplomeByPromotionContaining
	 *
	 */
	@Transactional
	public Set<Diplome> findDiplomeByPromotionContaining(String promotion) throws DataAccessException {

		return findDiplomeByPromotionContaining(promotion, -1, -1);
	}

	/**
	 * JPQL Query - findDiplomeByPromotionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diplome> findDiplomeByPromotionContaining(String promotion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiplomeByPromotionContaining", startResult, maxRows, promotion);
		return new LinkedHashSet<Diplome>(query.getResultList());
	}

	/**
	 * JPQL Query - findDiplomeById
	 *
	 */
	@Transactional
	public Diplome findDiplomeById(Integer id) throws DataAccessException {

		return findDiplomeById(id, -1, -1);
	}

	/**
	 * JPQL Query - findDiplomeById
	 *
	 */

	@Transactional
	public Diplome findDiplomeById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDiplomeById", startResult, maxRows, id);
			return (app.domain.Diplome) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDiplomeByPromotion
	 *
	 */
	@Transactional
	public Set<Diplome> findDiplomeByPromotion(String promotion) throws DataAccessException {

		return findDiplomeByPromotion(promotion, -1, -1);
	}

	/**
	 * JPQL Query - findDiplomeByPromotion
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diplome> findDiplomeByPromotion(String promotion, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiplomeByPromotion", startResult, maxRows, promotion);
		return new LinkedHashSet<Diplome>(query.getResultList());
	}

	/**
	 * JPQL Query - findDiplomeByPrimaryKey
	 *
	 */
	@Transactional
	public Diplome findDiplomeByPrimaryKey(Integer id) throws DataAccessException {

		return findDiplomeByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findDiplomeByPrimaryKey
	 *
	 */

	@Transactional
	public Diplome findDiplomeByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findDiplomeByPrimaryKey", startResult, maxRows, id);
			return (app.domain.Diplome) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findDiplomeByCollaborateurMatricule
	 *
	 */
	@Transactional
	public Set<Diplome> findDiplomeByCollaborateurMatricule(Integer collaborateurMatricule) throws DataAccessException {

		return findDiplomeByCollaborateurMatricule(collaborateurMatricule, -1, -1);
	}

	/**
	 * JPQL Query - findDiplomeByCollaborateurMatricule
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Diplome> findDiplomeByCollaborateurMatricule(Integer collaborateurMatricule, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findDiplomeByCollaborateurMatricule", startResult, maxRows, collaborateurMatricule);
		return new LinkedHashSet<Diplome>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Diplome entity) {
		return true;
	}
}
