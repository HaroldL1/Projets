package fr.eni.poo.mediatheque;

import java.util.Date;
import java.text.DateFormat;

public abstract class Document {

	// ATTRIBUTES

	private String nom;
	private boolean disponibilite = true;
	private int numeroDoc;
	private Date date;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param nom
	 * @param disponibilite
	 * @param numeroDoc
	 */

	public Document(String nom, boolean disponibilite, int numeroDoc) {
		this.nom = nom;
		this.disponibilite = disponibilite;
		this.numeroDoc = numeroDoc;
	}

	// SETTERS ET GETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}

	public int getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(int numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	// DISPLAY METHOD

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void afficher() {
		DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		String date = "Non renseigné";
		if (this.getDate() != null) {
			date = shortDateFormat.format(this.getDate());
		}
		System.out.println("Le document que vous souhaitez se nomme :\s " + this.getNom()
				+ "\s\nSa disponibilité est : " + this.isDisponibilite() + "\s\nSon numéro est : n°"
				+ this.getNumeroDoc() + " \n DATE d'emprunt ou de retour :" + date + "\n");

	}

	// DISPO METHOD

	public void disponibiliteDoc() {
		if (this.disponibilite == false) {
			System.out.println(" Le document est déjà emprunté !");
		} else {
			System.out.println("Le document est disponible");
		}
	}

	// UPDATE METHOD

	public void updateDate() {
		this.date = new Date();
	}

	// CHANGE DISPO METHOD

	public void changeDispo() {
		if (this.disponibilite == true) {
			this.setDisponibilite(false);

		} else {
			this.setDisponibilite(true);

		}

		this.updateDate();

	}
}
