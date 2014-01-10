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

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllDiplomes", query = "select myDiplome from Diplome myDiplome"),
		@NamedQuery(name = "findDiplomeByCollaborateurMatricule", query = "select myDiplome from Diplome myDiplome where myDiplome.collaborateurMatricule = ?1"),
		@NamedQuery(name = "findDiplomeById", query = "select myDiplome from Diplome myDiplome where myDiplome.id = ?1"),
		@NamedQuery(name = "findDiplomeByPrimaryKey", query = "select myDiplome from Diplome myDiplome where myDiplome.id = ?1"),
		@NamedQuery(name = "findDiplomeByPromotion", query = "select myDiplome from Diplome myDiplome where myDiplome.promotion = ?1"),
		@NamedQuery(name = "findDiplomeByPromotionContaining", query = "select myDiplome from Diplome myDiplome where myDiplome.promotion like ?1") })
@Table(catalog = "rh_manager", name = "diplome")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Diplome")
public class Diplome implements Serializable {
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

	@Column(name = "Promotion", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String promotion;
	/**
	 */

	@Column(name = "Collaborateur_Matricule", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer collaborateurMatricule;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Ecole", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Ecole ecole;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Niveau", referencedColumnName = "Id", nullable = false) })
	@XmlTransient
	Niveau niveau;

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
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	/**
	 */
	public String getPromotion() {
		return this.promotion;
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
	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	/**
	 */
	public Ecole getEcole() {
		return ecole;
	}

	/**
	 */
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	/**
	 */
	public Niveau getNiveau() {
		return niveau;
	}

	/**
	 */
	public Diplome() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Diplome that) {
		setId(that.getId());
		setPromotion(that.getPromotion());
		setCollaborateurMatricule(that.getCollaborateurMatricule());
		setEcole(that.getEcole());
		setNiveau(that.getNiveau());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("promotion=[").append(promotion).append("] ");
		buffer.append("collaborateurMatricule=[").append(collaborateurMatricule).append("] ");

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
		if (!(obj instanceof Diplome))
			return false;
		Diplome equalCheck = (Diplome) obj;
		if ((id == null && equalCheck.id != null) || (id != null && equalCheck.id == null))
			return false;
		if (id != null && !id.equals(equalCheck.id))
			return false;
		return true;
	}
}
