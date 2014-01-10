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
		@NamedQuery(name = "findAllTechnologies", query = "select myTechnologie from Technologie myTechnologie"),
		@NamedQuery(name = "findTechnologieById", query = "select myTechnologie from Technologie myTechnologie where myTechnologie.id = ?1"),
		@NamedQuery(name = "findTechnologieByPrimaryKey", query = "select myTechnologie from Technologie myTechnologie where myTechnologie.id = ?1"),
		@NamedQuery(name = "findTechnologieByTechnologieField", query = "select myTechnologie from Technologie myTechnologie where myTechnologie.technologieField = ?1"),
		@NamedQuery(name = "findTechnologieByTechnologieFieldContaining", query = "select myTechnologie from Technologie myTechnologie where myTechnologie.technologieField like ?1") })
@Table(catalog = "rh_manager", name = "technologie")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Technologie")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Technologie implements Serializable {
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

	@Column(name = "Technologie", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String technologieField;

	/**
	 */
	@OneToMany(mappedBy = "technologie", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.TechnologiesMaitrisees> technologiesMaitriseeses;

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
	public void setTechnologieField(String technologieField) {
		this.technologieField = technologieField;
	}

	/**
	 */
	public String getTechnologieField() {
		return this.technologieField;
	}

	/**
	 */
	public void setTechnologiesMaitriseeses(Set<TechnologiesMaitrisees> technologiesMaitriseeses) {
		this.technologiesMaitriseeses = technologiesMaitriseeses;
	}

	/**
	 */
	public Set<TechnologiesMaitrisees> getTechnologiesMaitriseeses() {
		if (technologiesMaitriseeses == null) {
			technologiesMaitriseeses = new java.util.LinkedHashSet<app.domain.TechnologiesMaitrisees>();
		}
		return technologiesMaitriseeses;
	}

	/**
	 */
	public Technologie() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Technologie that) {
		setId(that.getId());
		setTechnologieField(that.getTechnologieField());
		setTechnologiesMaitriseeses(new java.util.LinkedHashSet<app.domain.TechnologiesMaitrisees>(that.getTechnologiesMaitriseeses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("technologieField=[").append(technologieField).append("] ");

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
		if (!(obj instanceof Technologie))
			return false;
		Technologie equalCheck = (Technologie) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
