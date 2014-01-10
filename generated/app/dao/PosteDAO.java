package app.dao;

import app.domain.Poste;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Poste entities.
 * 
 */
public interface PosteDAO extends JpaDao<Poste> {

	/**
	 * JPQL Query - findPosteByPrimaryKey
	 *
	 */
	public Poste findPosteByPrimaryKey(Integer idPoste) throws DataAccessException;

	/**
	 * JPQL Query - findPosteByPrimaryKey
	 *
	 */
	public Poste findPosteByPrimaryKey(Integer idPoste, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPostes
	 *
	 */
	public Set<Poste> findAllPostes() throws DataAccessException;

	/**
	 * JPQL Query - findAllPostes
	 *
	 */
	public Set<Poste> findAllPostes(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPosteByPosteField
	 *
	 */
	public Set<Poste> findPosteByPosteField(String posteField) throws DataAccessException;

	/**
	 * JPQL Query - findPosteByPosteField
	 *
	 */
	public Set<Poste> findPosteByPosteField(String posteField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPosteByPosteFieldContaining
	 *
	 */
	public Set<Poste> findPosteByPosteFieldContaining(String posteField_1) throws DataAccessException;

	/**
	 * JPQL Query - findPosteByPosteFieldContaining
	 *
	 */
	public Set<Poste> findPosteByPosteFieldContaining(String posteField_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPosteByIdPoste
	 *
	 */
	public Poste findPosteByIdPoste(Integer idPoste_1) throws DataAccessException;

	/**
	 * JPQL Query - findPosteByIdPoste
	 *
	 */
	public Poste findPosteByIdPoste(Integer idPoste_1, int startResult, int maxRows) throws DataAccessException;

}