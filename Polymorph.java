public class Polymorph{

    public static void main(String[] args){
       
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
