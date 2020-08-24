package Assignments;

import java.util.ArrayList;


public class Prime {
	//made an arraylist
	ArrayList<Integer> primer = new ArrayList<Integer>();
	//loop for number 1 - 100
	public void rePrime() {	
	for(int i=1;i<=100; i++) {
		//had to call doPrime to filter out the prime numbers
			if(doPrime(i)) {
			primer.add(i);
			}
		}System.out.println(primer);
	}
	//prime number method
	public static boolean doPrime(int p) {		
			if (p <= 1) { 
				return false;
			}
			for (int i = 2; i <= ( p / 2 ); ++i) {
				if (p % i == 0)
					return false;
				}
				
				return true;
	
	}
}

	

