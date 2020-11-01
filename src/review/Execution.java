package review;

public class Execution {

    public static void main(String[] args) {
        // className obj/ref variable = new ConstructorName();
        Laptop laptop = new Laptop();
        laptop.setMake("Asus");
        laptop.setYear(2012);
        laptop.detailOfLaptop();

        Laptop laptop2 = new Laptop("Macbook pro", "Apple");
        laptop2.detailOfLaptop();

        Laptop laptop3 = new Laptop("Macbook Air", "Appel", 2020);
        laptop3.detailOfLaptop();


        Soccer soccer = Soccer.getInstance();
        soccer.printTeam();
        soccer.printTeam("Madrid");


    }
}
