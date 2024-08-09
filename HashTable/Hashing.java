package HashTable;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map;
        map = new HashMap<>();

        // insertion
        // map put method checks if case is there or not
        // if exist then it updates it's value.
        map.put("India", 120);
        map.put("China", 140);
        map.put("Indonesia", 40);

        // search
        if (map.containsKey("China")) {
            System.out.println("Key is present");
        } else {
            System.out.println("Not present");
        }

        System.out.println(map.get("China")); // if key exist then it's return value.
        System.out.println(map.get("Pakistan"));
        System.out.println(map);

        // iterating on map.
        /*
         * for( each: collection_name)
         */
        for (int var : map) {
            
        }
    }
}
