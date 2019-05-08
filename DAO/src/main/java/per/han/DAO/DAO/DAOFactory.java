package per.han.DAO.DAO;

public class DAOFactory {
    public static DAOProxy getDAO() {
        return new DAOProxy();
    }
}
