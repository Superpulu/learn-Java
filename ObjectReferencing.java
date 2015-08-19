import java.util.Date; // use java Date object


/**
 * Tutorial program testing the implications
 * when variables are created as REFERENCES
 * and not PRIMITIVE types
 * @see java.util.Date   
 */
public class ObjectReferencing {

    public static void main(String[] args) {
	Date d1 = new Date(300000000L);
	System.out.println("\nDate in main 1: "+ d1);
	changeDate1(d1);
	System.out.println("\nDate in main 2: "+ d1);
	changeDate2(d1);
	System.out.println("\nDate in main 3: "+ d1);
    }

    public static void changeDate1(Date d1) {
	System.out.println("Date in changeDate1 1: "+ d1);
	d1.setTime(800000000L); // input object itself is altered
	System.out.println("Date in changeDate1 2: "+ d1);
    }

    public static void changeDate2(Date d1) {
	System.out.println("Date in changeDate2 1: "+ d1);
	d1 = new Date(900000000L); // creates new object
	System.out.println("Date in changeDate2 2: "+ d1);
    }

}
