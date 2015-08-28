public class ConditionalsAndBooleans{
    public static void main(String[] args){
	int a = 4;
	int b = 5;
	boolean result;

	// boolean operators:
	result = a < b;
	System.out.println(result);
	result = a > b;
	System.out.println(result);
	result = a == b;
	System.out.println(result);
	result = a <= 4 ;
	System.out.println(result);
	result = b >= 6;
	System.out.println(result);
	result = a != b; // not equal
	System.out.println(result);
	result = a > b || a < b; // logical or
	System.out.println(result);
	result = a == b && b > 3; // logical and
	System.out.println(result);
	result = !result; // logical not
	System.out.println(result);

	// if 
	if (a == b){
	    System.out.println("a == b");
	}	
	
	// if - else
	if (a==b){
	    System.out.println("a == b");
	} else {
	    System.out.println("a != b");
	}
	// corresponding one-liner without {}, but not recommended
	if (a==b) System.out.println("a == b"); else System.out.println("a != b");
	// even shorter
	int resultInteger = a == 5 ? 1 : 8;
	System.out.println("result = " + resultInteger);

	String one = new String("VfB");
	String two = new String("VfB");
	String three = one;

	boolean oneTwo = one == two;
	boolean oneTwoEquals = one.equals(two);
	boolean oneThree = one == three;
	System.out.println(oneTwo);
	System.out.println(oneTwoEquals);
	System.out.println(oneThree);

    }
}
