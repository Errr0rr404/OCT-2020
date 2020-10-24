package practice5;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        // key-value pair
        // hashtable can contain null key/value
        // hashmap is faster
        // hashmap is not thread safe and non synchronized

        HashMap<Integer,String> studentInformation = new HashMap<>();
        studentInformation.put(1532,"Nusrut");
        studentInformation.put(43352,"Michael");
        studentInformation.put(324,"David");
        studentInformation.put(null,"Jafor");
        studentInformation.put(424,null);
        System.out.println(studentInformation);









        System.out.println(studentInformation.get(43352));








        HashMap<String,Integer> locationInformation = new HashMap<>();
        locationInformation.put("Rego Park",11374);
        locationInformation.put("Grand Concourse",11646);


        System.out.println(locationInformation.get("Rego Park"));

        System.out.println(locationInformation);
        System.out.println(studentInformation);

        System.out.println(studentInformation.size());

        System.out.println(studentInformation.containsKey(325));

        System.out.println(studentInformation.containsValue("Rahat"));

    }
}
