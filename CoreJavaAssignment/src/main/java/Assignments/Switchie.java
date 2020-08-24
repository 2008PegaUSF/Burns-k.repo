package Assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Switchie extends Driver {
	
	public void switching() {
		//added suppress because I don't want to close scan
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number 1-3");
		int locker =scan.nextInt();
		
		switch(locker) {
		case 1:
			//wanted ya'll to learn something
			int num = 729;
			System.out.println(Math.sqrt(num));
			break;
		case 2:
			//switched the date format to regular
			//switch mm-dd becasuse i like the format better
			LocalDate date= LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
			System.out.println(date.format(formatter));
			break;
		case 3:
			//separated the phrase using spit, so much better
			String phrase = "I am learning Core Java";
			String sArray[] = phrase.split("");
			for(String now : sArray) {
				System.out.print(now);
				
			}
			break;
		default:
			//for when you can't read directions
			System.out.println("Sorry, wrong input.");
		
		}
		
	}
}
