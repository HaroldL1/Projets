package fr.eni.enchereEni.dal;

public abstract class DAOFactory {

	public static EnchereDAO getEnchereDAO() {
		return new EnchereDAOimpl();
	}
}
