package bank;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import bankingapp.beans.Admin;


import bankingapp.beans.Customer;

import bankingapp.daoimpl.AdminDaoImpl;
import bankingapp.daoimpl.CustomersDaoImpl;

public class Prompts {

	private static final Logger log = LogManager.getLogger(Prompts.class.getName());
	public static void initialPrompt() {
		
		System.out.println("Welcome to Phoenix Bank.\n"
				+ " Press 1: To log into your account"+"      "+"Press 2: To register for a new account"
				+"\n "+"Press 3: Admin login" +"           "+"        Press 4: To exit");
		Scanner userReader = new Scanner(System.in);
		ArrayList<Object> userLoginHolder = new ArrayList<Object>(); //Holds First name, last name, Username, and password
		ArrayList<Object> adminHolder = new ArrayList<Object>();
	
		
		int errorCounter = 0;
		while (errorCounter == 0) {
			
		int numInput = userReader.nextInt();
		
			switch (numInput) {
			
			//customer login
			case 1: 
				
				System.out.println("Please input your username:");
				CustomersDaoImpl custome= new CustomersDaoImpl();
				String usern =userReader.next();
				System.out.println("Please input your password:");
				String passw =userReader.next();
		
				
				try {
					Customer person = custome.getbyUserName(usern); 
					if(person == null) {
						System.out.println("Login is not correct. Try again");
						initialPrompt();
					}
						
				} catch (SQLException e1) {
					
					
					e1.printStackTrace();
				}
				errorCounter++;
				System.out.println("*********************************************************");

				accountActionPrompt();
				break;
				
			//register for a new account	
			case 2: 
				
				CustomersDaoImpl cdi = new CustomersDaoImpl();
				System.out.println("Please input your desired username:");
				String userName = userReader.next();
				userLoginHolder.add(userName);
				System.out.println("Please input your desired password:");
				String password = userReader.next();
				userLoginHolder.add(password);
				System.out.println("What is your first name?");
				String firstName = userReader.next();
				userLoginHolder.add(firstName);
				System.out.println("What is your last name?");
				String lastName = userReader.next();
				userLoginHolder.add(lastName);
				System.out.println("What is your email?");
				String email = userReader.next();
				userLoginHolder.add(email);
				System.out.println("How much would you like to deposit");
				double balance = userReader.nextDouble();
				userLoginHolder.add(balance);
					
				
				try {
				cdi.incomingNew(firstName, lastName, userName, password, email, balance);

				}catch(SQLException e) {
					e.printStackTrace();
				}
				
				System.out.println("**Make sure you put your password in a safe place** ");
				System.out.println("\nUsername: " + userLoginHolder.get(0) + 
						"\n" + "Password: " + userLoginHolder.get(1) + 
						"\n" + "Email: " + userLoginHolder.get(4)); //Test output to console.
				
				errorCounter++;
				System.out.println("*********************************************************");

				accountMenuPrompt();
				break;
				
			//admin login prompt	
			case 3: 
				Admin admin = new Admin();
				
				System.out.println("Enter username: ");
				String user = userReader.next();
				adminHolder.add(user);
				System.out.println("Enter password: ");
				String pass= userReader.next();
				adminHolder.add(pass);
				if(admin.getUserName().equals(user) && admin.getPassword().equals(pass)) {
					System.out.println("Welcome. Thanks for signing in and taking over");
					
				}else {
					System.out.println("Those were the wrong credentials. Come back and try again. ");
					
					initialPrompt();
				}
				System.out.println("*********************************************************");

				adminMenuPrompt(admin);
				break;
				
			case 4: //Exit
				System.out.println("*********************************************************");

				System.out.println("Goodbye. Bank with us again soon.");
				System.exit(0);
			default: // Bad input catcher.
				System.out.println("Incorrect input. Please try again.");
				initialPrompt();
				break;
			}
		}
	}
	
//new account prompt

	public static void accountMenuPrompt() { 
		
		Scanner actionReader = new Scanner(System.in);	
		System.out.println("=========================================================");
		System.out.println("Welcome back to Phoenix Bank! ");
	
		
		System.out.println("Would you like to apply for a new account? (Y/N");
		String accountChoice = actionReader.next().toUpperCase();
		
		switch (accountChoice) {
		case "Y":
			
			System.out.println("Congratulation!! You're application has been submitted!"
								+"\n"+ "An email will be sent to you with our decision");
			
			System.out.println("*********************************************************");

			initialPrompt();
			break;
		case "N":
			System.out.println("*********************************************************");

			System.out.println("Thank you signing in. Hope you open up an account with us soon!");
			System.exit(0);
		default:
			System.out.println("I didn't understand your decision. Please try again.");
			accountMenuPrompt();
		}		
		
	}
		
		
	public static void accountActionPrompt() {
		Scanner actionReader = new Scanner(System.in);
		CustomersDaoImpl cdi = new CustomersDaoImpl();
		System.out.println("What service would you like to perform today?");
		System.out.println("Enter the corresponding number to perform your desired service:");
		System.out.println("1. Deposit                 ||    4. Apply for New Account");
		System.out.println("2. Withdraw                ||    5. Delete Account");
		System.out.println("3. Account Information     ||    6. Exit");
		
		System.out.println("=========================================================");

		
		int numInput = actionReader.nextInt();
		
		switch (numInput) {
		//depositing money
			case 1:
				System.out.println("How much would you like to deposit?");
				double increase=actionReader.nextDouble();
				System.out.println("Confirm your account number");
				int ac = actionReader.nextInt();
				
			try {
				System.out.println("Money was deposited into your account.");
				System.out.println("You deposited $" +increase+ " to your account");
				cdi.depositMoney(increase, ac);
				log.info("Customer successfully deposited money");
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			System.out.println("*********************************************************");

				accountActionPrompt();
				break;
				
			//withdrawing money	
			case 2:
				System.out.println("How much would you like to withdraw?");
				double decrease=actionReader.nextDouble();
				System.out.println("Confirm account number");
				int account = actionReader.nextInt();
				
			try {
				System.out.println("Money was withdrawn from you account");
				System.out.println("You withdrew $"+decrease+ " from your account");
				cdi.withdarwMoney(decrease, account);
				log.info("Customer successfully withdrew money");
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			System.out.println("*********************************************************");

				accountActionPrompt();
				break;
				
			//getting your account information
			case 3:
				System.out.println("Please confirm your Account Number");
				int num = actionReader.nextInt();
			try {
				System.out.println("Account Info:"+"\n" + cdi.getAccountInfo());
			} catch (SQLException e) {
				System.out.println("Uh Oh! Our systems must back. Try again later");
				e.printStackTrace();
			}
			System.out.println("*********************************************************");
	
			accountActionPrompt();
			break;
			
			//applying for a new account
			case 4:
				
				accountMenuPrompt();
				break;
				
				
			case 5: 
				System.out.println("What is your account number?");
				int accountNumb = actionReader.nextInt();
				
			try {
				cdi.delete(accountNumb);
				System.out.println("Account " +accountNumb+ " has been successfully deleted!");
				log.info("Customer successfully deleted their account.");
			} catch (SQLException e2) {
				System.out.println("Account does not exist.");
				e2.printStackTrace();
			}
			System.out.println("*********************************************************");
			System.out.println("We're sorry to see you leave. Hopefully we will see you soon!");
			System.exit(0);
			break;
				
				
				//signing out
			case 6:
				
				System.out.println("*********************************************************");
				System.out.println("Thank you for banking at Phoenix. Please come again");
				System.exit(0);
				break;
				
			default:
				System.out.println("I'm sorry, I didn't get that input. Try again.");
				accountActionPrompt();
				 
		}

	}
	
	
//Admin menu of goodies
	public static void adminMenuPrompt(Admin admin) {
		Scanner scan = new Scanner(System.in);
		AdminDaoImpl adi = new AdminDaoImpl();
		System.out.println("What services would you like to perform today?"+"\n"
							+"1)Delete an account " + "     2)Complete a Deposit"+"\n"
							+"3)Complete a withdraw " + "   4)Approve an Account"
							+"\n"+ "5) Create an account" +"   6)Sign out");
		int input = scan.nextInt();
		
		ArrayList<Object> adminUserHolder= new ArrayList<Object>();
		switch(input) {
		
		//Admin deleting accounts that are in violation
		case 1:
				System.out.println("What is the account number of the Customer you want to delete?");
				int accountNumb = scan.nextInt();
				
			try {
				adi.deleteAccount(accountNumb);
				System.out.println("Account " +accountNumb+ " has been successfully deleted!");
				log.info("Administrator successfully deleted a customer.");
			} catch (SQLException e2) {
				System.out.println("Account does not exist.");
				e2.printStackTrace();
			}
			System.out.println("*********************************************************");

			adminMenuPrompt(admin);
			break;
			
		//Admin crediting people account when the bank messed up	
		case 2:
			
			System.out.println("Who's account would you like to credit?");
			int account = scan.nextInt();
			System.out.println("How much would you like to credit the account?");
			double credit = scan.nextDouble();
			
			try {
				adi.editDeposit(credit, account);
				System.out.println("You credited $"+credit+ " to "+account);
				log.info("Administrator successfully credited a customer.");

			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			System.out.println("*********************************************************");

			adminMenuPrompt(admin);
			break;
			
		//Admin taking people's money 	
		case 3:
			
			System.out.println("Who's account would you like to withdraw from?");
			int ac  = scan.nextInt();
			System.out.println("How much would you like to withdraw from the account?");
			double withdraw = scan.nextDouble();
			
			try {
				adi.editWithdraw(withdraw, ac);
				System.out.println("You withdrew $"+withdraw+ " to "+ac);
				log.info("Administrator successfully withdrew from customer.");

			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			System.out.println("*********************************************************");

			adminMenuPrompt(admin);
			break;
			
		//Admin approving accounts	
		case 4:
		
			System.out.println("Which account would you like to approve?"
								+"\n"+ "Enter the account number.");
			int accountNumber = scan.nextInt();
			
			try {
				adi.approveAccount(accountNumber);
				System.out.println("The account has been approved!");
				log.info("Administrator approved an account.");

			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			System.out.println("*********************************************************");
			
			
			adminMenuPrompt(admin);
			break;
			
			
		case 5:
			System.out.println("Please input your desired username:");
			String userName = scan.next();
			adminUserHolder.add(userName);
			System.out.println("Please input your desired password:");
			String password = scan.next();
			adminUserHolder.add(password);
			System.out.println("What is your first name?");
			String firstName = scan.next();
			adminUserHolder.add(firstName);
			System.out.println("What is your last name?");
			String lastName = scan.next();
			adminUserHolder.add(lastName);
			System.out.println("What is your email?");
			String email = scan.next();
			adminUserHolder.add(email);
			System.out.println("How much would you like to deposit");
			double balance = scan.nextDouble();
			adminUserHolder.add(balance);
				
			
			try {
				System.out.println("The account has been created.");
				adi.create(firstName, lastName, userName, password, email, balance);

			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("*********************************************************");
			
			
			adminMenuPrompt(admin);
			
			break;
			
		//Admin signing out	
		case 6:
			
			System.out.println("*********************************************************");
			System.out.println("Come back soon! I don't like this power.");
			System.exit(0);
			break;
			
		
		//wrong input, start over	
		default:
			System.out.println("I'm sorry, I didn't get that input. Try again.");
			adminMenuPrompt(admin);
			
		
		}
		
	}
}

