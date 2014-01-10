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
		@NamedQuery(name = "findAllProfiles", query = "select myProfile from Profile myProfile"),
		@NamedQuery(name = "findProfileById", query = "select myProfile from Profile myProfile where myProfile.id = ?1"),
		@NamedQuery(name = "findProfileByPrimaryKey", query = "select myProfile from Profile myProfile where myProfile.id = ?1"),
		@NamedQuery(name = "findProfileByProfileField", query = "select myProfile from Profile myProfile where myProfile.profileField = ?1"),
		@NamedQuery(name = "findProfileByProfileFieldContaining", query = "select myProfile from Profile myProfile where myProfile.profileField like ?1") })
@Table(catalog = "rh_manager", name = "profile")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Profile")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Profile implements Serializable {
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

	@Column(name = "Profile", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String profileField;

	/**
	 */
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(catalog = "rh_manager", name = "profile_droit", joinColumns = { @JoinColumn(name = "Profile", referencedColumnName = "Id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Droit", referencedColumnName = "Id", nullable = false, updatable = false) })
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.Droit> droits;
	/**
	 */
	@OneToMany(mappedBy = "profile", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.Compte> comptes;

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
	public void setProfileField(String profileField) {
		this.profileField = profileField;
	}

	/**
	 */
	public String getProfileField() {
		return this.profileField;
	}

	/**
	 */
	public void setDroits(Set<Droit> droits) {
		this.droits = droits;
	}

	/**
	 */
	public Set<Droit> getDroits() {
		if (droits == null) {
			droits = new java.util.LinkedHashSet<app.domain.Droit>();
		}
		return droits;
	}

	/**
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 */
	public Set<Compte> getComptes() {
		if (comptes == null) {
			comptes = new java.util.LinkedHashSet<app.domain.Compte>();
		}
		return comptes;
	}

	/**
	 */
	public Profile() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Profile that) {
		setId(that.getId());
		setProfileField(that.getProfileField());
		setDroits(new java.util.LinkedHashSet<app.domain.Droit>(that.getDroits()));
		setComptes(new java.util.LinkedHashSet<app.domain.Compte>(that.getComptes()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("profileField=[").append(profileField).append("] ");

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
		if (!(obj instanceof Profile))
			return false;
		Profile equalCheck = (Profile) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
