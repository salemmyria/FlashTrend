package fr.eisti.cergy.jee.model;
// Generated 19-Nov-2018 06:45:51 by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;

/**
 * NoterCours generated by hbm2java
 */
public class NoterCours implements java.io.Serializable {

	private NoterCoursId id;
	private Cours cours;
	private Utilisateur utilisateur;
	private BigDecimal note;

	public NoterCours() {
	}

	public NoterCours(NoterCoursId id, Cours cours, Utilisateur utilisateur, BigDecimal note) {
		this.id = id;
		this.cours = cours;
		this.utilisateur = utilisateur;
		this.note = note;
	}

	public NoterCoursId getId() {
		return this.id;
	}

	public void setId(NoterCoursId id) {
		this.id = id;
	}

	public Cours getCours() {
		return this.cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public BigDecimal getNote() {
		return this.note;
	}

	public void setNote(BigDecimal note) {
		this.note = note;
	}

}
