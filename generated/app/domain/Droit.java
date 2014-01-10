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
		@NamedQuery(name = "findAllDroits", query = "select myDroit from Droit myDroit"),
		@NamedQuery(name = "findDroitByDroitField", query = "select myDroit from Droit myDroit where myDroit.droitField = ?1"),
		@NamedQuery(name = "findDroitByDroitFieldContaining", query = "select myDroit from Droit myDroit where myDroit.droitField like ?1"),
		@NamedQuery(name = "findDroitById", query = "select myDroit from Droit myDroit where myDroit.id = ?1"),
		@NamedQuery(name = "findDroitByPrimaryKey", query = "select myDroit from Droit myDroit where myDroit.id = ?1") })
@Table(catalog = "rh_manager", name = "droit")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Droit")
public class Droit implements Serializable {
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

	@Column(name = "Droit", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String droitField;

	/**
	 */
	@ManyToMany(mappedBy = "droits", fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.Profile> profiles;

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
	public void setDroitField(String droitField) {
		this.droitField = droitField;
	}

	/**
	 */
	public String getDroitField() {
		return this.droitField;
	}

	/**
	 */
	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}

	/**
	 */
	public Set<Profile> getProfiles() {
		if (profiles == null) {
			profiles = new java.util.LinkedHashSet<app.domain.Profile>();
		}
		return profiles;
	}

	/**
	 */
	public Droit() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Droit that) {
		setId(that.getId());
		setDroitField(that.getDroitField());
		setProfiles(new java.util.LinkedHashSet<app.domain.Profile>(that.getProfiles()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("droitField=[").append(droitField).append("] ");

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
		if (!(obj instanceof Droit))
			return false;
		Droit equalCheck = (Droit) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
