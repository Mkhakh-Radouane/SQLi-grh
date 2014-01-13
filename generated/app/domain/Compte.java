package app.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllComptes", query = "select myCompte from Compte myCompte"),
		@NamedQuery(name = "findCompteByActivation", query = "select myCompte from Compte myCompte where myCompte.activation = ?1"),
		@NamedQuery(name = "findCompteByEmail", query = "select myCompte from Compte myCompte where myCompte.email = ?1"),
		@NamedQuery(name = "findCompteByEmailContaining", query = "select myCompte from Compte myCompte where myCompte.email like ?1"),
		@NamedQuery(name = "findCompteById", query = "select myCompte from Compte myCompte where myCompte.id = ?1"),
		@NamedQuery(name = "findCompteByLogin", query = "select myCompte from Compte myCompte where myCompte.login = ?1"),
		@NamedQuery(name = "findCompteByLoginContaining", query = "select myCompte from Compte myCompte where myCompte.login like ?1"),
		@NamedQuery(name = "findCompteByPassword", query = "select myCompte from Compte myCompte where myCompte.password = ?1"),
		@NamedQuery(name = "findCompteByPasswordContaining", query = "select myCompte from Compte myCompte where myCompte.password like ?1"),
		@NamedQuery(name = "findCompteByPrimaryKey", query = "select myCompte from Compte myCompte where myCompte.id = ?1") })
@Table(catalog = "rh_manager", name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Compte")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "Login", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String login;
	/**
	 */

	@Column(name = "Password", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 * 
	 */

	@Column(name = "Email", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "Activation")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean activation;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Profile", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Profile profile;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Manager_rh_status_id", referencedColumnName = "Id", nullable = true) })
	@XmlTransient
	ManagerRhStatus managerrhstatus;
	/**
	 */


	/**
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setActivation(Boolean activation) {
		this.activation = activation;
	}

	/**
	 */
	public Boolean getActivation() {
		return this.activation;
	}

	/**
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 */
	public void setManagerRhStatuses(Set<ManagerRhStatus> managerRhStatuses) {
		this.managerRhStatuses = managerRhStatuses;
	}

	/**
	 */
	public Set<ManagerRhStatus> getManagerRhStatuses() {
		if (managerRhStatuses == null) {
			managerRhStatuses = new java.util.LinkedHashSet<app.domain.ManagerRhStatus>();
		}
		return managerRhStatuses;
	}

	/**
	 */
	public Compte() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Compte that) {
		setId(that.getId());
		setLogin(that.getLogin());
		setPassword(that.getPassword());
		setEmail(that.getEmail());
		setActivation(that.getActivation());
		setProfile(that.getProfile());
		setManagerRhStatuses(new java.util.LinkedHashSet<app.domain.ManagerRhStatus>(that.getManagerRhStatuses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("login=[").append(login).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("activation=[").append(activation).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Compte))
			return false;
		Compte equalCheck = (Compte) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
