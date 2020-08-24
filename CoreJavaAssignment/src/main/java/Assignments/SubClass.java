package Assignments;

public class SubClass extends SuperClass{
//calling the abstract methods and using them
	
	public boolean numOne() {
		String a = "happy meal";
	//a statement to find if their is a uppercase letter in the string	
		if(!a.equals(a.toLowerCase())) {

			System.out.println("there is a uppercase letter in it");
			return true;
		
		}else {
			System.out.println("there is no uppercase letter in it");
			return false;
		}
	}	
	//turning everything to uppercase
	public void numTwo() {
		String a = "deep blue sea";

		System.out.println(a.toUpperCase());
		
	}

	public void numThree() {
		String ring = "788";
		int ice = 10;
	//how you turn a string into an int	
		int nope = Integer.parseInt(ring);
		
		int sum = nope+ice;
		System.out.println(sum);
		
	}

}
