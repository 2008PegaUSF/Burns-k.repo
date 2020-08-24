package Assignments;

import java.util.ArrayList;

public class Array {
	//putting these arrays to the class for easy accessibility
	ArrayList<Integer> arr = new ArrayList<Integer>();
	ArrayList<Integer> arr2 = new ArrayList<Integer>();
	ArrayList<Integer> arr3 = new ArrayList<Integer>();
	

	
public void all() {
	//adding numbers to the arr array	
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		arr.add(10);
		
		System.out.println("The original array:" +arr+"\n");
	//array for odd and even	
		int even = 0;
		int odd = 0;
			 for(int i = 0 ; i < arr.size() ; i++){
			//separating the odd and even numbers 
			//adding them to their respective arrays
			        if(arr.get(i) % 2 == 0) {
			            arr2.add(arr.get(i));
			        	even +=arr.get(i) ;
			 		}else {
			            arr3.add(arr.get(i));
			        	odd += arr.get(i);

			      }
		}
		System.out.println("The even array:" +arr2);
		System.out.println("Sum of Even Array: "+ even+"\n");
		System.out.println("The odd array:" +arr3);
		System.out.println("Sum of Odd Array: " +odd);
		
	
	}
	
	public void start() {
		//finding the prime numbers and removing them the original array	
			for (int i = 0; i < arr.size(); i++){ 
				if(Prime.doPrime(arr.get(i))==true) {
			        arr.remove(arr.get(i--));
			    } 
			 
			} System.out.print("The non prime number array: " +arr); 

		}
}

