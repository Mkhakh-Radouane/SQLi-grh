package app.dao;

import app.domain.TechnologiesMaitrisees;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage TechnologiesMaitrisees entities.
 * 
 */
public interface TechnologiesMaitriseesDAO extends
		JpaDao<TechnologiesMaitrisees> {

	/**
	 * JPQL Query - findTechnologiesMaitriseesByNiveauExpertise
	 *
	 */
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByNiveauExpertise(Integer niveauExpertise) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologiesMaitriseesByNiveauExpertise
	 *
	 */
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByNiveauExpertise(Integer niveauExpertise, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologiesMaitriseesByPrimaryKey
	 *
	 */
	public TechnologiesMaitrisees findTechnologiesMaitriseesByPrimaryKey(Integer technologieField, Integer collaborateur) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologiesMaitriseesByPrimaryKey
	 *
	 */
	public TechnologiesMaitrisees findTechnologiesMaitriseesByPrimaryKey(Integer technologieField, Integer collaborateur, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologiesMaitriseesByTechnologieField
	 *
	 */
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByTechnologieField(Integer technologieField_1) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologiesMaitriseesByTechnologieField
	 *
	 */
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByTechnologieField(Integer technologieField_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTechnologiesMaitriseess
	 *
	 */
	public Set<TechnologiesMaitrisees> findAllTechnologiesMaitriseess() throws DataAccessException;

	/**
	 * JPQL Query - findAllTechnologiesMaitriseess
	 *
	 */
	public Set<TechnologiesMaitrisees> findAllTechnologiesMaitriseess(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologiesMaitriseesByCollaborateur
	 *
	 */
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByCollaborateur(Integer collaborateur_1) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologiesMaitriseesByCollaborateur
	 *
	 */
	public Set<TechnologiesMaitrisees> findTechnologiesMaitriseesByCollaborateur(Integer collaborateur_1, int startResult, int maxRows) throws DataAccessException;

}