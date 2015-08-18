// Return rectangle area given user input values //

import java.util.Scanner;

public class InputOutput
{
    public static void main(String[] args){
	int L, W, A;

	Scanner inputvalue = new Scanner(System.in);

	System.out.print("Enter length L: ");
	L = inputvalue.nextInt();
	System.out.print("Enter width W: ");
	W = inputvalue.nextInt();
	A = L * W;
	System.out.println("The rectangle's area is: " + A + " cm^2");

    }
}
