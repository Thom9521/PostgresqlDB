import java.sql.*;


public class DB_Connector {

    private static String url = "jdbc:postgresql://localhost:5432/mydatabase";
    private static String user = "postgres";
    private static String pass = "";
    private static Connection conn = null;

    public static Connection connect() {
        System.out.println("\n--Connecting to PostgresSQL JDBC--");

        try {
            conn = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();

        }

        if (conn != null) {
            System.out.println("\n--Connection successful--");
        } else {
            System.out.println("\n--Connection failed--");
        }
        return conn;
    }
}

