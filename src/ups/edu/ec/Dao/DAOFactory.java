package ups.edu.ec.Dao;

import ups.edu.ec.Jpa.JPADAOFactory;

public abstract class DAOFactory {
	protected static DAOFactory factory = new JPADAOFactory();

	public static DAOFactory getFactory() {
		return factory;
	}

	public abstract CapituloDAO getCapituloDAO();

	public abstract LibroDAO getLibroDAO();

	public abstract AutorDAO getAutorDAO();

	public static DAOFactory getDaoFactory() {
		// TODO Auto-generated method stub
		return null;
	}

}
