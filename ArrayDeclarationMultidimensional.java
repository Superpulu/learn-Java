import java.util.Arrays;

public class ArrayDeclarationMultidimensional{
    
    public static void main(String[] args) {
	System.out.println("Declaration of multidimensional arrays:");
	int[][][] a = new int[2][1][2];
	int[][] b = { {1}, {1,2,1}, {1,2,3,2,1}, {1,2,3,4,3,2,1},
                      {1,2,3,2,1}, {1,2,1}, {1} };

        System.out.println("\nNichtrechteckiger Array b:");
        for (int i=0; i<b.length; i++) {
	    for (int j=0; j<b[i].length; j++) {
		System.out.print(b[i][j]);
	    }
	    System.out.println();
        }
    }

}
