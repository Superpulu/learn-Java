public class TypeConversionPrimitive{
    
    public static void main(String[] args) {
	// explicit conversion
	int valueInt = 999;
	System.out.println(valueInt);
	short valueShort = (short) valueInt;
	System.out.println(valueShort);
	// conversion error
	byte valueByte = (byte) valueShort;
	System.out.println(valueByte);

	// implicit conversion
	valueShort = 2013;
	float valueFloat = valueShort;
	System.out.println(valueShort);
	System.out.println(valueFloat);

	// conversion error following implicit conversion in arithm. expr.
	valueShort = 23;
	valueFloat = valueShort/2;
	System.out.println(valueShort);
	System.out.println(valueFloat);
    }

}
