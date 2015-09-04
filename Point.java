class Point{

    // public: everybody can access method or variable, such as constructors and methods
    // private: only class itself has access, such as variables and methods

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
	this(0, 0); // this keyword used as areference of current object
    }
    
    void printPoint(){
	System.out.println("(" + x + "," + y + ")");
    }

    Point center(Point other){
	// returns center between this point and other point
	return new Point((x + other.x) / 2, (y + other.y) / 2);
    }

    Point scale(){
	return new Point((x / 2), (y / 2));
    }

    public static void main(String[] args){
	Point point1 = new Point(50,9);
	Point point2 = new Point(4,120);
	Point center = new Point();
	Point half = new Point();
	center = point1.center(point2);
	center.printPoint();
	half = point1.scale();
	half.printPoint();
    }

}
