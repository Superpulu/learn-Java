public class Loops{
    public static void main(String[] args){

	System.out.println("Simple for loop");
	// classic for loop
	for (int i = 0; i < 3; i++){
	    System.out.println(i);
	}

	System.out.println("Simple while loop");
	
	// classic while loop
	//while (condition){}

	// foreach, but no index given
	System.out.println("Simple for loop over array without indexes");
	int[] arr = {2,5,3,7};
	for (int el : arr){
	    System.out.println(el);
	}

	// longer version, giving indexes
	System.out.println("Simple for loop over array with indexes");
	for (int i = 0; i < arr.length; i++){
	    int el = arr[i];
	    System.out.println("el2 = " + el);
	}

	// using break
	System.out.println("Breaking loop to 100 at 51");
	for (int i = 0; i < 101; i++){
	    if (i == 51){
		System.out.println("Breaking at i = " + i);
		break;
	    }
	    System.out.print(i);
	}

	// using continue
	System.out.println("Continue (skip) loop to 100 between 10 and 90");
	for (int i = 0; i < 101; i++){
	    if (i > 10 && i < 90){
		System.out.println("Continue");
		continue;
	    }
	    System.out.print(i);
	}

	/* Exercise: 
	 * Loop through and print out all even numbers from the numbers list in the same order they are received. Don't print any numbers that come after 237 in the sequence. 
	 */
	System.out.println("\n\nExercise");
        int[] numbers = {
            951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544, 
	    615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941, 
	    386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 
	    399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 
	    815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 
	    958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 
	    743, 527};

	for (int el : numbers){
	    double byTwo = el / 2.0;  
	    double floorByTwo = Math.floor(byTwo);
	    double byTwoMinusFloor = byTwo - floorByTwo;
	    boolean even = false;
	    if (el == 237){
		System.out.println("el = 237");		
		break;
	    }
	    if (byTwoMinusFloor == 0.0){
		even = true;
		System.out.println(el);		
	    }
	    // shorter alternative with remainder operator %
	    if (el % 2 == 0) System.out.print(el % 2);
	} 


    }
}
