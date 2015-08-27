public class ConditionalsAndBooleans{
    public static void main(String[] args){
	int a = 4;
	if (a == 4){
	    System.out.println("a == 4");
	}

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
    }
}
