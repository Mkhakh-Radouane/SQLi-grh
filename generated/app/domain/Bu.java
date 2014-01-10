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
		@NamedQuery(name = "findAllBus", query = "select myBu from Bu myBu"),
		@NamedQuery(name = "findBuByBuField", query = "select myBu from Bu myBu where myBu.buField = ?1"),
		@NamedQuery(name = "findBuByBuFieldContaining", query = "select myBu from Bu myBu where myBu.buField like ?1"),
		@NamedQuery(name = "findBuById", query = "select myBu from Bu myBu where myBu.id = ?1"),
		@NamedQuery(name = "findBuByPrimaryKey", query = "select myBu from Bu myBu where myBu.id = ?1") })
@Table(catalog = "rh_manager", name = "bu")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Bu")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Bu implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "Id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "BU", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String buField;

	/**
	 */
	@OneToMany(mappedBy = "bu", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.Collaborateur> collaborateurs;

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
	public void setBuField(String buField) {
		this.buField = buField;
	}

	/**
	 */
	public String getBuField() {
		return this.buField;
	}

	/**
	 */
	public void setCollaborateurs(Set<Collaborateur> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}

	/**
	 */
	public Set<Collaborateur> getCollaborateurs() {
		if (collaborateurs == null) {
			collaborateurs = new java.util.LinkedHashSet<app.domain.Collaborateur>();
		}
		return collaborateurs;
	}

	/**
	 */
	public Bu() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Bu that) {
		setId(that.getId());
		setBuField(that.getBuField());
		setCollaborateurs(new java.util.LinkedHashSet<app.domain.Collaborateur>(that.getCollaborateurs()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("buField=[").append(buField).append("] ");

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
		if (!(obj instanceof Bu))
			return false;
		Bu equalCheck = (Bu) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
