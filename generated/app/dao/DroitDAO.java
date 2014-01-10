package app.dao;

import app.domain.Droit;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Droit entities.
 * 
 */
public interface DroitDAO extends JpaDao<Droit> {

	/**
	 * JPQL Query - findAllDroits
	 *
	 */
	public Set<Droit> findAllDroits() throws DataAccessException;

	/**
	 * JPQL Query - findAllDroits
	 *
	 */
	public Set<Droit> findAllDroits(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDroitByDroitFieldContaining
	 *
	 */
	public Set<Droit> findDroitByDroitFieldContaining(String droitField) throws DataAccessException;

	/**
	 * JPQL Query - findDroitByDroitFieldContaining
	 *
	 */
	public Set<Droit> findDroitByDroitFieldContaining(String droitField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDroitByPrimaryKey
	 *
	 */
	public Droit findDroitByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findDroitByPrimaryKey
	 *
	 */
	public Droit findDroitByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDroitById
	 *
	 */
	public Droit findDroitById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findDroitById
	 *
	 */
	public Droit findDroitById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findDroitByDroitField
	 *
	 */
	public Set<Droit> findDroitByDroitField(String droitField_1) throws DataAccessException;

	/**
	 * JPQL Query - findDroitByDroitField
	 *
	 */
	public Set<Droit> findDroitByDroitField(String droitField_1, int startResult, int maxRows) throws DataAccessException;

}