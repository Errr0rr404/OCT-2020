package practice4.oop.abstraction;

public interface Vehicle extends Vehicle2, Vehicle3 {

    // concepts -- method name, no body
    // interface can't have constructor , so we can't create obj
    // interface can extend multiple interfaces
    // interface's all methods are public & abstract by default

    void move();

    void start();

    void stop();

    void name();
}
