package Assignments;

public class Fibonacci extends Driver{
		int num1=0;
		int num2=1;
	
	public void fibonacci() {
		//for every number it is going to be the sum of the two numbers before it
		
		for(int i=0;i<25;i++) {
			System.out.print(num1+ " ");
			int sum =num1+num2;
			num1=num2; //num2 becomes num1 in the next sequence
			num2=sum; //sum becomes num2 in the next sequence
					 //num1 num2 sum just shifts down one after a rotation
		}
	}

	
}
