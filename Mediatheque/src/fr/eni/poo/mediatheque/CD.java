package fr.eni.poo.mediatheque;

public class CD extends Document {
	
	// ATTRIBUTES
	
	private String NomGroupe;
	private int NbPistes;
	
	
	/**
	 * CONSTRUCTOR
	 * @param nom
	 * @param disponibilite
	 * @param numeroDoc
	 * @param nomGroupe
	 * @param nbPistes
	 */
	public CD(String nom, boolean disponibilite, int numeroDoc, String nomGroupe, int nbPistes) {
		super(nom, disponibilite, numeroDoc);
		NomGroupe = nomGroupe;
		NbPistes = nbPistes;
	}

	
	//GETTERS AND SETTERS


	/**
	 * @return the nomGroupe
	 */
	public String getNomGroupe() {
		return NomGroupe;
	}

	/**
	 * @param nomGroupe the nomGroupe to set
	 */
	public void setNomGroupe(String nomGroupe) {
		NomGroupe = nomGroupe;
	}

	/**
	 * @return the nbPistes
	 */
	public int getNbPistes() {
		return NbPistes;
	}

	/**
	 * @param nbPistes the nbPistes to set
	 */
	public void setNbPistes(int nbPistes) {
		NbPistes = nbPistes;
	}

    // OVERRIDE afficher METHOD
	@Override
	public void afficher() {
	System.out.println("Le nom de l'artiste que vous souhaitez est : " + this.getNomGroupe() +  "\nL'album est composée de : " + this.getNbPistes() + " pistes");
		super.afficher();
	}
	
	
	
	
	

}
