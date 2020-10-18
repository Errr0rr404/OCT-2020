package practice4.oop.abstraction;

public class RunableCar extends Car implements Vehicle, Vehicle2 {

    // i - i
    // implements - interface
    // extends - class/abstract class
    // implement more than one interface is allowed
    // only one abstract class/ class is allowed


    // method overriding -- same method name,same params, in the different class
    // dynamic polymorphism or run time polymorphism

    @Override
    public void wheels() {
        System.out.println("4 wheels");
    }

    @Override
    public void move() {
        System.out.println("runable car can move");
    }

    @Override
    public void start() {
        System.out.println("runable car can start");

    }

    @Override
    public void stop() {
        System.out.println("runable car can stop");
    }

    @Override
    public void name() {
        System.out.println("runable car can has a name : ford");
    }

    @Override
    public void window() {
        System.out.println("car has windows");
    }

}
