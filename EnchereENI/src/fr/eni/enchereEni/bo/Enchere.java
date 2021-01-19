package fr.eni.enchereEni.bo;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Enchere {
	
	
	int numeroUtilisateur;
	int numeroArticle;
	LocalDateTime dateEnchere;
	private int montantEnchere;
	
	
	
	/**
	 * @param numeroUtilisateur
	 * @param numeroArticle
	 * @param dateEnchere
	 * @param montantEnchere
	 */
	public Enchere(int numeroUtilisateur, int numeroArticle, LocalDateTime dateEnchere, int montantEnchere) {
		this.numeroUtilisateur = numeroUtilisateur;
		this.numeroArticle = numeroArticle;
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
	}



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



	public LocalDateTime getDateEnchere() {
		return dateEnchere;
	}



	public void setDateEnchere(LocalDateTime dateEnchere) {
		this.dateEnchere = dateEnchere;
	}



	public int getMontantEnchere() {
		return montantEnchere;
	}



	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	
	
	

	
	
	
	
	

}
