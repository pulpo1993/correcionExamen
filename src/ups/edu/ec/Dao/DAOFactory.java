package ups.edu.ec.Dao;

import ups.edu.ec.Jpa.JPADAOFactory;

public abstract class DAOFactory {
	protected static DAOFactory factory = new JPADAOFactory();

	public static DAOFactory getFactory() {
		return factory;
	}

	public abstract CapituloDAO getTargetaDAO();

	public abstract LibroDAO getPedidoDAO();

	public abstract AutorDAO getComidaDAO();

}
