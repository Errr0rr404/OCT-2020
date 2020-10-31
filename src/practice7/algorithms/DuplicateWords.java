package practice7.algorithms;

import java.util.HashMap;

public class DuplicateWords {


    // create an algorithm to find occurences of a strings words based on space (" ")

    public static void main(String[] args) {
        String data = "Java is a programming language . Java is also an island of indonesia . Java is widely used language in development .";

        String[] splittedData = data.split(" ");

        HashMap<String, Integer> occurences = new HashMap<>();

        for (int i = 0; i < splittedData.length; i++) {
            Integer previousCount = occurences.get(splittedData[i]);
            if (previousCount == null) {
                previousCount = 0;
            }

            occurences.put(splittedData[i], previousCount + 1);
        }

        System.out.println(occurences);

        System.out.println(occurences.get("Java"));


    }
}
