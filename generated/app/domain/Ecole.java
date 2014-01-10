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
		@NamedQuery(name = "findAllEcoles", query = "select myEcole from Ecole myEcole"),
		@NamedQuery(name = "findEcoleById", query = "select myEcole from Ecole myEcole where myEcole.id = ?1"),
		@NamedQuery(name = "findEcoleByNom", query = "select myEcole from Ecole myEcole where myEcole.nom = ?1"),
		@NamedQuery(name = "findEcoleByNomContaining", query = "select myEcole from Ecole myEcole where myEcole.nom like ?1"),
		@NamedQuery(name = "findEcoleByPrimaryKey", query = "select myEcole from Ecole myEcole where myEcole.id = ?1"),
		@NamedQuery(name = "findEcoleByType", query = "select myEcole from Ecole myEcole where myEcole.type = ?1"),
		@NamedQuery(name = "findEcoleByTypeContaining", query = "select myEcole from Ecole myEcole where myEcole.type like ?1") })
@Table(catalog = "rh_manager", name = "ecole")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Ecole")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Ecole implements Serializable {
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

	@Column(name = "Nom", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String nom;
	/**
	 */

	@Column(name = "Type", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String type;

	/**
	 */
	@OneToMany(mappedBy = "ecole", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.Diplome> diplomes;

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
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 */
	public String getType() {
		return this.type;
	}

	/**
	 */
	public void setDiplomes(Set<Diplome> diplomes) {
		this.diplomes = diplomes;
	}

	/**
	 */
	public Set<Diplome> getDiplomes() {
		if (diplomes == null) {
			diplomes = new java.util.LinkedHashSet<app.domain.Diplome>();
		}
		return diplomes;
	}

	/**
	 */
	public Ecole() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Ecole that) {
		setId(that.getId());
		setNom(that.getNom());
		setType(that.getType());
		setDiplomes(new java.util.LinkedHashSet<app.domain.Diplome>(that.getDiplomes()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("nom=[").append(nom).append("] ");
		buffer.append("type=[").append(type).append("] ");

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
		if (!(obj instanceof Ecole))
			return false;
		Ecole equalCheck = (Ecole) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
