package per.han.DAO.DAO;

/**
 * Connect db_connection and close db_connection
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_Connect {

    private final String DriverName = "com.mysql.jdbc.Driver";
    private final String Url = "jdbc:mysql://localhost:3306/register";
    private final String db_user = "root";
    private final String password = "admin";

    private Connection connect = null;

    public db_Connect() {
        try {
            Class.forName(DriverName);
            this.connect = DriverManager.getConnection(Url, db_user, password);
            System.out.println("SUCCESS!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("\nFail!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnect() {
        return this.connect;
    }

    public void turnOff() {
        try {
            connect.close();
            System.out.println("SUCCESS!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Fail!");
        }
    }
}
