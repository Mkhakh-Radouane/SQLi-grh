package app.dao;

import app.domain.Niveau;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Niveau entities.
 * 
 */
public interface NiveauDAO extends JpaDao<Niveau> {

	/**
	 * JPQL Query - findNiveauById
	 *
	 */
	public Niveau findNiveauById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findNiveauById
	 *
	 */
	public Niveau findNiveauById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNiveauByPrimaryKey
	 *
	 */
	public Niveau findNiveauByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findNiveauByPrimaryKey
	 *
	 */
	public Niveau findNiveauByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNiveauByNiveauFieldContaining
	 *
	 */
	public Set<Niveau> findNiveauByNiveauFieldContaining(String niveauField) throws DataAccessException;

	/**
	 * JPQL Query - findNiveauByNiveauFieldContaining
	 *
	 */
	public Set<Niveau> findNiveauByNiveauFieldContaining(String niveauField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findNiveauByNiveauField
	 *
	 */
	public Set<Niveau> findNiveauByNiveauField(String niveauField_1) throws DataAccessException;

	/**
	 * JPQL Query - findNiveauByNiveauField
	 *
	 */
	public Set<Niveau> findNiveauByNiveauField(String niveauField_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllNiveaus
	 *
	 */
	public Set<Niveau> findAllNiveaus() throws DataAccessException;

	/**
	 * JPQL Query - findAllNiveaus
	 *
	 */
	public Set<Niveau> findAllNiveaus(int startResult, int maxRows) throws DataAccessException;

}