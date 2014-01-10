package app.dao;

import app.domain.Salaire;

import java.math.BigDecimal;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Salaire entities.
 * 
 */
public interface SalaireDAO extends JpaDao<Salaire> {

	/**
	 * JPQL Query - findSalaireByDateElevation
	 *
	 */
	public Set<Salaire> findSalaireByDateElevation(java.util.Calendar dateElevation) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireByDateElevation
	 *
	 */
	public Set<Salaire> findSalaireByDateElevation(Calendar dateElevation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireById
	 *
	 */
	public Set<Salaire> findSalaireById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireById
	 *
	 */
	public Set<Salaire> findSalaireById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireByPosteIdPoste
	 *
	 */
	public Set<Salaire> findSalaireByPosteIdPoste(Integer posteIdPoste) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireByPosteIdPoste
	 *
	 */
	public Set<Salaire> findSalaireByPosteIdPoste(Integer posteIdPoste, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireByCollaborateurMatricule
	 *
	 */
	public Set<Salaire> findSalaireByCollaborateurMatricule(Integer collaborateurMatricule) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireByCollaborateurMatricule
	 *
	 */
	public Set<Salaire> findSalaireByCollaborateurMatricule(Integer collaborateurMatricule, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireByPrimaryKey
	 *
	 */
	public Salaire findSalaireByPrimaryKey(Integer id_1, Integer collaborateurMatricule_1, Integer posteIdPoste_1) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireByPrimaryKey
	 *
	 */
	public Salaire findSalaireByPrimaryKey(Integer id_1, Integer collaborateurMatricule_1, Integer posteIdPoste_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireBySalaireField
	 *
	 */
	public Set<Salaire> findSalaireBySalaireField(java.math.BigDecimal salaireField) throws DataAccessException;

	/**
	 * JPQL Query - findSalaireBySalaireField
	 *
	 */
	public Set<Salaire> findSalaireBySalaireField(BigDecimal salaireField, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllSalaires
	 *
	 */
	public Set<Salaire> findAllSalaires() throws DataAccessException;

	/**
	 * JPQL Query - findAllSalaires
	 *
	 */
	public Set<Salaire> findAllSalaires(int startResult, int maxRows) throws DataAccessException;

}