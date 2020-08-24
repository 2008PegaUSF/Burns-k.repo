package Assignments;
import java.util.Scanner;

public class Factorial extends Driver{
	
	public void factorial()  {
		//n!
		//using scanner because I don't want to come up with the number
		//added the warning because i can't close my scanner yet
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("What number would you like the Factorial of: ");
		
		int num=scan.nextInt();
		int i=1;
		long factorial=1;
	
		
		//loop to calculate factorial
		while(i<=num) {
			//easier way of saying factorial=factorial*i
			factorial *= i;
			i++;
		}
		System.out.println("The Factorial of " +num+ " is: "+ factorial);
		}
		
	}
	


