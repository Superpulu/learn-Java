// simple first Hello World program //
public class ClassObject
{

    int x; // instance variable
    static int y; // class variable

    private static class Point{
	int x_coord;
	int y_coord;
	int n;

	// default constructor
	Point(){
	    this.x_coord = 10;
	    this.y_coord = 10;
	}

	// constructor setting x on user defined value, y on 10
	// defining a class's (constructor) method more than once is called overloading
	Point(int x_coord){
	    this.x_coord = x_coord;
	    this.y_coord = 10;
	}

	Point(int x_coord, int y_coord){
	    this.x_coord = x_coord;
	    this.y_coord = y_coord;	    
	}

	public void set_x_coord( int x_coord_2b_set ){
	    this.x_coord = x_coord_2b_set;
	}

	public int get_x_coord(){
	    // returns value of attribute x_coord of an object to the caller
	    return this.x_coord;
	}

	public long calculateFacultyIteratively(int n){
	    long facu = 1;
	    for ( int i = 1; i <= n; i++ )
		{
		    facu *= i;
		}
	    return facu;
	}

	public long calculateFacultyRecursively(int n){
	    System.out.println("Called with "+ n);
	    if ( n >= 1 )
		{
		    return n * calculateFacultyRecursively( n - 1 );
		}
	    else
		{
		    return 1;
		}
	}
	 
    }

    class Line{
	Point point_one;
	Point point_two;
    }

    public class PointExtended extends Point{
	
    }

    public static void main(String[] args)
    {
	// calling default constructor
	Point p = new Point();
	// print object p and its variables
	System.out.println("Object p: " + p);
	System.out.println("Default constructor x_coord: " + p.x_coord);
	System.out.println("Default constructor y_coord: " + p.y_coord);
	p.set_x_coord(2);
	System.out.println("Default constructor x_coord: " + p.x_coord);
	p.set_x_coord(99);
	System.out.println("Default constructor x_coord: " + p.get_x_coord());
	int val = 6;
	System.out.println("Faculty of " + val + ": " + p.calculateFacultyIteratively(val));
	long facu = p.calculateFacultyRecursively(val);
	System.out.println("Faculty of " + val + ": " + facu);

	// calling constructor with one parameter
	Point p1 = new Point(23);	
	System.out.println("Object p1: " + p1);
	System.out.println("Parameter constructor x_coord: " + p1.x_coord);
	System.out.println("Default constructor y_coord: " + p1.y_coord);

	// calling constructor with two parameters
	Point p2 = new Point(42,12);	
	System.out.println("Object p2: " + p2);
	System.out.println("Parameter constructor x_coord: " + p2.x_coord);
	System.out.println("Parameter constructor y_coord: " + p2.y_coord);
    }
	
}

