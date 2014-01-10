package app.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class TechnologiesMaitriseesPK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public TechnologiesMaitriseesPK() {
	}

	/**
	 */

	@Column(name = "Technologie", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer technologieField;
	/**
	 */

	@Column(name = "Collaborateur", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer collaborateur;

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
		if (!(obj instanceof TechnologiesMaitriseesPK))
			return false;
		TechnologiesMaitriseesPK equalCheck = (TechnologiesMaitriseesPK) obj;
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("TechnologiesMaitriseesPK");
		sb.append(" technologieField: ").append(getTechnologieField());
		sb.append(" collaborateur: ").append(getCollaborateur());
		return sb.toString();
	}
}
