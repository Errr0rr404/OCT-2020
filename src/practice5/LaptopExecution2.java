package practice5;

public class LaptopExecution2 {

    public static void main(String[] args) {
        Laptop laptop = Laptop.getInstance();
        String model = laptop.getModelOfTheLaptop();

        System.out.println(model);

        Laptop laptop2 = Laptop.getInstance();
        laptop2.getModelOfTheLaptop();
    }
}
