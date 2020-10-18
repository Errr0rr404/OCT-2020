package practice4.oop.abstraction;

public class UserWhoUseTheCar {

    public static void main(String[] args) {
        RunableCar runableCar = new RunableCar();

        runableCar.move();
        runableCar.wheels();

        runableCar.brake();
    }
}
