// Return rectangle area given user input values

import java.util.Scanner;
import java.util.Date;

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

	// Declaration of some variables of various PRIMITIVE types.	
	int L, W, A;
	float halfArea;
	float realNumber = 3.01f;
	boolean isBooked;
	char signQ = '\u0051';
	long smallNumber = -9223464512L;
	String someText = "Der VfB wird Meister";	

	// Declaration of REFERENCE variables
	Date a = new Date(45341200000L);
	Date b = a;
	Scanner inputvalue = new Scanner(System.in);

	System.out.println("\na = " + a + " b = " + b);
	a = null; // reference to object removed for a (new address = null)
	System.out.println("\na = " + a + " b = " + b); 
	/*
	  b still references to object
	*/

	isBooked = true;

	// Prompt for rectangle dimensions and calculate area
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

	// Now print above variable types for testing
	System.out.println("\nInsert empty line before this text!");
	System.out.println("isBooked = " + isBooked);
	System.out.println("signQ = " + signQ + ", smallNumber = " + 
			   smallNumber + ", someText = " + someText
			   + ", realNumber = " + realNumber);
	// ...applying a foor loop
	System.out.println("\nWithin for loop:\n");
	for (int i = 10; i > 5; i--){
	    realNumber = i / (float) 2;
	    float realNumberLoop = 9.03f + i;
	    System.out.println("realNumberLoop:    " + realNumberLoop);
	    System.out.println("realNumber:    " + realNumber);
	}

    }
}
