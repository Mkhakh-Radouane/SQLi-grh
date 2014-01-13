package app.domain;

import java.io.Serializable;
import java.lang.StringBuilder;
import java.util.Calendar;
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
		@NamedQuery(name = "findAllCollaborateurs", query = "select myCollaborateur from Collaborateur myCollaborateur"),
		@NamedQuery(name = "findAllManagersRH", query = "select c from Compte cmt   JOIN cmt.managerrhstatus AS mrh  JOIN mrh.collaborateur AS c  where c.matricule IN (select mrh2.collaborateur from ManagerRhStatus mrh2 ) AND mrh.id NOT IN (Select cmt2.managerrhstatus from Compte cmt2) "),
		@NamedQuery(name = "findCollaborateurByAbreviation", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.abreviation = ?1"),
		@NamedQuery(name = "findCollaborateurByAbreviationContaining", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.abreviation like ?1"),
		@NamedQuery(name = "findCollaborateurByActualManagerRh", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.actualManagerRh = ?1"),
		@NamedQuery(name = "findCollaborateurByAncienCollaborateur", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.ancienCollaborateur = ?1"),
		@NamedQuery(name = "findCollaborateurByAncienManagerRh", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.ancienManagerRh = ?1"),
		@NamedQuery(name = "findCollaborateurByDateDepart", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.dateDepart = ?1"),
		@NamedQuery(name = "findCollaborateurByDateEmbauche", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.dateEmbauche = ?1"),
		@NamedQuery(name = "findCollaborateurByDateParticipation", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.dateParticipation = ?1"),
		@NamedQuery(name = "findCollaborateurByEmail", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.email = ?1"),
		@NamedQuery(name = "findCollaborateurByEmailContaining", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.email like ?1"),
		@NamedQuery(name = "findCollaborateurByMatricule", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.matricule = ?1"),
		@NamedQuery(name = "findCollaborateurByMoisBap", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.moisBap = ?1"),
		@NamedQuery(name = "findCollaborateurByNom", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.nom = ?1"),
		@NamedQuery(name = "findCollaborateurByNomContaining", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.nom like ?1"),
		@NamedQuery(name = "findCollaborateurByPrenom", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.prenom = ?1"),
		@NamedQuery(name = "findCollaborateurByPrenomContaining", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.prenom like ?1"),
		@NamedQuery(name = "findCollaborateurByPrimaryKey", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.matricule = ?1"),
		@NamedQuery(name = "findCollaborateurBySeminaireParticipation", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.seminaireParticipation = ?1"),
		@NamedQuery(name = "findCollaborateurBySexe", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.sexe = ?1"),
		@NamedQuery(name = "findCollaborateurBySexeContaining", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.sexe like ?1"),
		@NamedQuery(name = "findCollaborateurBySite", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.site = ?1"),
		@NamedQuery(name = "findCollaborateurBySiteContaining", query = "select myCollaborateur from Collaborateur myCollaborateur where myCollaborateur.site like ?1") })
@Table(catalog = "rh_manager", name = "collaborateur")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "Gestion_ressource_humaine/app/domain", name = "Collaborateur")
@XmlRootElement(namespace = "Gestion_ressource_humaine/app/domain")
public class Collaborateur implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "Matricule", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@XmlElement
	Integer matricule;
	/**
	 */

	@Column(name = "Ancien_Manager_RH")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer ancienManagerRh;
	/**
	 */

	@Column(name = "Actual_Manager_RH")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer actualManagerRh;
	/**
	 */

	@Column(name = "Nom", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String nom;
	/**
	 */

	@Column(name = "Prenom", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String prenom;
	/**
	 */

	@Column(name = "Abreviation", length = 3)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String abreviation;
	/**
	 */

	@Column(name = "Sexe", length = 1)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String sexe;
	/**
	 */

	@Column(name = "Site", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String site;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_embauche")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar dateEmbauche;
	/**
	 */

	@Column(name = "Mois_bap")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Integer moisBap;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_depart")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar dateDepart;
	/**
	 */

	@Column(name = "Ancien_collaborateur")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean ancienCollaborateur;
	/**
	 */

	@Column(name = "Seminaire_participation")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Boolean seminaireParticipation;
	/**
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date_participation")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar dateParticipation;
	/**
	 */

	@Column(name = "Email", length = 254)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "Bu", referencedColumnName = "Id") })
	@XmlTransient
	Bu bu;
	/**
	 */
	@OneToMany(mappedBy = "collaborateur", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<app.domain.Salaire> salaires;

	/**
	 */
	public void setMatricule(Integer matricule) {
		this.matricule = matricule;
	}

	/**
	 */
	public Integer getMatricule() {
		return this.matricule;
	}

	/**
	 */
	public void setAncienManagerRh(Integer ancienManagerRh) {
		this.ancienManagerRh = ancienManagerRh;
	}

	/**
	 */
	public Integer getAncienManagerRh() {
		return this.ancienManagerRh;
	}

	/**
	 */
	public void setActualManagerRh(Integer actualManagerRh) {
		this.actualManagerRh = actualManagerRh;
	}

	/**
	 */
	public Integer getActualManagerRh() {
		return this.actualManagerRh;
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
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 */
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}

	/**
	 */
	public String getAbreviation() {
		return this.abreviation;
	}

	/**
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	/**
	 */
	public String getSexe() {
		return this.sexe;
	}

	/**
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 */
	public String getSite() {
		return this.site;
	}

	/**
	 */
	public void setDateEmbauche(Calendar dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	/**
	 */
	public Calendar getDateEmbauche() {
		return this.dateEmbauche;
	}

	/**
	 */
	public void setMoisBap(Integer moisBap) {
		this.moisBap = moisBap;
	}

	/**
	 */
	public Integer getMoisBap() {
		return this.moisBap;
	}

	/**
	 */
	public void setDateDepart(Calendar dateDepart) {
		this.dateDepart = dateDepart;
	}

	/**
	 */
	public Calendar getDateDepart() {
		return this.dateDepart;
	}

	/**
	 */
	public void setAncienCollaborateur(Boolean ancienCollaborateur) {
		this.ancienCollaborateur = ancienCollaborateur;
	}

	/**
	 */
	public Boolean getAncienCollaborateur() {
		return this.ancienCollaborateur;
	}

	/**
	 */
	public void setSeminaireParticipation(Boolean seminaireParticipation) {
		this.seminaireParticipation = seminaireParticipation;
	}

	/**
	 */
	public Boolean getSeminaireParticipation() {
		return this.seminaireParticipation;
	}

	/**
	 */
	public void setDateParticipation(Calendar dateParticipation) {
		this.dateParticipation = dateParticipation;
	}

	/**
	 */
	public Calendar getDateParticipation() {
		return this.dateParticipation;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setBu(Bu bu) {
		this.bu = bu;
	}

	/**
	 */
	public Bu getBu() {
		return bu;
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
	public Collaborateur() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Collaborateur that) {
		setMatricule(that.getMatricule());
		setAncienManagerRh(that.getAncienManagerRh());
		setActualManagerRh(that.getActualManagerRh());
		setNom(that.getNom());
		setPrenom(that.getPrenom());
		setAbreviation(that.getAbreviation());
		setSexe(that.getSexe());
		setSite(that.getSite());
		setDateEmbauche(that.getDateEmbauche());
		setMoisBap(that.getMoisBap());
		setDateDepart(that.getDateDepart());
		setAncienCollaborateur(that.getAncienCollaborateur());
		setSeminaireParticipation(that.getSeminaireParticipation());
		setDateParticipation(that.getDateParticipation());
		setEmail(that.getEmail());
		setBu(that.getBu());
		setSalaires(new java.util.LinkedHashSet<app.domain.Salaire>(that.getSalaires()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("matricule=[").append(matricule).append("] ");
		buffer.append("ancienManagerRh=[").append(ancienManagerRh).append("] ");
		buffer.append("actualManagerRh=[").append(actualManagerRh).append("] ");
		buffer.append("nom=[").append(nom).append("] ");
		buffer.append("prenom=[").append(prenom).append("] ");
		buffer.append("abreviation=[").append(abreviation).append("] ");
		buffer.append("sexe=[").append(sexe).append("] ");
		buffer.append("site=[").append(site).append("] ");
		buffer.append("dateEmbauche=[").append(dateEmbauche).append("] ");
		buffer.append("moisBap=[").append(moisBap).append("] ");
		buffer.append("dateDepart=[").append(dateDepart).append("] ");
		buffer.append("ancienCollaborateur=[").append(ancienCollaborateur).append("] ");
		buffer.append("seminaireParticipation=[").append(seminaireParticipation).append("] ");
		buffer.append("dateParticipation=[").append(dateParticipation).append("] ");
		buffer.append("email=[").append(email).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((matricule == null) ? 0 : matricule.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Collaborateur))
			return false;
		Collaborateur equalCheck = (Collaborateur) obj;
		if ((matricule == null && equalCheck.matricule != null) || (matricule != null && equalCheck.matricule == null))
			return false;
		if (matricule != null && !matricule.equals(equalCheck.matricule))
			return false;
		return true;
	}
}
