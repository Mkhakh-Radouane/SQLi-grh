package app.dao;

import app.domain.Profile;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Profile entities.
 * 
 */
public interface ProfileDAO extends JpaDao<Profile> {

	/**
	 * JPQL Query - findProfileByProfileFieldContaining
	 *
	 */
	public Set<Profile> findProfileByProfileFieldContaining(String profileField) throws DataAccessException;

	/**
	 * JPQL Query - findProfileByProfileFieldContaining
	 *
	 */
	public Set<Profile> findProfileByProfileFieldContaining(String profileField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProfileByPrimaryKey
	 *
	 */
	public Profile findProfileByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findProfileByPrimaryKey
	 *
	 */
	public Profile findProfileByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProfileById
	 *
	 */
	public Profile findProfileById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findProfileById
	 *
	 */
	public Profile findProfileById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findProfileByProfileField
	 *
	 */
	public Set<Profile> findProfileByProfileField(String profileField_1) throws DataAccessException;

	/**
	 * JPQL Query - findProfileByProfileField
	 *
	 */
	public Set<Profile> findProfileByProfileField(String profileField_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllProfiles
	 *
	 */
	public Set<Profile> findAllProfiles() throws DataAccessException;

	/**
	 * JPQL Query - findAllProfiles
	 *
	 */
	public Set<Profile> findAllProfiles(int startResult, int maxRows) throws DataAccessException;

}