import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Assignments.Array;
import Assignments.BubbleSort;
import Assignments.CommandLine;
import Assignments.DataFile;
import Assignments.EnhancedLoop;
import Assignments.Even;
import Assignments.Factorial;
import Assignments.Fibonacci;
import Assignments.Interest;
import Assignments.Mathie;
import Assignments.Palindromes;
import Assignments.Prime;
import Assignments.ReverseString;
import Assignments.SortEmployee;
import Assignments.SubClass;
import Assignments.Substring;
import Assignments.Switchie;
import Assignments.Ternary;
import Assignments.Triangle;
import Assignments.TwoFloats;

public class CJATesting {

	@Test
	public void Assignment1() {
		BubbleSort bs = new BubbleSort();
		bs.sort();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void Assignment2() {
		ReverseString rs = new ReverseString();
		rs.ReverseS();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment3() {
		Fibonacci fib = new Fibonacci();
		fib.fibonacci();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void Assignment4() {
		Factorial fact = new Factorial();
		fact.factorial();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void Assignment5() {
		Substring sub = new Substring();
		sub.stringS();
		Assert.assertTrue("I want a long string".contains("on"));
	}
	
	@Test
	public void Assignment6() {
		Even even = new Even();
		even.isEven();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment7() {
		SortEmployee se = new SortEmployee(null, null, 0);
		se.Collect();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment8() {
		Palindromes pali = new Palindromes();
		pali.dromes();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment9() {
		Prime pri = new Prime();
		pri.rePrime();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment10() {
		Ternary tern = new Ternary();
		tern.minimum();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment11() {
		TwoFloats tf = new TwoFloats();
		tf.pHop();
		Assertions.assertTrue(true);
	}	
	@Test
	public void Assignment12() {
		EnhancedLoop el = new EnhancedLoop();
		el.printEven();
		Assertions.assertTrue(true);
		
	}
	@Test
	public void Assignment13() {
		Triangle tri= new Triangle();
		tri.binary();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void Assignment14() {
		Switchie swi = new Switchie();
		swi.switching();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment15() {
		Mathie math = new Mathie();
		math.multiply();
		Assertions.assertTrue(true);
		}
	@Test
	public void Assignment16() {
		CommandLine cl = new CommandLine();
		cl.input();
		Assertions.assertTrue(true);
	}
	
	@Test
	public void Assignment17() {
		Interest inter = new Interest();
		inter.calculate();
		Assertions.assertTrue(true);
	}
	@Test
	public void Assignment18() {
	SubClass subC = new SubClass();
	subC.numOne();
	Assertions.assertTrue(true);
	}
	@Test
	public void Assignment19() {
	Array arr=new Array();
	arr.all();
	Assertions.assertTrue(true);
	}
	@Test
	public void Assignment20() {
		DataFile df = new DataFile();
		df.file();
		Assertions.assertTrue(true);
	}
	}

