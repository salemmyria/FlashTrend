package fr.eisti.cergy.jee.model;
// Generated 19-Nov-2018 06:45:51 by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;

/**
 * NoterCoursId generated by hbm2java
 */
public class NoterCoursId implements java.io.Serializable {

	private String mailUtilisateur;
	private BigDecimal idCours;

	public NoterCoursId() {
	}

	public NoterCoursId(String mailUtilisateur, BigDecimal idCours) {
		this.mailUtilisateur = mailUtilisateur;
		this.idCours = idCours;
	}

	public String getMailUtilisateur() {
		return this.mailUtilisateur;
	}

	public void setMailUtilisateur(String mailUtilisateur) {
		this.mailUtilisateur = mailUtilisateur;
	}

	public BigDecimal getIdCours() {
		return this.idCours;
	}

	public void setIdCours(BigDecimal idCours) {
		this.idCours = idCours;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NoterCoursId))
			return false;
		NoterCoursId castOther = (NoterCoursId) other;

		return ((this.getMailUtilisateur() == castOther.getMailUtilisateur())
				|| (this.getMailUtilisateur() != null && castOther.getMailUtilisateur() != null
						&& this.getMailUtilisateur().equals(castOther.getMailUtilisateur())))
				&& ((this.getIdCours() == castOther.getIdCours()) || (this.getIdCours() != null
						&& castOther.getIdCours() != null && this.getIdCours().equals(castOther.getIdCours())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMailUtilisateur() == null ? 0 : this.getMailUtilisateur().hashCode());
		result = 37 * result + (getIdCours() == null ? 0 : this.getIdCours().hashCode());
		return result;
	}

}