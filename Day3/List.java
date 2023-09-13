package day3;
import java.util.*;
public class List1 {
	public static void main(String args[])
	{
		ArrayList<String> state =new ArrayList<>();
        state.add("Karnataka");
        state.add("TamilNadu");
        state.add("Telengana");
        state.add("West Bengal");
        state.add("AndhraPradesh");
        state.add("Kerala");
        state.add("Punjab");
        state.add("Assam");
        state.add("Goa");
        state.add("Sikkim");
        
        //1.ITERATE ELEMENTS OF ARRAYLIST
            System.out.println("Iterating through the ArrayList:");
	        Iterator<String> iterator = state.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.print(element+"  ");
	        }
	        System.out.println("\n");
	            
	    //2.SEARCH FOR ELEMENT OF ARRAYLIST
	            if (state.contains("Karnataka")) {
	                System.out.println("\nFound the element");
	                } else {
	                System.out.println("There is no such element");
	                }
	     //3.ADD 5 NEW ELEMENTS AND REMOVE 1ST 5 ELE
	            state.add("Mizoram");                    
	            state.add("Tripura");
	            state.add("Odhisa");
	            state.add("MadhyaPradesh");
	            state.add("Maharastra");

	            for (int i = 0; i < 5; i++) {
	                state.remove(0);           // Remove first 5 ele
	            }
	            System.out.println("\nUpdated ArrayList:");
	            for (String element : state) {
	            System.out.print(element+"  ");
	            }
	        }
	            
	        
	}


