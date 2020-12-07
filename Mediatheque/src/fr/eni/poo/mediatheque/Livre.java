package fr.eni.poo.mediatheque;

public class Livre extends Document {

	// ATTRIBUTES
	private String auteur;
	private int nbPages;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param nom
	 * @param disponibilite
	 * @param numeroDoc
	 * @param auteur
	 * @param nbPages
	 */
	public Livre(String nom, boolean disponibilite, int numeroDoc, String auteur, int nbPages) {
		super(nom, disponibilite, numeroDoc);
		this.setAuteur(auteur);
		this.setNbPages(nbPages);
	}

	// GETTER AND SETTERS

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	//OVERRIDE METHOD

	@Override
	public void afficher() {
		
		System.out.println("\nL'auteur est : " + this.getAuteur() +  "\nSon nombre de pages est de : " + this.getNbPages() + " pages");
		super.afficher();
	}

	
	
	@Override
	public String toString() {
		return "Livre 1 " + getNom() + "";
	}
	
	

}
