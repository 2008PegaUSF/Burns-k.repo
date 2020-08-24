package Assignments;

public class BubbleSort extends Driver{

		int numArray[] = {1,0,5,6,3,2,3,7,9,8,4};
	//keeps track of the number so it doesn't get deleted
		int holder=0;
		int rotations=0;
public void sort() {
		//keep track of what index we are on
		for(int i=0;i<numArray.length-1; i++) {
		//the process of moving the numbers through the sequence
			for(int o=0; o<numArray.length-1-i; o++) {
				
				if(numArray[o+1]<numArray[o]) {
					holder = numArray[o+1];
					numArray[o+1]=numArray[o];
					numArray[o]=holder;	
				}	
			}
			rotations++;
		}

		for(int i=0; i<numArray.length; i++) {
	//no println if you want it to print in a straight line
			System.out.print(numArray[i] + " ");
		
		}System.out.println("\n"+"Number of rotations: " +rotations);
	}
}
	
	
//couldn't figure out how to print out each rotation