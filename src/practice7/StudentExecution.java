package practice7;

import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentExecution extends DBUtils {

    public static void main(String[] args) {
        String query = "select * from students;";

        ArrayList<Student> studentArrayList = new ArrayList<>();
        try {
            ResultSet resultSet = DBUtils.getTableByQuery(query);
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setLocation(resultSet.getString("location"));
                studentArrayList.add(student);
            }

        } catch (Exception e) {
            System.out.println("there was an  exception. please review : ");
            e.printStackTrace();
        } finally {
            DBUtils.cleanupDatabase();
        }


        System.out.println(studentArrayList);

        System.out.println(studentArrayList.get(0).toString());

    }
}
