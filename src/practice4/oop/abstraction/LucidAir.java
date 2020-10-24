package practice4.oop.abstraction;

public class LucidAir extends RunableCarFord {


    // method overriding -- same method name,same params, in the different class
    // dynamic polymorphism or run time polymorphism

    public static void main(String[] args) {
        LucidAir lucidAir = new LucidAir();
        lucidAir.start();
    }

    @Override
    public void start() {
        System.out.println("lucidair car auto-start");
    }

}
