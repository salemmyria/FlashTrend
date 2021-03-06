package fr.eisti.cergy.jee.model;
// Generated 19-Nov-2018 06:45:51 by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Utilisateur generated by hbm2java
 */
public class Utilisateur implements java.io.Serializable {

	private String mail;
	private String nom;
	private String prenom;
	private String mdp;
	private Set<NoterAssociation> noterAssociations = new HashSet<NoterAssociation>(0);
	private Set<NoterEvenement> noterEvenements = new HashSet<NoterEvenement>(0);
	private Set<NoterCours> noterCourses = new HashSet<NoterCours>(0);

	public Utilisateur() {
	}

	public Utilisateur(String mail, String nom, String prenom, String mdp) {
		this.mail = mail;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
	}

	public Utilisateur(String mail, String nom, String prenom, String mdp, Set<NoterAssociation> noterAssociations,
			Set<NoterEvenement> noterEvenements, Set<NoterCours> noterCourses) {
		this.mail = mail;
		this.nom = nom;
		this.prenom = prenom;
		this.mdp = mdp;
		this.noterAssociations = noterAssociations;
		this.noterEvenements = noterEvenements;
		this.noterCourses = noterCourses;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Set<NoterAssociation> getNoterAssociations() {
		return this.noterAssociations;
	}

	public void setNoterAssociations(Set<NoterAssociation> noterAssociations) {
		this.noterAssociations = noterAssociations;
	}

	public Set<NoterEvenement> getNoterEvenements() {
		return this.noterEvenements;
	}

	public void setNoterEvenements(Set<NoterEvenement> noterEvenements) {
		this.noterEvenements = noterEvenements;
	}

	public Set<NoterCours> getNoterCourses() {
		return this.noterCourses;
	}

	public void setNoterCourses(Set<NoterCours> noterCourses) {
		this.noterCourses = noterCourses;
	}

}
