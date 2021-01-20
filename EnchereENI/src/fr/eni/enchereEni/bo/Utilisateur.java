package fr.eni.enchereEni.bo;

public class Utilisateur {

    // ATTRIBUTS
	private int numeroUtilisateur;  
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String ville;
	private String mdp;
	private String codePostal;
	private int credit;
	
	
	
	/**
	 * CONSTRUCTEUR
	 * @param numeroUtilisateur
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param ville
	 * @param mdp
	 * @param codePostal
	 * @param credit
	 */
	public Utilisateur(int numeroUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String ville, String mdp, String codePostal, int credit) {
		super();
		this.numeroUtilisateur = numeroUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.ville = ville;
		this.mdp = mdp;
		this.codePostal = codePostal;
		this.credit = credit;
	}


   // SETTERS ET GETTERS
	
	public int getNumeroUtilisateur() {
		return numeroUtilisateur;
	}



	public void setNumeroUtilisateur(int numeroUtilisateur) {
		this.numeroUtilisateur = numeroUtilisateur;
	}



	public String getPseudo() {
		return pseudo;
	}



	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getRue() {
		return rue;
	}



	public void setRue(String rue) {
		this.rue = rue;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public String getMdp() {
		return mdp;
	}



	public void setMdp(String mdp) {
		this.mdp = mdp;
	}



	public String getCodePostal() {
		return codePostal;
	}



	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}



	public int getCredit() {
		return credit;
	}



	public void setCredit(int credit) {
		this.credit = credit;
	}
	

	
	
}


