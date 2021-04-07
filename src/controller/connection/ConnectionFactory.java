package controller.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */

public class ConnectionFactory {
    
    private static final String PORT = "3306";
    private static final String URL = "jdbc:mysql://localhost:"+PORT+"/exercicio_crud";
    private static final String PASSWORD = null;
    private static final String USER = "root";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public Connection connect() {
        try {
            Class.forName(DRIVER);
            return (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public boolean finish(Connection conn) {
        try {
            if (!conn.isClosed()) {
                conn.close();
                return true;
            }
            return false;
        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean finish(Connection conn, PreparedStatement stm) {
        try {
            if (!conn.isClosed() && !stm.isClosed()) {
                stm.close();
                conn.close();
                return true;
            }
            return false;
        } catch(SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean finish(Connection conn, PreparedStatement stm, ResultSet rs) {
        try {
            if (!conn.isClosed() && !stm.isClosed() && !rs.isClosed()) {
                rs.close();
                stm.close();
                conn.close();
                return true;
            }
            return false;
        } catch(Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
