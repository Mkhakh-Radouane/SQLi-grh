package app.dao;

import app.domain.Compte;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Compte entities.
 * 
 */
public interface CompteDAO extends JpaDao<Compte> {

	/**
	 * JPQL Query - findCompteByLogin
	 *
	 */
	public Set<Compte> findCompteByLogin(String login) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByLogin
	 *
	 */
	public Set<Compte> findCompteByLogin(String login, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByPasswordContaining
	 *
	 */
	public Set<Compte> findCompteByPasswordContaining(String password) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByPasswordContaining
	 *
	 */
	public Set<Compte> findCompteByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByPassword
	 *
	 */
	public Set<Compte> findCompteByPassword(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByPassword
	 *
	 */
	public Set<Compte> findCompteByPassword(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByPrimaryKey
	 *
	 */
	public Compte findCompteByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByPrimaryKey
	 *
	 */
	public Compte findCompteByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllComptes
	 *
	 */
	public Set<Compte> findAllComptes() throws DataAccessException;

	/**
	 * JPQL Query - findAllComptes
	 *
	 */
	public Set<Compte> findAllComptes(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByLoginContaining
	 *
	 */
	public Set<Compte> findCompteByLoginContaining(String login_1) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByLoginContaining
	 *
	 */
	public Set<Compte> findCompteByLoginContaining(String login_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByActivation
	 *
	 */
	public Set<Compte> findCompteByActivation(Boolean activation) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByActivation
	 *
	 */
	public Set<Compte> findCompteByActivation(Boolean activation, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByEmail
	 *
	 */
	public Set<Compte> findCompteByEmail(String email) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByEmail
	 *
	 */
	public Set<Compte> findCompteByEmail(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByEmailContaining
	 *
	 */
	public Set<Compte> findCompteByEmailContaining(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findCompteByEmailContaining
	 *
	 */
	public Set<Compte> findCompteByEmailContaining(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findCompteById
	 *
	 */
	public Compte findCompteById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findCompteById
	 *
	 */
	public Compte findCompteById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}