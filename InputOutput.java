// Return rectangle area given user input values

import java.util.Scanner;

/**
 * Calculates area of rectangle.
 * Reads length L and width W from user input
 * and outputs calculated area A.
 * @author ignores command line arguments
 * @since JDK1.0
 * @see java.util.Scanner
 */
public class InputOutput
{
    public static void main(String[] args){

	// Declaration of some integer variables.	
	int L, W, A;
	float halfArea;
	boolean isBooked = true;
	char signQ = '\u0051';
	long smallNumber = -92234645126L;
	String someText = "Der VfB wird Meister.";
	
	Scanner inputvalue = new Scanner(System.in);

	System.out.print("Enter length L: ");
	L = inputvalue.nextInt();
	System.out.print("Enter width W: ");
	W = inputvalue.nextInt();
	A = L * W;
	halfArea = A / (float) 2;

	/*
	 * Output of calculated area.
	 * Area will be given in cm2 in command line.	  
	 */
	System.out.println("The rectangle's area is: " + A + " cm^2");
	System.out.println("and half the area is: " + halfArea+ " cm^2");
	System.out.println("\nInsert empty line!");
	System.out.println("isBooked = " + isBooked);
	System.out.println("signQ = " + signQ + ", smallNumber = " + 
			   smallNumber + ", someText = " + someText);

	System.out.println("\nWithin for loop:\n");
	for (int i = 10; i > 5; i--){
	    float realNumberLoop = 9.03f + i;
	    System.out.println("realNumberLoop:    " + realNumberLoop);
	}

    }
}
