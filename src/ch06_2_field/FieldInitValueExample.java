package ch06_2_field;

class FieldInitValue {
	
	// ÇÊµå
	byte byteField;
	short shottField;
	int intField;
	long longField;
	
	boolean booleanField;
	char charField;
	
	float floatField;
	double doubleField;
	
	int[] arrField;
	String referenceField;
}
	


public class FieldInitValueExample {
	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println(fiv.arrField);
		
	}
}

