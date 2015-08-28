/*
 * Parse strings using wrapper classes and constants of these.
 * Example shows how to create primitive data types such as
 * byte,short,int,... from strings.
 * wrapper class constants: MIN_VALUE, MAX_VALUE, NEGATIVE_INFINITY, 
 * POSITIVE_INFINITY
 */

public class WrapperParser{
    
    public static void main(String[] args) {
	String intString = "501";
	String byteString = "127";
	String booleanString = "true";
	String doubleString = "2014.2013";
	String floatString = "2014.2";

	int numberInt = Integer.parseInt(intString);
	System.out.println("\n" + numberInt);
	byte numberByte = Byte.parseByte(byteString);
	System.out.println("\n" + numberByte);

	boolean valueBoolean = Boolean.parseBoolean(booleanString);
	System.out.println("\n" + valueBoolean);

	double numberDouble = Double.parseDouble(doubleString);
	System.out.println("\n" + numberDouble);

	double numberFloat = Float.parseFloat(floatString);
	System.out.println("\n" + numberFloat);

	// constants in wrapper classes
	System.out.println("smalles short number: " + Short.MIN_VALUE);
	System.out.println("smalles float number: " + Float.MIN_VALUE);
    }

}
