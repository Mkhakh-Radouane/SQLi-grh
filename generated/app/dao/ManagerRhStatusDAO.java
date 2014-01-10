package app.dao;

import app.domain.ManagerRhStatus;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage ManagerRhStatus entities.
 * 
 */
public interface ManagerRhStatusDAO extends JpaDao<ManagerRhStatus> {

	/**
	 * JPQL Query - findManagerRhStatusByActivation
	 *
	 */
	public Set<ManagerRhStatus> findManagerRhStatusByActivation(Boolean activation) throws DataAccessException;

	/**
	 * JPQL Query - findManagerRhStatusByActivation
	 *
	 */
	public Set<ManagerRhStatus> findManagerRhStatusByActivation(Boolean activation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findManagerRhStatusByPrimaryKey
	 *
	 */
	public ManagerRhStatus findManagerRhStatusByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findManagerRhStatusByPrimaryKey
	 *
	 */
	public ManagerRhStatus findManagerRhStatusByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findManagerRhStatusByCollaborateur
	 *
	 */
	public Set<ManagerRhStatus> findManagerRhStatusByCollaborateur(Integer collaborateur) throws DataAccessException;

	/**
	 * JPQL Query - findManagerRhStatusByCollaborateur
	 *
	 */
	public Set<ManagerRhStatus> findManagerRhStatusByCollaborateur(Integer collaborateur, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findManagerRhStatusById
	 *
	 */
	public ManagerRhStatus findManagerRhStatusById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findManagerRhStatusById
	 *
	 */
	public ManagerRhStatus findManagerRhStatusById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllManagerRhStatuss
	 *
	 */
	public Set<ManagerRhStatus> findAllManagerRhStatuss() throws DataAccessException;

	/**
	 * JPQL Query - findAllManagerRhStatuss
	 *
	 */
	public Set<ManagerRhStatus> findAllManagerRhStatuss(int startResult, int maxRows) throws DataAccessException;

}