package fr.eni.enchereEni.bo;

import java.sql.Date;



public class Enchere {
	
	// ATTRIBUTS
	private int numeroUtilisateur;
	private int numeroArticle;
	private Date dateEnchere;
	private int montantEnchere;
	
	
	
	/**
	 * CONSTRUCTEUR
	 * @param numeroUtilisateur
	 * @param numeroArticle
	 * @param dateEnchere
	 * @param montantEnchere
	 */
	public Enchere(int numeroUtilisateur, int numeroArticle, Date dateEnchere, int montantEnchere) {
		this.numeroUtilisateur = numeroUtilisateur;
		this.numeroArticle = numeroArticle;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}

	
	public Enchere() {}

	// GETTERS ET SETTERS

	
		


	public int getNumeroUtilisateur() {
		return numeroUtilisateur;
	}



	public void setNumeroUtilisateur(int numeroUtilisateur) {
		this.numeroUtilisateur = numeroUtilisateur;
	}



	public int getNumeroArticle() {
		return numeroArticle;
	}



	public void setNumeroArticle(int numeroArticle) {
		this.numeroArticle = numeroArticle;
	}



	public Date getDateEnchere() {
		return dateEnchere;
	}



	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}



	public int getMontantEnchere() {
		return montantEnchere;
	}



	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}

	
	
	

	public void add(Enchere enchere) {
		
		
	}
	
	
	
	
	
	


	
	
	
	
	

}
