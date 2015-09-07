public class Static{
    private static int classMember; //static variable, i.e. belongs to class
    private int instanceMember; //dynamic variable, i.e. belongs only to instances of that class

    public void incr(){
	classMember++;
	instanceMember++;
    }

    // Overrides toString() method to print more useful information
    // instead of variable storage location 
    @Override public String toString(){
	return "classMember: " + classMember
	    + ", instanceMember: " + instanceMember;
    }
    
    public static void main(String[] args){
	Static ex1 = new Static();
	Static ex2 = new Static();
	ex1.incr();
	ex2.incr();
	System.out.println(ex1);
	System.out.println(ex2);
    }

}

