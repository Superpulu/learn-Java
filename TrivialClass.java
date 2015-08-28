public class TrivialClass{
    // field with scope = entire class
    private long ctr;

    // modify the field
    public void incr(){ctr++;}

    public static void main(String[] args){
	TrivialClass trivial = new TrivialClass();
	System.out.println("trivial = " + trivial);
    }
}
