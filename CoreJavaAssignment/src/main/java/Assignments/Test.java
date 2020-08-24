package Assignments;

public class Test implements Operations {
	
	public static void main(String[] args) {
		//calling the methods from the abstract class
		Test test = new Test();
		test.addition();
		test.subtraction();
		
	}
	int x;
	int y;
	int z;
	
	public void multiply() {
		x=1;
		y=0;
		z=x*y;
		
	}
	//hard code is when you do the operation yourself and not letting the computer handle it
	public void addition() {
		 x = 5;
		 y = 11;
		 z = 16;
		 System.out.println("5 + 11 = "+z);
	}
	//soft code: i let the computer do it
	public void division() {
		x=1;
		y=0;
		z=x/y;
				
	}

	public void subtraction() {
		x = 20;
		y=5;
		z=15;
		System.out.println("20 - 5 = "+z);
	}
}
