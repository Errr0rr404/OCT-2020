package practice5;

public class ArrayPractice2 {

    public static void main(String[] args) {
        String[] names = {"Adnan", "Rahman", "Rahat", "David", "Tigist", "Zahra", "Iyes"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // try this
        // if any exception occurs
        // catch them
        // perform some action
        // parent class of all exception : Throwable

        try {
            System.out.println(names[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception occured, try to fix your index");
            e.printStackTrace();
        }


        System.out.println(names.length);

        String[] cars = new String[5];

        cars[0] = "bmw";
        cars[1] = "audi";
        cars[2] = "alpha romeo";

        System.out.println(cars.length);

        System.out.println(cars[2]);

        System.out.println(cars[3]);


        String[] myCars = cars.clone();

        System.out.println(myCars.length);


    }
}
