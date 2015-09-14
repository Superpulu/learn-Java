import java.io.*;

public class Polymorph{

    static abstract class Pen
    {
	String writeColour;
	public abstract void returnWriteColour();
    }

    static class Ballpoint extends Pen
    {
	public Ballpoint( String e )
	{
	    writeColour = e;
	}

	public void returnWriteColour()
	{
	    System.out.println("The ballpoint's write colour is " + writeColour + ",\n");
	}

    }

    static class Colourpencil extends Pen
    {
	public Colourpencil( String e )
	{
	    writeColour = e;
	}

	public void returnWriteColour()
	{
	    System.out.println("The colour pencil's write colour is " + writeColour + ".\n");
	}

    }

    //////////////////////////////////////////////////////////////////

    public static void main(String[] args) throws IOException
    {
       	
	Pen somePen = new Ballpoint( "blue" );
	somePen.returnWriteColour();
	System.out.println(somePen.getClass());
	somePen = new Colourpencil( "red" );
	somePen.returnWriteColour();
	System.out.println(somePen.getClass());

	class Car {
	    
	    public void drive(){
		System.out.println("Going down the road!");	
	    }
	}
	
	class Ragtop extends Car{
	    // override superclass definition
	    public void drive(){
		System.out.println("Top down!");

		super.drive();
		System.out.println("Got the radio on!");
	    }

	}

	class JoyRide{
	    private Car myCar;
	    
	    private void park(Car auto){
		myCar = auto;
	    }
	    
	    private Car whatsInTheGarage(){
		return myCar;
	    }

	    public void letsGo(){
		park(new Ragtop());
	    }

	}

	Car auto = new Car();
	auto.drive();
	System.out.println("--------");
	auto = new Ragtop();
	auto.drive();
	System.out.println("--------");

	// checking type casting of variable with polymorphic types
	//Ragtop funCar;
	Car hymerle = new Car();
	//funCar = (Ragtop) hymerle; //runtime error
	hymerle.drive();
	System.out.println("--------");

	hymerle = new Ragtop();
	Ragtop funCar = (Ragtop) hymerle; //works bc hymerle is Ragtop
	funCar.drive();
	System.out.println("--------");	

    }
}
