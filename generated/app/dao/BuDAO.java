package app.dao;

import app.domain.Bu;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Bu entities.
 * 
 */
public interface BuDAO extends JpaDao<Bu> {

	/**
	 * JPQL Query - findBuByBuField
	 *
	 */
	public Set<Bu> findBuByBuField(String buField) throws DataAccessException;

	/**
	 * JPQL Query - findBuByBuField
	 *
	 */
	public Set<Bu> findBuByBuField(String buField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBuByPrimaryKey
	 *
	 */
	public Bu findBuByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findBuByPrimaryKey
	 *
	 */
	public Bu findBuByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBuById
	 *
	 */
	public Bu findBuById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findBuById
	 *
	 */
	public Bu findBuById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllBus
	 *
	 */
	public Set<Bu> findAllBus() throws DataAccessException;

	/**
	 * JPQL Query - findAllBus
	 *
	 */
	public Set<Bu> findAllBus(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findBuByBuFieldContaining
	 *
	 */
	public Set<Bu> findBuByBuFieldContaining(String buField_1) throws DataAccessException;

	/**
	 * JPQL Query - findBuByBuFieldContaining
	 *
	 */
	public Set<Bu> findBuByBuFieldContaining(String buField_1, int startResult, int maxRows) throws DataAccessException;

}