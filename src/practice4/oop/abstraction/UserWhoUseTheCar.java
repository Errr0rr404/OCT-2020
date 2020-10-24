package practice4.oop.abstraction;

public class UserWhoUseTheCar {

    public static void main(String[] args) {
        RunableCarFord runableCar = new RunableCarFord();

        runableCar.move();
        runableCar.wheels();

        runableCar.brake();
    }
}
