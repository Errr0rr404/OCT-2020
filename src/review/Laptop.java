package review;

public class Laptop {

    private String model;
    private int year;
    private String make;

    //default constructor
    public Laptop() {

    }

    public Laptop(String model, String make) {
        this.make = make;
        this.model = model;
    }

    public Laptop(String model, String make, int year) {

        this.make = make;
        this.year = year;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void detailOfLaptop() {
        System.out.println(model);
        System.out.println(year);
        System.out.println(make);
    }


}
