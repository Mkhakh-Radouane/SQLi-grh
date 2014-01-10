package app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.*;
import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllPostes", query = "select myPoste from Poste myPoste"),
		@NamedQuery(name = "findPosteByIdPoste", query = "select myPoste from Poste myPoste where myPoste.idPoste = ?1"),
		@NamedQuery(name = "findPosteByPosteField", query = "select myPoste from Poste myPoste where myPoste.posteField = ?1"),
		@NamedQuery(name = "findPosteByPosteFieldContaining", query = "select myPoste from Poste myPoste where myPoste.posteField like ?1"),
		@NamedQuery(name = "findPosteByPrimaryKey", query = "select myPoste from Poste myPoste where myPoste.idPoste = ?1") })
@Table(catalog = "rh_manager", name = "poste")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Poste")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Poste implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "idPoste", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer idPoste;
	/**
	 */

	@Column(name = "Poste", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String posteField;

	/**
	 */
	@OneToMany(mappedBy = "poste", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.Salaire> salaires;

	/**
	 */
	public void setIdPoste(Integer idPoste) {
		this.idPoste = idPoste;
	}

	/**
	 */
	public Integer getIdPoste() {
		return this.idPoste;
	}

	/**
	 */
	public void setPosteField(String posteField) {
		this.posteField = posteField;
	}

	/**
	 */
	public String getPosteField() {
		return this.posteField;
	}

	/**
	 */
	public void setSalaires(Set<Salaire> salaires) {
		this.salaires = salaires;
	}

	/**
	 */
	public Set<Salaire> getSalaires() {
		if (salaires == null) {
			salaires = new java.util.LinkedHashSet<app.domain.Salaire>();
		}
		return salaires;
	}

	/**
	 */
	public Poste() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Poste that) {
		setIdPoste(that.getIdPoste());
		setPosteField(that.getPosteField());
		setSalaires(new java.util.LinkedHashSet<app.domain.Salaire>(that.getSalaires()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("idPoste=[").append(idPoste).append("] ");
		buffer.append("posteField=[").append(posteField).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((idPoste == null) ? 0 : idPoste.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Poste))
			return false;
		Poste equalCheck = (Poste) obj;
		if ((idPoste == null && equalCheck.idPoste != null) || (idPoste != null && equalCheck.idPoste == null))
			return false;
		if (idPoste != null && !idPoste.equals(equalCheck.idPoste))
			return false;
		return true;
	}
}
