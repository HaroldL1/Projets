package fr.eni.poo.mediatheque;



public class DVD extends Document {

	// ATRIBUTES

	private String NomReal;
	private String Format;
	private int Duree;

	/**
	 * CONSTRUCTOR
	 * 
	 * @param nom
	 * @param disponibilite
	 * @param numeroDoc
	 * @param nomReal
	 * @param format
	 * @param duree
	 */
	public DVD(String nom, boolean disponibilite, int numeroDoc, String nomReal, String format, int duree) {
		super(nom, disponibilite, numeroDoc);
		NomReal = nomReal;
		Format = format;
		Duree = duree;
	}

	/**
	 * @return the nomReal
	 */
	public String getNomReal() {
		return NomReal;
	}

	/**
	 * @param nomReal the nomReal to set
	 */
	public void setNomReal(String nomReal) {
		NomReal = nomReal;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return Format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		Format = format;
	}

	/**
	 * @return the duree
	 */
	public int getDuree() {
		return Duree;
	}

	/**
	 * @param duree the duree to set
	 */
	public void setDuree(int duree) {
		Duree = duree;
	}
	
    // OVERRIDE METHOD
	@Override
	public void afficher() {
		System.out.println("\nLe nom des son réalisateur est :" + this.getNomReal() + "\nSon format est de : " + this.getFormat() +  "\nSa durée est de : " + this.Duree + "min");
		super.afficher();
	}
	
	

}
