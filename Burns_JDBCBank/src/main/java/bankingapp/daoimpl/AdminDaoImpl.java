package bankingapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bankingapp.dao.AdminDao;
import bankingapp.util.ConnFactory;

public class AdminDaoImpl implements AdminDao  {

		public static ConnFactory cf = ConnFactory.getInstance();
	
	public void approveAccount(int accountNumber) throws SQLException {
		
		Connection con= cf.getConnection();
		String sql="update \"customers\" set \"app_approval\"='Approved\' where \"account_number\"=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, accountNumber);
		ps.executeUpdate();
	}

	
	public void editDeposit(double credit, int account) throws SQLException {
		Connection con= cf.getConnection();
		String sql="update \"customers\" set \"balance\"= \"balance\" +? where \"account_number\"=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setDouble(1, credit);
		ps.setInt(2, account);
		ps.executeUpdate();
		
	}

	
	public void editWithdraw(double withdraw, int ac) throws SQLException {
		Connection con= cf.getConnection();
		String sql="update \"customers\" set \"balance\"= \"balance\" -? where \"account_number\"=?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setDouble(1, withdraw);
		ps.setInt(2, ac);
		ps.executeUpdate();
		
	}


	public void deleteAccount(int accountNumb) throws SQLException {
		Connection con= cf.getConnection();
		String sql="delete from \"customers\" where \"account_number\"=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, accountNumb);
		ps.executeUpdate();
		
	}
	
	public void create(String firstName,String lastName,String userName, String password, String email, double balance) throws SQLException {
		
		Connection con = cf.getConnection();
		String sql = "insert into \"customers\"(\"first_name\",\"email\",\"username\",\"balance\",\"last_name\",\"app_approval\")values(?,?,?,?,?,false)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, firstName);
		ps.setString(5, lastName);
		ps.setString(3, userName);
		ps.setString(2, email);
		ps.setDouble(4, balance);
		ps.executeUpdate();
	}
		
}
	
		

