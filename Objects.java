class Point{

    int x;
    int y;
    String xy;

    // constructor
    Point(int x, int y){
	this.x = x;
	this.y = y;
    }

    // another constructor
    Point(){
	this(0, 0);
    }
    
    void printPoint(){
	System.out.println("(" + x + "," + y + ")");
    }

    Point center(Point other){
	// returns center between this point and other point
	return new Point((x + other.x) / 2, (y + other.y) / 2);
    }

}

public class Objects{
    
    public static void main(String[] args){

	Point p = new Point(); // applies zero constructor
	p = new Point(3,7); // using defined constructor
	p.x = 3;
	p.y = 6;
	p.printPoint();
	Point center = new Point();
	Point other = new Point(3,7);
	center = p.center(other);
	center.printPoint();
    }
}
