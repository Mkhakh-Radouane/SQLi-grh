package app.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllManagerRhStatuss", query = "select myManagerRhStatus from ManagerRhStatus myManagerRhStatus"),
		@NamedQuery(name = "findManagerRhStatusByActivation", query = "select myManagerRhStatus from ManagerRhStatus myManagerRhStatus where myManagerRhStatus.activation = ?1"),
		@NamedQuery(name = "findManagerRhStatusByCollaborateur", query = "select myManagerRhStatus from ManagerRhStatus myManagerRhStatus where myManagerRhStatus.collaborateur = ?1"),
		@NamedQuery(name = "findManagerRhStatusById", query = "select myManagerRhStatus from ManagerRhStatus myManagerRhStatus where myManagerRhStatus.id = ?1"),
		@NamedQuery(name = "findManagerRhStatusByPrimaryKey", query = "select myManagerRhStatus from ManagerRhStatus myManagerRhStatus where myManagerRhStatus.id = ?1") })
@Table(catalog = "rh_manager", name = "manager_rh_status")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "ManagerRhStatus")
public class ManagerRhStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "Collaborateur", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer collaborateur;
	/**
	 */

	@Column(name = "Activation")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean activation;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Compte", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Compte compte;

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
	public void setCollaborateur(Integer collaborateur) {
		this.collaborateur = collaborateur;
	}

	/**
	 */
	public Integer getCollaborateur() {
		return this.collaborateur;
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
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	/**
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 */
	public ManagerRhStatus() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(ManagerRhStatus that) {
		setId(that.getId());
		setCollaborateur(that.getCollaborateur());
		setActivation(that.getActivation());
		setCompte(that.getCompte());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("collaborateur=[").append(collaborateur).append("] ");
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
		if (!(obj instanceof ManagerRhStatus))
			return false;
		ManagerRhStatus equalCheck = (ManagerRhStatus) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
