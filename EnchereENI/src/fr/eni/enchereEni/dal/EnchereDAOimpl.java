package fr.eni.enchereEni.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchereEni.bo.Enchere;

public class EnchereDAOimpl implements EnchereDAO {

	@Override
	public List<Enchere> findAll() {
		List<Enchere> encheres = new ArrayList<>();

		try {
			// Connexion
			Connection cnx = ConnectionProvider.getConnection();
			// Requête
			PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM Enchere");
			// Execution
			ResultSet rs = pstmt.executeQuery();
			// Traitement des données

			while (rs.next()) {
				Enchere enchere = new Enchere();
				enchere.setNumeroUtilisateur(rs.getInt("no_utilisateur"));
				enchere.setNumeroArticle(rs.getInt("no_article"));
				enchere.setDateEnchere(rs.getDate("date_enchere"));
				enchere.setMontantEnchere(rs.getInt("montant_enchere"));
				encheres.add(enchere);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return encheres;
	}

}
