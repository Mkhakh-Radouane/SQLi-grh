package app.dao;

import app.domain.Ecole;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Ecole entities.
 * 
 */
public interface EcoleDAO extends JpaDao<Ecole> {

	/**
	 * JPQL Query - findEcoleByTypeContaining
	 *
	 */
	public Set<Ecole> findEcoleByTypeContaining(String type) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByTypeContaining
	 *
	 */
	public Set<Ecole> findEcoleByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByNomContaining
	 *
	 */
	public Set<Ecole> findEcoleByNomContaining(String nom) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByNomContaining
	 *
	 */
	public Set<Ecole> findEcoleByNomContaining(String nom, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByNom
	 *
	 */
	public Set<Ecole> findEcoleByNom(String nom_1) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByNom
	 *
	 */
	public Set<Ecole> findEcoleByNom(String nom_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByType
	 *
	 */
	public Set<Ecole> findEcoleByType(String type_1) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByType
	 *
	 */
	public Set<Ecole> findEcoleByType(String type_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByPrimaryKey
	 *
	 */
	public Ecole findEcoleByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleByPrimaryKey
	 *
	 */
	public Ecole findEcoleByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllEcoles
	 *
	 */
	public Set<Ecole> findAllEcoles() throws DataAccessException;

	/**
	 * JPQL Query - findAllEcoles
	 *
	 */
	public Set<Ecole> findAllEcoles(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleById
	 *
	 */
	public Ecole findEcoleById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findEcoleById
	 *
	 */
	public Ecole findEcoleById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}