package fr.eni.enchereEni.bll;

import java.util.List;

import fr.eni.enchereEni.bo.Enchere;
import fr.eni.enchereEni.dal.DAOFactory;

public class EnchereManager {
	
	// Récupère les informations de la base de données
	
	// A besoin d'une liste avec méthode qui renvoie une liste d'articles aux enchères qui renvoie au bo 
	
	public List<Enchere> findAll(){
		return DAOFactory.getEnchereDAO().findAll();
	}
		
		// sous certaines conditions ! connexion


}
