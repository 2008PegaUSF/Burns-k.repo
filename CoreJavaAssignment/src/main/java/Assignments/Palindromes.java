package Assignments;
import java.util.ArrayList;

public class Palindromes {
	//word array hold to original words
	//otherword hold the new words we filter out the original array
	ArrayList<String> word= new ArrayList<String>();
	ArrayList<String> otherWord= new ArrayList<String>();
	
	public void dromes() {
	//adding the words to the array
		word.add("karan");
		word.add("madam");
		word.add("tom");
		word.add("cvic");
		word.add("radar");
		word.add("jimmy");
		word.add("kayak");
		word.add("john");
		word.add("refer");
		word.add("billy");
		word.add("did");
		
		System.out.println("Regular list...." + "\n");
		System.out.print(word+"\n");
		
		
	}
	//method to find palindromes
	public void Palin() {
			for(int i=0; i<word.size(); i++) {
		//returning their index in an array
				String helper = word.get(i);
		//makes a temp variable
				StringBuilder temp = new StringBuilder(helper);
		//using the temp to call the reverse string
				temp = temp.reverse();
		//putting the it back to a string
				String repeat = temp.toString();
		//seeing if the two words equal each other
		//if they do im putting the in the otherword array
				if(helper.equals(repeat)) {
					otherWord.add(helper);
					
				}
			}	
		System.out.println("\n"+"Palindromes list...."+ "\n");
		System.out.println(otherWord);
	}	
}	
	
			