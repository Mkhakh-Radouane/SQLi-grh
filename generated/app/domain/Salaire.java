package app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.util.Calendar;
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
@IdClass(app.domain.SalairePK.class)
@Entity
@NamedQueries({
		@NamedQuery(name = "findAllSalaires", query = "select mySalaire from Salaire mySalaire"),
		@NamedQuery(name = "findSalaireByCollaborateurMatricule", query = "select mySalaire from Salaire mySalaire where mySalaire.collaborateurMatricule = ?1"),
		@NamedQuery(name = "findSalaireByDateElevation", query = "select mySalaire from Salaire mySalaire where mySalaire.dateElevation = ?1"),
		@NamedQuery(name = "findSalaireById", query = "select mySalaire from Salaire mySalaire where mySalaire.id = ?1"),
		@NamedQuery(name = "findSalaireByPosteIdPoste", query = "select mySalaire from Salaire mySalaire where mySalaire.posteIdPoste = ?1"),
		@NamedQuery(name = "findSalaireByPrimaryKey", query = "select mySalaire from Salaire mySalaire where mySalaire.id = ?1 and mySalaire.collaborateurMatricule = ?2 and mySalaire.posteIdPoste = ?3"),
		@NamedQuery(name = "findSalaireBySalaireField", query = "select mySalaire from Salaire mySalaire where mySalaire.salaireField = ?1") })
@Table(catalog = "rh_manager", name = "salaire")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Salaire")
public class Salaire implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "id", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer id;
	/**
	 */

	@Column(name = "Collaborateur_Matricule", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer collaborateurMatricule;
	/**
	 */

	@Column(name = "Poste_idPoste", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer posteIdPoste;
	/**
	 */

	@Column(name = "Salaire", precision = 12)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	BigDecimal salaireField;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_elevation")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar dateElevation;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Collaborateur_Matricule", referencedColumnName = "Matricule", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Collaborateur collaborateur;
	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Poste_idPoste", referencedColumnName = "idPoste", nullable = false, insertable = false, updatable = false) })
	@XmlTransient
	Poste poste;

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
	public void setSalaireField(BigDecimal salaireField) {
		this.salaireField = salaireField;
	}

	/**
	 */
	public BigDecimal getSalaireField() {
		return this.salaireField;
	}

	/**
	 */
	public void setDateElevation(Calendar dateElevation) {
		this.dateElevation = dateElevation;
	}

	/**
	 */
	public Calendar getDateElevation() {
		return this.dateElevation;
	}

	/**
	 */
	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}

	/**
	 */
	public Collaborateur getCollaborateur() {
		return collaborateur;
	}

	/**
	 */
	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	/**
	 */
	public Poste getPoste() {
		return poste;
	}

	/**
	 */
	public Salaire() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Salaire that) {
		setId(that.getId());
		setCollaborateurMatricule(that.getCollaborateurMatricule());
		setPosteIdPoste(that.getPosteIdPoste());
		setSalaireField(that.getSalaireField());
		setDateElevation(that.getDateElevation());
		setCollaborateur(that.getCollaborateur());
		setPoste(that.getPoste());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("id=[").append(id).append("] ");
		buffer.append("collaborateurMatricule=[").append(collaborateurMatricule).append("] ");
		buffer.append("posteIdPoste=[").append(posteIdPoste).append("] ");
		buffer.append("salaireField=[").append(salaireField).append("] ");
		buffer.append("dateElevation=[").append(dateElevation).append("] ");

		return buffer.toString();
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
		if (!(obj instanceof Salaire))
			return false;
		Salaire equalCheck = (Salaire) obj;
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
}
