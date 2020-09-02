package bankingapp.dao;

import java.sql.SQLException;


import bankingapp.beans.Customer;



public interface CustomersDao {
	
	public Customer getbyUserName(String usern) throws SQLException;
	
	public void incomingNew(String firstName,String lastName,String userName, String password, String email, double balance) throws SQLException;

	public Customer getAccountInfo() throws SQLException;
	
	public void depositMoney(double increase, int ac) throws SQLException;
	
	public void withdarwMoney(double decrease, int account) throws SQLException;
	
	public void delete(int accountNumb) throws SQLException;
}
