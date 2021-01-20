package fr.eni.enchereEni.servlets.controlers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.enchereEni.bll.EnchereManager;
import fr.eni.enchereEni.bo.Enchere;

@WebServlet("/acceuil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// renom

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EnchereManager enchereManager = new EnchereManager();
		List<Enchere> encheres = enchereManager.findAll();
		request.setAttribute("encheres", encheres);
		request.getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/Accueil.jsp").forward(request, response);

	}

}
