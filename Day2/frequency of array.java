//Frequency of characters in a String.
package day2;
import java.util.*; 

public class P1 {
	
	   public static void main(String args[]){   
	      System.out.println("Enter a string value:");
	      Scanner sc = new Scanner(System.in);  //user input
	      String str = sc.nextLine();  //read the string

	      System.out.println("Enter a particular character :");
	      char character = sc.nextLine().charAt(0);  
	      int count = 0;

	      for (int i=0; i<str.length(); i++){
	    	 
	         if(character == str.charAt(i)){
	            count++;
	         }
	      }
	      System.out.println("Frequency of the give character: "+count);
	   }
	}
