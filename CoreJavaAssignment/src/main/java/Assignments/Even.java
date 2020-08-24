package Assignments;
import java.util.Scanner;

public class Even extends Driver {
	
	public void isEven() {
		
		//i just wanted to play with it to make sure it was right, weird not using %
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		//statement to see if a number is even
		if((n/2)*2==n) {
			System.out.println("It's even");
		}else {
			System.out.println("It's odd");
		}
		scan.close();
	}
}
