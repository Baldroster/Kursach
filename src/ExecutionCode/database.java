package ExecutionCode;

import java.sql.*;




public class database {
    public static void main(String[] args) throws SQLException {
        Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "pass");

        conn.close();
    }
}
