package practice5;

import java.util.Hashtable;

public class HashTablePractice {

    // hashtable can't contain null key/value
    // hashtable is slower
    // hashtable is thread safe and synchronized

    public static void main(String[] args) {

        Hashtable<Integer, String> student = new Hashtable<>();
        student.put(32, "Jafor");
        student.put(53, "Sraboni");
        student.put(12, "David");
        //student.put(null,"Jafor");
        student.put(424, null);
        System.out.println(student);
    }
}
