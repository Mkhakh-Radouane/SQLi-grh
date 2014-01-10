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
@IdClass(app.domain.TechnologiesMaitriseesPK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllTechnologiesMaitriseess", query = "select myTechnologiesMaitrisees from TechnologiesMaitrisees myTechnologiesMaitrisees"),
		@NamedQuery(name = "findTechnologiesMaitriseesByCollaborateur", query = "select myTechnologiesMaitrisees from TechnologiesMaitrisees myTechnologiesMaitrisees where myTechnologiesMaitrisees.collaborateur = ?1"),
		@NamedQuery(name = "findTechnologiesMaitriseesByNiveauExpertise", query = "select myTechnologiesMaitrisees from TechnologiesMaitrisees myTechnologiesMaitrisees where myTechnologiesMaitrisees.niveauExpertise = ?1"),
		@NamedQuery(name = "findTechnologiesMaitriseesByPrimaryKey", query = "select myTechnologiesMaitrisees from TechnologiesMaitrisees myTechnologiesMaitrisees where myTechnologiesMaitrisees.technologieField = ?1 and myTechnologiesMaitrisees.collaborateur = ?2"),
		@NamedQuery(name = "findTechnologiesMaitriseesByTechnologieField", query = "select myTechnologiesMaitrisees from TechnologiesMaitrisees myTechnologiesMaitrisees where myTechnologiesMaitrisees.technologieField = ?1") })
@Table(catalog = "rh_manager", name = "technologies_maitrisees")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "TechnologiesMaitrisees")
public class TechnologiesMaitrisees implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "Technologie", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer technologieField;
	/**
	 */

	@Column(name = "Collaborateur", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer collaborateur;
	/**
	 */

	@Column(name = "niveau_expertise")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer niveauExpertise;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Technologie", referencedColumnName = "Id", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Technologie technologie;

	/**
	 */
	public void setTechnologieField(Integer technologieField) {
		this.technologieField = technologieField;
	}

	/**
	 */
	public Integer getTechnologieField() {
		return this.technologieField;
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
	public void setNiveauExpertise(Integer niveauExpertise) {
		this.niveauExpertise = niveauExpertise;
	}

	/**
	 */
	public Integer getNiveauExpertise() {
		return this.niveauExpertise;
	}

	/**
	 */
	public void setTechnologie(Technologie technologie) {
		this.technologie = technologie;
	}

	/**
	 */
	public Technologie getTechnologie() {
		return technologie;
	}

	/**
	 */
	public TechnologiesMaitrisees() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(TechnologiesMaitrisees that) {
		setTechnologieField(that.getTechnologieField());
		setCollaborateur(that.getCollaborateur());
		setNiveauExpertise(that.getNiveauExpertise());
		setTechnologie(that.getTechnologie());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("technologieField=[").append(technologieField).append("] ");
		buffer.append("collaborateur=[").append(collaborateur).append("] ");
		buffer.append("niveauExpertise=[").append(niveauExpertise).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((technologieField == null) ? 0 : technologieField.hashCode()));
		result = (int) (prime * result + ((collaborateur == null) ? 0 : collaborateur.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof TechnologiesMaitrisees))
			return false;
		TechnologiesMaitrisees equalCheck = (TechnologiesMaitrisees) obj;
		if ((technologieField == null && equalCheck.technologieField != null) || (technologieField != null && equalCheck.technologieField == null))
			return false;
		if (technologieField != null && !technologieField.equals(equalCheck.technologieField))
			return false;
		if ((collaborateur == null && equalCheck.collaborateur != null) || (collaborateur != null && equalCheck.collaborateur == null))
			return false;
		if (collaborateur != null && !collaborateur.equals(equalCheck.collaborateur))
			return false;
		return true;
	}
}
