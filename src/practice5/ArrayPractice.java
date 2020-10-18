package practice5;

public class ArrayPractice {


    public static void main(String[] args) {

        String[] names = {"Adnan", "Rahman", "Rahat"};

        String name = "Meraj";
        //System.out.println(name);


        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }


        int[] numbers = {143, 26, 35, 48, 59};

        Object[] everything = {11374, "USA", true, 'f'};

        System.out.println(everything[1]);

        Object zipCode = everything[0];
        System.out.println(zipCode);


    }
}
