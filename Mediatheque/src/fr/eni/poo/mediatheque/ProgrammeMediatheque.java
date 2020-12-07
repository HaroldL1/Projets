package fr.eni.poo.mediatheque;

import java.util.ArrayList;





public class ProgrammeMediatheque {
 
	public static void log(Object O) {
	System.out.println(O);
	
	}
	public static void main(String[] args) {
		
		
		// ARRAY LIST
				
		ArrayList<Document> listeDocuments = new ArrayList<Document>();
		
		Livre lv1 = new Livre("Passion chasse ", true, 15, "Jean-Michel Saumonsauvage", 45);
		Livre lv2 = new Livre("Passion asmr ", true, 26, "Jeannette Sauvage", 26);
		
		CD cd1 = new CD("L'acordéon ça fait danser", false, 375, "Yvette Horner", 35);
		CD cd2 = new CD("Dodidadou", true , 122, "Scatman", 15);
		
		DVD  dvd1 = new DVD("Mululon druve", true, 666, "Rick", "1:24", 150); 
		DVD dvd2 = new DVD("La bagarre c'est un art", true, 875,"Rack Juice", "16:9", 180 ); 
		
		
		
		
		
		// DOC CREATION
		
		listeDocuments.add(lv1);
	    listeDocuments.add(lv2);
	    listeDocuments.add(cd1);
	    listeDocuments.add(cd2);
	    listeDocuments.add(dvd1);
	    listeDocuments.add(dvd2);
		
	    
	    
		
		//  DOC LIST AND DISPO
	    
		for (Document document : listeDocuments) {
			
			document.afficher();
			document.disponibiliteDoc();
			}
		
		// System.out.println("obtenir tous les éléments de Arraylist");
		// for (int i = 0; i<arraylist.size(); i++)
		// System.out.println(arraylist.get(i));
		
	
		
		
		
		// PRINT DOC
	   cd1.afficher();
	

	
		
		
		// RENT A DOC
	   
	   cd1.changeDispo();
	   cd1.afficher();
	   
	   
	   
	 
			
	}}
		
		
		
		// RETURN A DOC
			
		
//	}


