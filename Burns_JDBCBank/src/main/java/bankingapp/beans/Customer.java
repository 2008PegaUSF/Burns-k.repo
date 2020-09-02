package bankingapp.beans;

import java.io.Serializable;

public class Customer implements Serializable {
	

	public static final long serialVersionUID = 1234567L;
	
	String firstName;
	String lastName;
	String userName;
	String password;
	String email;
	static double balance;
	static int accountNumber;
	int PIN;
	String approval;
	

	public Customer(String firstName,String email,String userName,String lastName,int accountNumber,double balance, String password, String approval) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		Customer.balance = balance;
		Customer.accountNumber = accountNumber;
		
		this.approval=approval;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		Customer.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		Customer.accountNumber = accountNumber;
	}

	public Customer() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		this.PIN = pIN;
	}

	@Override
	public String toString() {
		return "Customer FirstName: " + firstName 
				+"\n"+ "LastName: " + lastName 
				+"\n"+ "Username: " + userName 
				+"\n"+ "Password: " + password 
				+"\n"+ "Email: " + email 
				+"\n"+ "Balance: " + balance 
				+"\n"+ "Accountnumber: " + accountNumber 
				+"\n"+ "Pin: " + PIN;
	}
	
}
