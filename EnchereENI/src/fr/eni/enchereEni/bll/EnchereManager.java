package fr.eni.enchereEni.bll;

import java.util.List;

import fr.eni.enchereEni.bo.Enchere;
import fr.eni.enchereEni.dal.DAOFactory;

public class EnchereManager {
	
	// R�cup�re les informations de la base de donn�es
	
	// A besoin d'une liste avec m�thode qui renvoie une liste d'articles aux ench�res qui renvoie au bo 
	
	public List<Enchere> findAll(){
		return DAOFactory.getEnchereDAO().findAll();
	}
		
		// sous certaines conditions ! connexion


}
