package practice7;

import java.io.IOException;
import java.sql.*;

public class DBUtils {
    private static Connection connection;
    private static Statement statement;

    public static ResultSet getTableByQuery(String query) throws SQLException, ClassNotFoundException, IOException {
        String username = FileUtils.getPropertyFromFile("src/practice7/lib/config.properties", "username");
        String password = FileUtils.getPropertyFromFile("src/practice7/lib/config.properties", "password");
        String dbName = FileUtils.getPropertyFromFile("src/practice7/lib/config.properties", "dbName");

        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }

    public static void cleanupDatabase() {
        try {
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
