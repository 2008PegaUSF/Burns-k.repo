package Assignments;

public class Substring extends Driver {
	
	public void stringS() {
		//made a string
		String str = new String("I want a long string");
		
		//turned string into an array of chars
		char[] message= str.toCharArray();
		
		//looped through the chars with an array for loop
		for(char s : message) {
			System.out.print(s);
		}
		
	}
}