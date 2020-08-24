package Assignments;

import java.util.Scanner;

public class Interest extends Driver{
	
public void calculate() {
	@SuppressWarnings("resource")
	//calling the scanner for user input
	Scanner scan = new Scanner(System.in);
	//made them floats to take on decimals
	System.out.println("How much would you like to borrow: ");
	float principle = scan.nextFloat();
 
    System.out.println("Enter interest rate: ");
    float rate = scan.nextFloat();
    
    System.out.println("What would be you loan term (in years): ");
    float time = scan.nextFloat();
   
 
    float interest = total(principle, rate, time);
    System.out.println("Your interest is: " + interest);
    
 
}
//created a method to calculate interest
public static float total(float principle, float rate, float time){
    float interest = (principle*rate*time)/100;
    return interest;
}

}


