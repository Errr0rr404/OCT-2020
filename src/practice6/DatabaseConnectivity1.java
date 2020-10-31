package practice6;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnectivity1 {

    public static void main(String[] args) throws SQLException {

        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";
        String query = "select * from students;";


        //jdbc:mysql -- drivername
        //localhost -- host of the db
        //3306 -- port number of the db
        //?serverTimezone=UTC -- only if it gave you the server time zone value is unrecognized
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=UTC";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet table = statement.executeQuery(query);


        ArrayList<ArrayList<Object>> studentInformation = new ArrayList<>();
        while (table.next()) {
            int id = table.getInt("id");
            String name = table.getString("name");
            String location = table.getString("location");

            ArrayList<Object> students = new ArrayList<>();
            students.add(id);
            students.add(name);
            students.add(location);

            studentInformation.add(students);
        }


        System.out.println(studentInformation);

        // Try to store into :
        //  - Hashmap<String,String>
        //  - Hashmap<Integer, Hashmap<Integer,String>>

    }
}
