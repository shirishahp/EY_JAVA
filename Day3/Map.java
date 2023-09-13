package day3;
import java.util.*;

public class Map1 {



    public static void main(String[] args) {
        // 1.HashMap with specified value & key
        Map<String, Integer> hash = new HashMap<>();
        hash.put("monday", 1);
        hash.put("tuesday", 2);
        hash.put("wednesday", 3);
        hash.put("thrusday", 4);
        hash.put("friday",5);

        // 2. Display key & value of the HashMap
        System.out.println("HashMap key-value pairs:");
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // 3. Update the value of one of the keys in the HashMap
        String keyToUpdate = "friday";
        int newValue = 999; // New age for Bob
        hash.put(keyToUpdate, newValue);

        // Display the updated HashMap
        System.out.println("\nUpdated HashMap:");
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}

