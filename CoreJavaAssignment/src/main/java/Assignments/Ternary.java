package Assignments;

public class Ternary extends Driver{
//minimum of two number
		
	public void minimum() {
		int a = 77;
		int b = 17;
		//added suppressive because i don't like the yellow lines
		@SuppressWarnings("unused")
		//         test condition ? if true : if false
		String ans= (77<17) ? "The min for a is " +a : "The min for b is " +b;
		System.out.println(ans);
	}

}