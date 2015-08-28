public class LessTrivialClass{
    // field with scope = entire class
    private long ctr;

    // constructor: init counter to 0
    public LessTrivialClass(){this(0);}

    // constructor to initialize field
    public LessTrivialClass(long initCtr){
	ctr=initCtr;
    }

    // modify the field
    public void incr(){ctr++;}

    public static void main(String[] args){
	LessTrivialClass trivial = new LessTrivialClass(1);
	System.out.println("trivial = " + trivial);
	System.out.println("new foo = " + new LessTrivialClass(20));
	System.out.println("new foo = ".concat((new LessTrivialClass(10)).toString()));
	Boolean equalsBoolean = new Boolean(false);
	boolean equals2 = false;
	System.out.println("equals = " + equalsBoolean);

	// using equals method on Objects
	Integer x = new Integer(12);
	Integer y = new Integer(12);
	Integer z = new Integer(12);
	equalsBoolean = x.equals(x); // reflexive
	System.out.println("equals = " + equalsBoolean);
	System.out.println(x.equals(y) == y.equals(x)); // symmetric
	equals2 = (x.equals(y) && y.equals(z)) == x.equals(z); // transitive
	System.out.println("equals2 = " + equals2);
	
    }
}

