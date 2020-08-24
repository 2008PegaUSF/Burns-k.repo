package Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataFile extends Driver{

	public void file() {
		try {
			//added the full path because just the name wasn't working
		File file = new File("\\Users\\Kimib.000\\eclipse-revatureProject\\CoreJavaAssignment\\target\\Data.txt");
		Scanner scan = new Scanner(file);
		//reads in line in the files
		while(scan.hasNextLine()) {
			String read = scan.nextLine();
			
			//separating the string by the colons
			String[] splat = read.split(":");
			for(int i=0; i<splat.length;i++) {
			
		//printing out the reformat	
		}System.out.println("Name: " +splat[0]+" "+splat[1]+ " Age: "+splat[2]+ " State: "+splat[3]);
	}
		//finally closing the scanner
		scan.close();
		
		
		//throwing an exception if file isn't found
		}catch (FileNotFoundException e){
			System.out.println("I can't find it");
			e.printStackTrace();
			
		}
	}
}
