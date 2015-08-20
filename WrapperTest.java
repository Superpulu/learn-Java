public class WrapperTest{
    
    public static void main(String[] args) {
	int number = 500;
	String numberString = "501";

	Integer numberInteger = new Integer(number);
	System.out.println("\n" + numberInteger);
	System.out.println(numberInteger.intValue());

	Integer numberInteger2 = new Integer(numberString);
	System.out.println("\n" + numberInteger2.intValue());

	int newNumber = numberInteger2.intValue() + 99;
	System.out.println("\n" + newNumber);

	String newString = numberInteger.toString() + " and " + numberString;
	System.out.println("\n" + newString);
    }

}
