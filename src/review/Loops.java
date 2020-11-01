package review;

public class Loops {

    public static void main(String[] args) {


        // write an application which will print selenium 5 times
        // for each selenium , it will print java 3 times
        // when java is getting printed for second and third time, print "i hate java" instead of "java"
        // and for the 3rd and 5th time of selenium print, instead of "selenium", print "i love selenium"

/*

        int x = 100;
        int y = 200;

        int temp = x;
        int temp2 = y;

        y = x;
        x=temp2;

        System.out.println(x);
        System.out.println(y);
*/


        // selection sort
        int[] numbers = {3, 1, 10, 2, 5, 3, 100, -50};
        //1,3,2,5,3,10,100
        //1,2,3,3,5,10,100

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }


}
