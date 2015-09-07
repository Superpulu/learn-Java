public class Abstract{
    
    public abstract class TemplatedService{

	public final void service(){
	    // subclasses prepare in their own ways
	    prepareService();
	    // but they all run the same service
	    runService();
	}

	public abstract void prepareService();

	private final void runService(){
	    // implementation of the service ...
	}

    }

    public class ConcreteService extends TemplatedService{
	public void prepareService(){
	    // set up for the service
	    System.out.println("Preparing the service...");
	}
    }

    public static void main(String[] args){

    }

}
