import java.util.Arrays;

public class ArrayDeclaration{
    
    public static void main(String[] args) {
	int[] a; // declaration of array a
	a = new int[3]; // initialisation of a with length = 3
	System.out.println("a = " + a);
	int[] b = new int[10]; // the above in one go
	int[] c = {1,2,3}; // without new-operator with immediate initialisation

	float[] d = {1.2f,3.4f,5.4f};
	System.out.println("d = " + d[0]);
	boolean[] e = {true,false,true};
	System.out.println("e = " + e[0]);
	char[] f = {'v','b'};
	System.out.println("f = " + f[0]);

	String[] charString = {"VfB", "wird", "Meister"};
	System.out.println("charString: " + Arrays.toString(charString));	
    }

}
