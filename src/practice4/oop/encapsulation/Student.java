package practice4.oop.encapsulation;

public class Student {

    // oop -
    // Encapsulation : data hiding
    // Abstraction

    private String nameOfStudent;
    private int idOfStudent;

    // homework
    private String ssn;
    private String location;
    private String gender;

    // getter method
    public String getNameOfStudent() {
        return nameOfStudent;
    }

    // setter method
    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    // getter method
    public int getIdOfStudent() {
        return idOfStudent;
    }

    // setter method
    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }


}
