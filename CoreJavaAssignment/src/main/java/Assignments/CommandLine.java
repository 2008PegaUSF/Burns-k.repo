package Assignments;

public class CommandLine extends Driver{
	
	
	//i cheated, added this block so i could test it easily
		public boolean input() {
			return true;
		}
	//method used for the command line
       public void input(String[] args) {
    	 //initialized the counter to 0  
        int count = 0;  
        
        //it counts the characters in the string
		for(int i = 0; i < args.length; i++) {
			count += args[i].length();
		}
		System.out.println(args[0]+" has " + count+ " characers!" );
	}

	
}

		

