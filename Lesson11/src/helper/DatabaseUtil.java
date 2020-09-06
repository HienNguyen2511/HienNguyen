package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DatabaseUtil {
    Connection connection = null;

    public DatabaseUtil() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            return;
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://codedidungso.me:3307/LeDucThang", "root", "100000");

        } catch (SQLException e) {
            System.out.println(e);
            return;
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = connection.createStatement();
            System.out.println("Executing query: " + query);
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean updateQuery(String query) {
        try {
            Statement stmt = connection.createStatement();
            System.out.println("Executing query: " + query);
            stmt.execute(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean closeConnection() {
        try {
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }


}
