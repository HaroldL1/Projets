package fr.eni.enchereEni.dal;

import java.util.List;

import fr.eni.enchereEni.bo.Utilisateur;

public class UtilisateurDAOimpl implements UtilisateurDAO {

	private final static String RECHERCHER = "select * from UTILISATEURS where pseudo = ? and mot_de_passe = ?;";
	
	
}
