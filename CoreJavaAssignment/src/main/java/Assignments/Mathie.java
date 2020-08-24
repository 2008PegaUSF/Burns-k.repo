package Assignments;



public class Mathie extends Driver implements Operations {
	
		int x;
		int y;
//called the interface methods and used them
	public void multiply() {
		
		int z = 5*4;
		System.out.println(z);
		
	}
	public void addition() {
		
		int z = 5+4;
		System.out.println(z);
	}
	public void division() {
		
		int z = 5/4;
		System.out.println(z);
		
	}
	public void subtraction() {
		
		int z = 5-4;
		System.out.println(z);
		
	}
}