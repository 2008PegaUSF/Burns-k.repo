package bankingapp.dao;

import java.sql.SQLException;

public interface AdminDao {

		public void approveAccount(int accountNumber) throws SQLException;
		
		public void editDeposit(double credit, int account) throws SQLException;
		
		public void editWithdraw(double withdraw, int ac) throws SQLException;
		
		public void deleteAccount(int accountNumb) throws SQLException;
		
		public void create(String firstName,String lastName,String userName, String password, String email, double balance) throws SQLException;

}
