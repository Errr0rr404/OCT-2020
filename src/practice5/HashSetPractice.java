package practice5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {

// contains unique data
        HashSet<String> cities = new HashSet<>();
        cities.add("Rego Park");
        cities.add("Jamaica");
        cities.add("Rego Park");
        cities.add("Medford");
        // System.out.println(cities);


        Iterator iterator = cities.iterator();

        ArrayList<String> listOfCity = new ArrayList<>();

        while (iterator.hasNext()) {
            String city = iterator.next().toString();
            listOfCity.add(city);
        }

        System.out.println(listOfCity);

        System.out.println(listOfCity.get(0));

    }
}
