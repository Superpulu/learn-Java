import java.util.Vector;

public class TypeConversionReference{
    
    public static void main(String[] args) {
	Object obj = new Object();
	String str = new String("A string-object");	  
	System.out.println("\nobj = " + obj);

	obj = str;

	System.out.println("\nobj = " + obj);
	System.out.println("str = " + str);

	obj = new Object();
	//str = obj; does not compile, due to demoting type conversion
	//str = (String) obj; does not run (but compiles!) due to same reason as above, despite of explicit type conversion

	Object objStr = new String("String-object with object-type reference");
	System.out.println("\nobjStr = " + objStr);

	//str = objStr; demoting type conversion, i.e. IMPLICIT
	str = (String) objStr; // now EXPLICIT, which works
	System.out.println("\nstr = " + str);

	Vector vec = new Vector();
	str = new String("A new string-object");
	//vec = str; compiling error due to incompatible types
	//vec = (Vector) str; explicit conversion fails as types are inconvertible

    }

}
