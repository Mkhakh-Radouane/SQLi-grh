package app.dao;

import app.domain.Technologie;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Technologie entities.
 * 
 */
public interface TechnologieDAO extends JpaDao<Technologie> {

	/**
	 * JPQL Query - findAllTechnologies
	 *
	 */
	public Set<Technologie> findAllTechnologies() throws DataAccessException;

	/**
	 * JPQL Query - findAllTechnologies
	 *
	 */
	public Set<Technologie> findAllTechnologies(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieByTechnologieFieldContaining
	 *
	 */
	public Set<Technologie> findTechnologieByTechnologieFieldContaining(String technologieField) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieByTechnologieFieldContaining
	 *
	 */
	public Set<Technologie> findTechnologieByTechnologieFieldContaining(String technologieField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieByPrimaryKey
	 *
	 */
	public Technologie findTechnologieByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieByPrimaryKey
	 *
	 */
	public Technologie findTechnologieByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieById
	 *
	 */
	public Technologie findTechnologieById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieById
	 *
	 */
	public Technologie findTechnologieById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieByTechnologieField
	 *
	 */
	public Set<Technologie> findTechnologieByTechnologieField(String technologieField_1) throws DataAccessException;

	/**
	 * JPQL Query - findTechnologieByTechnologieField
	 *
	 */
	public Set<Technologie> findTechnologieByTechnologieField(String technologieField_1, int startResult, int maxRows) throws DataAccessException;

}