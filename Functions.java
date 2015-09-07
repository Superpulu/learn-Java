class Student{
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    /* VOID: method does not return a value; using "return" (optional) will exit the method
     * NON-static method: can only be run on objects and not on the whole class; cam alter field of the object
     * method requires object of type Student
     */
    public void printFullName(){
	System.out.println(this.firstName + " " + this.lastName);
    }
}

public class Functions{

    /* STATIC: method belongs to class Functions and not to a specific instance of Function
     * which is why one can call the method from a different class like Functions.sumTwo
     * NOTE: every Java method has to be within a class
     */
    public static int sumTwo(int a, int b){
	int c = a + b;
	return c;
    }

    public static void main(String[] args){
	int d;
	d = sumTwo(2,5);
	System.out.println("d = " + d);
	int e = Functions.sumTwo(3,8);
	System.out.println("e = " + e);

	Student[] students = new Student[]{
	    new Student("Morgan", "Freeman"),
	    new Student("Marylin", "Monroe"),
	    new Student("Charlie", "Chaplin"),
	};
	for (Student s : students){
	    s.printFullName();
	}

    }
}
