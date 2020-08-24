package Assignments;

public class ReverseString extends Driver {
	
	public void ReverseS() {
		
		String s = "Welcome to Atlanta where the players play";
		
		//putting string into an array 
		char[] line = s.toCharArray();	
		int length = s.length();
		System.out.println("The original phrase....." +"\n"+s);
		
		//loop to cycle through the string and reversing it
		System.out.println("\n"+"The phrase in reverse.... ");
		for(int i=length-1; i>=0; i--) {
				System.out.print(line[i]);
				}
		}
	}
