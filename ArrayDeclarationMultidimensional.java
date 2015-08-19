import java.util.Arrays;

public class ArrayDeclarationMultidimensional{
    
    public static void main(String[] args) {
	int fill = -999;
	System.out.println("Declaration of multidimensional arrays:");
	int[] a = new int[10];
	Arrays.fill(a, fill); 
	System.out.println("a = " + Arrays.toString(a));
	int[][][] b = new int[2][3][2];
	System.out.println("b = " + Arrays.deepToString(b));
	int[][] c = { {1}, {1,2,1}, {1,2,3,2,1}, {1,2,3,4,3,2,1},
                      {1,2,3,2,1}, {1,2,1}, {1} };
	System.out.println("c = " + Arrays.deepToString(c));

        System.out.println("\nNichtrechteckiger Array c:");
        for (int i=0; i<c.length; i++) {
	    for (int j=0; j<c[i].length; j++) {
		System.out.print(c[i][j]);
	    }
	    System.out.println();
        }
    }

}
