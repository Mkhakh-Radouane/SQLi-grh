package app.dao;

import app.domain.Diplome;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Diplome entities.
 * 
 */
public interface DiplomeDAO extends JpaDao<Diplome> {

	/**
	 * JPQL Query - findAllDiplomes
	 *
	 */
	public Set<Diplome> findAllDiplomes() throws DataAccessException;

	/**
	 * JPQL Query - findAllDiplomes
	 *
	 */
	public Set<Diplome> findAllDiplomes(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByPromotionContaining
	 *
	 */
	public Set<Diplome> findDiplomeByPromotionContaining(String promotion) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByPromotionContaining
	 *
	 */
	public Set<Diplome> findDiplomeByPromotionContaining(String promotion, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeById
	 *
	 */
	public Diplome findDiplomeById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeById
	 *
	 */
	public Diplome findDiplomeById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByPromotion
	 *
	 */
	public Set<Diplome> findDiplomeByPromotion(String promotion_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByPromotion
	 *
	 */
	public Set<Diplome> findDiplomeByPromotion(String promotion_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByPrimaryKey
	 *
	 */
	public Diplome findDiplomeByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByPrimaryKey
	 *
	 */
	public Diplome findDiplomeByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByCollaborateurMatricule
	 *
	 */
	public Set<Diplome> findDiplomeByCollaborateurMatricule(Integer collaborateurMatricule) throws DataAccessException;

	/**
	 * JPQL Query - findDiplomeByCollaborateurMatricule
	 *
	 */
	public Set<Diplome> findDiplomeByCollaborateurMatricule(Integer collaborateurMatricule, int startResult, int maxRows) throws DataAccessException;

}