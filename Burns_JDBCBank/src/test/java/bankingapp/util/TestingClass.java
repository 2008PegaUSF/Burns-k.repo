package bankingapp.util;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class TestingClass {

	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Starting JUnit Testing");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Initializing Test....");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Test Complete.....");
	}
	
	@Test
	@DisplayName("Are they really deleting?!?!")
	void delete() {
		int[] arr = {1,2,3,4,5};
		int[] arr2= {2,3,4};
		Assertions.assertNotEquals(arr2, arr);
	
	}
	
	@Test
	@DisplayName("Can it add?")
	void addition() {
		int num=6; 
		int balance = 900;
		int sum = balance +num;
		Assertions.assertEquals(balance+num, sum);
	}
	
	@Test
	@DisplayName("Are you logging in?")
		void logIn() {
		String username= "Fred";
		String user="Fredrick";
			if(username == user) {
				System.out.println("Login successful");
			}else {
				System.out.println("Try again");
			}
		Assertions.assertNotEquals(username,user);	
		}
	}


