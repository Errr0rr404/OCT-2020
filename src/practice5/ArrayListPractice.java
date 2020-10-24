package practice5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {

        // elastic
        // size method
        ArrayList<String> listOfCity = new ArrayList<>();

        listOfCity.add("Queens");
        listOfCity.add("Bronx");
        listOfCity.add("Manhattan");

        listOfCity.add("Jersey City");
        System.out.println(listOfCity);

        listOfCity.remove("Jersey City");
        listOfCity.remove(2);


        //1st
        System.out.println(listOfCity);
        System.out.println(listOfCity.size());

        System.out.println(listOfCity.get(0));

        System.out.println();

        //2nd
        for (int i = 0; i < listOfCity.size(); i++) {
            System.out.println(listOfCity.get(i));
        }


        listOfCity.add("VA");
        listOfCity.add("DC");


        //3rd
        Iterator iterator = listOfCity.iterator();

        // while iterator has a next value i want to print that value
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        ArrayList<Integer> zipCode = new ArrayList<>();
        zipCode.add(11333);
        zipCode.add(35242);
        zipCode.add(23456);

        zipCode.clear();
        System.out.println(zipCode);


        ArrayList<Object> everything = new ArrayList<>();
        everything.add("Rego Park");
        everything.add(11374);
        everything.add(true);
        System.out.println(everything);


        ArrayList everything2 = new ArrayList();
        everything2.add("Rego Park");
        everything2.add(11374);
        everything2.add(true);
        everything2.add(11374);
        System.out.println(everything2);
    }
}
