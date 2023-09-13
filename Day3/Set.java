package day3;
import java.util.*;

public class Set1 {
	public static void main(String[] args) {
        // Create a HashSet of String with at least 10 elements (including duplicates)
        HashSet<String> state = new HashSet<String>();
        state.add("Karnataka");
        state.add("Karnataka"); //duplicate
        state.add("Telengana");
        state.add("West Bengal");
        state.add("AndhraPradesh");
        state.add("Kerala");
        state.add("Kerala");  //duplicate 
        state.add("Assam");
        state.add("Goa");
        state.add("Sikkim");
        

        // Iterate
        System.out.println("Iterating through the HashSet:");
        Iterator<String> itr = state.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
