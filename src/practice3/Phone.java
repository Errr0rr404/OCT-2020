package practice3;

public class Phone {

    String model;

    public Phone() {

    }

    public Phone(String modelOfConstructor) {
        this.model = modelOfConstructor;
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone");
        phone1.printPhone();
    }

    public void printPhone() {
        System.out.println(model);
    }
}
