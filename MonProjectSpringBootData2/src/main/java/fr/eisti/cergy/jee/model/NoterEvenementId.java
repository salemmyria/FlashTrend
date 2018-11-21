package fr.eisti.cergy.jee.model;
// Generated 19-Nov-2018 06:45:51 by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;

/**
 * NoterEvenementId generated by hbm2java
 */
public class NoterEvenementId implements java.io.Serializable {

	private String mailUtilisateur;
	private BigDecimal idEvenement;

	public NoterEvenementId() {
	}

	public NoterEvenementId(String mailUtilisateur, BigDecimal idEvenement) {
		this.mailUtilisateur = mailUtilisateur;
		this.idEvenement = idEvenement;
	}

	public String getMailUtilisateur() {
		return this.mailUtilisateur;
	}

	public void setMailUtilisateur(String mailUtilisateur) {
		this.mailUtilisateur = mailUtilisateur;
	}

	public BigDecimal getIdEvenement() {
		return this.idEvenement;
	}

	public void setIdEvenement(BigDecimal idEvenement) {
		this.idEvenement = idEvenement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NoterEvenementId))
			return false;
		NoterEvenementId castOther = (NoterEvenementId) other;

		return ((this.getMailUtilisateur() == castOther.getMailUtilisateur())
				|| (this.getMailUtilisateur() != null && castOther.getMailUtilisateur() != null
						&& this.getMailUtilisateur().equals(castOther.getMailUtilisateur())))
				&& ((this.getIdEvenement() == castOther.getIdEvenement())
						|| (this.getIdEvenement() != null && castOther.getIdEvenement() != null
								&& this.getIdEvenement().equals(castOther.getIdEvenement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMailUtilisateur() == null ? 0 : this.getMailUtilisateur().hashCode());
		result = 37 * result + (getIdEvenement() == null ? 0 : this.getIdEvenement().hashCode());
		return result;
	}

}
