package practice5;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {
        HashMap<String,Integer> cityAndZipOfUSA = new HashMap<>();
        cityAndZipOfUSA.put("NY",11324);
        cityAndZipOfUSA.put("DC",36425);
        cityAndZipOfUSA.put("NJ",23563);

        HashMap<String,Integer> cityAndZipOfCanada = new HashMap<>();
        cityAndZipOfCanada.put("VA",7365);
        cityAndZipOfCanada.put("JH",6789);


        // key = usa, canada --> String
        // value = Hashmap of String and Integer
        HashMap<String,  HashMap<String,Integer>> map = new HashMap();
        map.put("usa",cityAndZipOfUSA);
        map.put("canada",cityAndZipOfCanada);
        System.out.println(map);


        // store into a list
        ArrayList<HashMap<String,Integer>> list = new ArrayList<>();
        list.add(cityAndZipOfCanada);
        list.add(cityAndZipOfUSA);
        System.out.println(list);
    }
}
