package Assignments;


public class EnhancedLoop extends Driver {
	
	
	 int[ ] arr;
	 int[ ] evenArr;
	 int count;
	
	public EnhancedLoop() {
		initialArray();
		putEvenArray(arr);
		checkEven();
	}
	//setting up the initial array
	public void initialArray() {
		arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
	//setting up the evens array
	public void putEvenArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				
				count++;
			}
		}
		//adding the even number to the evenArray
		evenArr = new int[count];
	}
	//added this block because my number kept printing out as 0's and I didn't know why
	//i wanted to add even[j] = arr[i] to the above block, but if got mad at me
	//so this block was thrown in
	//clearly i hated this block the most
	public void checkEven() {
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenArr[j] = arr[i];
				j++;
			}
		}
	}
	//prints out the even number array
	public void printEven() {
		for(int eve: evenArr) {
			System.out.print(eve);
			//added space to make it look prettier
			System.out.print(" ");
		}
		
	}
}
