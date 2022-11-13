package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcUtil {
    public static void main(String[] args) {
        getConnection();
    }

    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // load 
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                // ket noi
                String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433;"
                        + ";databaseName=student;encrypt=false;trustServerCetificate = true;";

                conn = DriverManager
                        .getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Ket noi ok");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return conn;
    }
}
