package practice5;

import java.util.Random;

public class ArrayPractice3 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        // random
        Random random = new Random();

        int x = random.nextInt(5000);
        // random int every time
        //System.out.println(x);


        // 1st loop to insert random int in the array and fill all the index
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(5000);
        }

        //2nd loop to print  all int from the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }


    }
}
