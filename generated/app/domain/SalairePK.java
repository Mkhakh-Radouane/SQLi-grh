package app.domain;

import java.io.Serializable;

import javax.persistence.Id;

import javax.persistence.*;

/**
 */
public class SalairePK implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	public SalairePK() {
	}

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer id;
	/**
	 */

	@Column(name = "Collaborateur_Matricule", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer collaborateurMatricule;
	/**
	 */

	@Column(name = "Poste_idPoste", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	public Integer posteIdPoste;

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
	public void setCollaborateurMatricule(Integer collaborateurMatricule) {
		this.collaborateurMatricule = collaborateurMatricule;
	}

	/**
	 */
	public Integer getCollaborateurMatricule() {
		return this.collaborateurMatricule;
	}

	/**
	 */
	public void setPosteIdPoste(Integer posteIdPoste) {
		this.posteIdPoste = posteIdPoste;
	}

	/**
	 */
	public Integer getPosteIdPoste() {
		return this.posteIdPoste;
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((id == null) ? 0 : id.hashCode()));
		result = (int) (prime * result + ((collaborateurMatricule == null) ? 0 : collaborateurMatricule.hashCode()));
		result = (int) (prime * result + ((posteIdPoste == null) ? 0 : posteIdPoste.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof SalairePK))
			return false;
		SalairePK equalCheck = (SalairePK) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		if ((collaborateurMatricule == null && equalCheck.collaborateurMatricule != null) || (collaborateurMatricule != null && equalCheck.collaborateurMatricule == null))
			return false;
		if (collaborateurMatricule != null && !collaborateurMatricule.equals(equalCheck.collaborateurMatricule))
			return false;
		if ((posteIdPoste == null && equalCheck.posteIdPoste != null) || (posteIdPoste != null && equalCheck.posteIdPoste == null))
			return false;
		if (posteIdPoste != null && !posteIdPoste.equals(equalCheck.posteIdPoste))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("SalairePK");
		sb.append(" id: ").append(getId());
		sb.append(" collaborateurMatricule: ").append(getCollaborateurMatricule());
		sb.append(" posteIdPoste: ").append(getPosteIdPoste());
		return sb.toString();
	}
}
