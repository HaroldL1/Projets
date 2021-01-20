package fr.eni.enchereEni.servlets.controlers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.enchereEni.bo.Utilisateur;
import fr.eni.enchereEni.dal.UtilisateurDAO;
import fr.eni.enchereEni.dal.UtilisateurDAOimpl;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
//
//		if (request.getParameter("successCreateUser") != null
//				&& request.getParameter("successCreateUser").equals("1")) {
//
//			request.setAttribute("MessageAjoutUser", "Votre compte vient d'être créé.");
//		}
//		
//		if (request.getParameter("error") != null) {
//
//			request.setAttribute("error", null);
//		}
//		
		request.getServletContext().getRequestDispatcher("/Connexion.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		// ATTRIBUTS
//		String pseudo = request.getParameter("pseudo"); 
//		String mdp = request.getParameter("mdp");
//		
//        // APPEL A L'UTILISATEUR
//		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
//		
//		// CONSERVER LA SESSION
//		HttpSession session = request.getSession();
//		
//		if (pseudo != null && mdp != null) {
//			Utilisateur utilisateur = null;
//		
//			try { 
//			utilisateur = utilisateur.verification
//		} catch (Exception e) {
//			
//		}	
//		}
		
				
			
		
	}
 }
//}
