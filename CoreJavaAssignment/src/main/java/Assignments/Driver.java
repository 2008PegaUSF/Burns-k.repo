package Assignments;



public class Driver {

	public static void main(String[] args) {
		
		System.out.println(".............Bubble Sort............");
		BubbleSort bs = new BubbleSort();
		bs.sort();
		System.out.println("\n");
		
		System.out.println(".............Reverse String.........");
		ReverseString rs = new ReverseString();
		rs.ReverseS();
		System.out.println("\n");
		
		System.out.println(".............Fibonacci...............");
		Fibonacci fibon = new Fibonacci();
		fibon.fibonacci();
		System.out.println("\n");
		
		System.out.println(".............Factorials..............");
		Factorial facts = new Factorial();
		facts.factorial();
		System.out.println("\n");
		
		System.out.println(".............Substring................");
		Substring sub = new Substring();
		sub.stringS();
		System.out.println("\n");
		
		System.out.println(".............Even.....................");
		Even even = new Even();
		even.isEven();
		System.out.println("\n");
		
		System.out.println("............Sort Employee..............");
		SortEmployee se = new SortEmployee(null, null, 0);
		se.Collect();
		System.out.println("\n");
		
		System.out.println("...........Palindromes..................");
		Palindromes pal = new Palindromes();
		pal.dromes();
		pal.Palin();
		System.out.println("\n");
		
		System.out.println("...............Prime.....................");
		Prime prime= new Prime();
		prime.rePrime();
		System.out.println("\n");
		
		System.out.println("...............Ternary....................");
		Ternary tern = new Ternary();
		tern.minimum();	
		System.out.println("\n");
		
		System.out.println("...............Two Floats.................");
		TwoFloats tf = new TwoFloats();
		tf.pHop();
		System.out.println("\n");
		
		System.out.println("...............Enhanced For Loop...........");
		EnhancedLoop el = new EnhancedLoop();
		el.printEven();
		System.out.println("\n");
		
		System.out.println("...............Binary Triangle..............");
		Triangle tri = new Triangle();
		tri.binary();
		System.out.println("\n");
		
		
		System.out.println("..............Switch Statements..............");
		Switchie swi = new Switchie();
		swi.switching();
		System.out.println("\n");
		
		System.out.println("...............Hard Code.....................");
		Mathie math = new Mathie();
		math.multiply();
		System.out.println("\n");
		
		System.out.println("..............Command Line....................");
		CommandLine cl = new CommandLine();
		cl.input(args);
		System.out.println("\n");
		
		
		System.out.println("..............Interest.........................");
		Interest inter = new Interest();
		inter.calculate();
		System.out.println("\n");
		
		System.out.println("..............Abstract Methods..................");
		SubClass subC = new SubClass();
		subC.numOne();
		subC.numTwo();
		subC.numThree();
		System.out.println("\n");

		
		System.out.println("..............Different Arrays...................");
		Array ar = new Array();
		ar.all();
		ar.start();
		System.out.println("\n");
		
		System.out.println("...............Data File...........................");
		DataFile df = new DataFile();
		df.file();

	}
}


