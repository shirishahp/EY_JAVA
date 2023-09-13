package day3;

public class Array1 {
	public static void main(String[] args) {
	      
	    int[] array = {9,8,7,6,5,4,3,2,1,0};    //create an array
	    
	    //1. ITERATE ELEMENTS OF ARRAY
	    System.out.println("Elements of Array");
	    for (int i=0;i<array.length;i++)  { 
	      System.out.print(array[i]+"  ");
	    }
	    
	    //2.RETRIVE 1ST AND LAST ELEMENT
	    System.out.println("\n");
	    int size=array.length;
	    System.out.println("first element "+array[0]);
		System.out.println("last element "+array[size-1]);
		
		//3. UPDATE 3RD AND 8TH ELEMET 
		System.out.println("\nUpdated Array: ");
		 array[3]=333;
		 array[8]=999;
		 for(int i=0;i<array.length;i++)
		 {
			 System.out.print(array[i]+"  ");
			 
		 }
	  }
}
