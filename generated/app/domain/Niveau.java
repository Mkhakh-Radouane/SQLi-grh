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
		@NamedQuery(name = "findAllNiveaus", query = "select myNiveau from Niveau myNiveau"),
		@NamedQuery(name = "findNiveauById", query = "select myNiveau from Niveau myNiveau where myNiveau.id = ?1"),
		@NamedQuery(name = "findNiveauByNiveauField", query = "select myNiveau from Niveau myNiveau where myNiveau.niveauField = ?1"),
		@NamedQuery(name = "findNiveauByNiveauFieldContaining", query = "select myNiveau from Niveau myNiveau where myNiveau.niveauField like ?1"),
		@NamedQuery(name = "findNiveauByPrimaryKey", query = "select myNiveau from Niveau myNiveau where myNiveau.id = ?1") })
@Table(catalog = "rh_manager", name = "niveau")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Niveau")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Niveau implements Serializable {
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

	@Column(name = "Niveau", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String niveauField;

	/**
	 */
	@OneToMany(mappedBy = "niveau", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
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
	public void setNiveauField(String niveauField) {
		this.niveauField = niveauField;
	}

	/**
	 */
	public String getNiveauField() {
		return this.niveauField;
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
	public Niveau() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Niveau that) {
		setId(that.getId());
		setNiveauField(that.getNiveauField());
		setDiplomes(new java.util.LinkedHashSet<app.domain.Diplome>(that.getDiplomes()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("niveauField=[").append(niveauField).append("] ");

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
		if (!(obj instanceof Niveau))
			return false;
		Niveau equalCheck = (Niveau) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
