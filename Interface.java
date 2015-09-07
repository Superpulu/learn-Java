public class Interface{

    public class Fertilizer{
	private long manure;
    }

    public class Water{
	private boolean irrigation;
    }

    public interface Growable{
	//declare signature but not the implementation
	void grow(Fertilizer food, Water water);
    }

    public interface Eatable{
	//another signature with no implementation
	void munch();
    }

    // An implementing class must implement all interface methods
    public class Beans implements Growable, Eatable{
	@Override 
	public void grow(Fertilizer food, Water water){
	    // ...
	}

	@Override
	public void munch(){
	    // ...
	}
    }
    
    public static void main(String[] args){
	System.out.println("Interface tutorial.");
    }

}
