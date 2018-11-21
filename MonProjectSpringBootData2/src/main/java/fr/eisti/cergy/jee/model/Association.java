package fr.eisti.cergy.jee.model;
// Generated 19-Nov-2018 06:45:51 by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Association generated by hbm2java
 */
public class Association implements java.io.Serializable {

	private Long idAssociation;
	private String nomAssociation;
	private String mdpAssociation;
	private double moyenneAssociation;
	private Set<NoterAssociation> noterAssociations = new HashSet<NoterAssociation>(0);

	public Association() {
	}

	public Association(Long idAssociation, String nomAssociation, String mdpAssociation, double moyenneAssociation) {
		this.idAssociation = idAssociation;
		this.nomAssociation = nomAssociation;
		this.mdpAssociation = mdpAssociation;
		this.moyenneAssociation = moyenneAssociation;
	}

	public Association(Long idAssociation, String nomAssociation, String mdpAssociation, double moyenneAssociation, Set<NoterAssociation> noterAssociations) {
		this.idAssociation = idAssociation;
		this.nomAssociation = nomAssociation;
		this.mdpAssociation = mdpAssociation;
		this.moyenneAssociation = moyenneAssociation;
		this.noterAssociations = noterAssociations;
	}

	public Long getIdAssociation() {
		return this.idAssociation;
	}

	public void setIdAssociation(Long idAssociation) {
		this.idAssociation = idAssociation;
	}

	public String getNomAssociation() {
		return this.nomAssociation;
	}

	public void setNomAssociation(String nomAssociation) {
		this.nomAssociation = nomAssociation;
	}

	public String getMdpAssociation() {
		return this.mdpAssociation;
	}

	public void setMdpAssociation(String mdpAssociation) {
		this.mdpAssociation = mdpAssociation;
	}

	public double getMoyenneAssociation() {
		return this.moyenneAssociation;
	}

	public void setMoyenneAssociation(double moyenneAssociation) {
		this.moyenneAssociation = moyenneAssociation;
	}

	public Set<NoterAssociation> getNoterAssociations() {
		return this.noterAssociations;
	}

	public void setNoterAssociations(Set<NoterAssociation> noterAssociations) {
		this.noterAssociations = noterAssociations;
	}

}